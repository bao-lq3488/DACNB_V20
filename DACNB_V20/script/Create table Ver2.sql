CREATE TYPE SinhVien AS OBJECT(
  IDSinhVien varchar(10),
  TenSV varchar(50),
  NgaySinh date,
  DiaChi varchar(200),
  KhoaHoc varchar(10),
  Lop varchar(10),
  Nganh varchar(50)
)
CREATE TYPEe SinhVien1 AS TABLE OF SinhVien;
create table SinhVien2 of SinhVien(
  IDSinhVien not null,
  primary key (IDSinhVien)
);
create table SinhVien3(
  SinhVienHS SinhVien
  ...ref...
);

create type Khoa as object(
  IDKhoa varchar(10),
  TenKhoa varchar(50),
  TruongKhoa varchar(50)
);
create type Khoa1 as table of Khoa;
create table Khoa2 of Khoa(
  IDKhoa not null,
  primary key(IDKhoa)
);
create table Khoa3(
  KhoaHS Khoa
...ref...
);

create Nganh as object(
  IDNganh varchar(10),
  TenNganh varchar(50),
);
create type Nganh1 as table of Nganh;
create table Nganh2 of Nganh(
  IDNganh not null,
  primary key (IDNganh),
  foreign key (IDSinhVien) reference SinhVien2(IDSinhVien)
);
create table Nganh3(
  NganhHS Nganh
  ...ref...
);

create type Mon as object(
  IDMon varchar(10),
  TenMon varchar(50),
);
create type Mon1 as table of Mon;
create table Mon2 of Mon(
  IDMon not null,
  primary key (IDMon),
  foreign key (IDKhoa) reference Khoa(IDKhoa),
  foreign key (IDSinhVien) reference SinhVien(IDSinhVien),
);
create table Mon3(
  MonHS Mon
  ...ref...
);

create type Diem as object(
  IDMon varchar(10),
  DiemQT float,
  DiemHK float,
  DiemTB float
);
create type Diem1 as table of Diem;
create table Diem2 of Diem(
  IDMon not null,
  primary key (IDMon),
  foreign key (IDMon) reference Mon(IDMon)
);
create table Diem3(
  DiemHS Diem,
  ...ref...
);
commit;