CREATE TYPE SinhVien_O AS OBJECT(
  IDSinhVien varchar(10),
  TenSV varchar(50),
--  NgaySinh date,
--  DiaChi varchar(200),
--  KhoaHoc varchar(10),
--  Lop varchar(10),
--  Nganh varchar(50)
  member function 
  get_inforSV return varchar
) not final
create 
create type NgaySinh_O as object(
thu varchar(20),
ngay date,
thang date,
nam year 
);
--CREATE TYPE SinhVien1 AS TABLE OF SinhVien;
create table SinhVien of SinhVien_O(
  IDSinhVien not null,
  primary key (IDSinhVien)
  NgaySinh NgaySinh_T
);
create type SinhVien_in_term under SinhVien_O(

);
create type SinhVien_put_term under SinhVien_O(

);
--create table SinhVien3(
--  SinhVienHS SinhVien
--);

create type Khoa_O as object(
  IDKhoa varchar(10),
  TenKhoa varchar(50),
  TruongKhoa varchar(50),
  Mon_Khoa ref Mon_O
  member function
  get_inforK return varchar
);
--create type Khoa1 as table of Khoa;
create table Khoa of Khoa_O(
  IDKhoa not null,
  primary key(IDKhoa)
);
--create table Khoa3(
--  KhoaHS Khoa
--);

create type Nganh_O as object(
  IDNganh varchar(10),
  TenNganh varchar(50),
  SinhVien_Nganh ref SinhVien_O
);
--create type Nganh1 as table of Nganh;
create table Nganh of Nganh_O(
  IDNganh not null,
  primary key (IDNganh),
--  foreign key (IDSinhVien) reference SinhVien2(IDSinhVien)
);
--create table Nganh3(
--  NganhHS Nganh
--);

create type Mon_O as object(
  IDMon varchar(10),
  TenMon varchar(50),
  Mon_Diem ref Diem_O
)not final
--create type Mon1 as table of Mon;
create table Mon of Mon(
  IDMon not null,
  primary key (IDMon),
 -- foreign key (IDKhoa) reference Khoa(IDKhoa),
 -- foreign key (IDSinhVien) reference SinhVien(IDSinhVien),
);
create type Mon_in_term under Mon_O(

);
create type Mon_out_term under Mon_O(

);
--create table Mon3(
--  MonHS Mon
--);

create type Diem as object(
  IDMon varchar(10),
  DiemQT float,
  DiemHK float,
  DiemTB float
);
--create type Diem1 as table of Diem;
create table Diem2 of Diem(
  IDMon not null,
  primary key (IDMon),
 -- foreign key (IDMon) reference Mon(IDMon)
);
--create table Diem3(
--  DiemHS Diem,
);

create type ThoiGianHoc_O as object(
  HocKy varchar(20),
  ThoiGianBatDau date,
  ThoiGianKetThuc date,
  GioHoc time
);
------------Lop: moi sinh vien co mot lop duy nhat , trong lop co tong cac mon hoc co dinh, tuy thuoc vao khoa va nganh hoc. --------------------
create type Lop_O as object(
  IDLop varchat(20),
  TenLop varchar(20),
  ThoiGianHoc ThoiGianHoc_O
)not final
create table Lop of Lop_O(
  IDLop not final,
  primary key (IDLop),
);
create table SinhVien_Mon(
  sinhvienM ref SinhVien,
  monM ref Mon
);
create table SinhVien_Lop(
  SinhVienL ref SinhVien,
  LopL ref Lop
);
commit;

----------- 
