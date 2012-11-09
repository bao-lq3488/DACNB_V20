create type SinhVien as object(
  IDSinhVien varchar(10),
  TenSV varchar(50),
  NgaySinh date,
  DiaChi varchar(200),
  KhoaHoc varchar(10),
  Lop varchar(10),
  Nganh varchar(50)
);
create type SinhVien_B as table of SinhVien;
create table SinhVien_HS(
SinhVienHS SinhVien
);

create type Khoa as object(
  IDKhoa varchar(10),
  TenKhoa varchar(50),
  IDMon varchar(10),
  TruongKhoa varchar(50)
);
create type Khoa_B as table of Khoa;

create Nganh as object(
  IDNganh varchar(10),
  TenNganh varchar(50),
  IDSinhVien VARCHAR(10)
);
create type Nganh_B as table of Nganh;

create type Mon as object(
IDMon varchar(10),
  TenMon varchar(50),
  IDSinhVien VARCHAR(10),
  IDKhoa Varchar(10)
);
create type Mon_B as table of Mon;

create type Diem as object(
IDDiem varchar(10),
  IDMon varchar(10),
  DiemQT float,
  DiemHK float,
  DiemTB float
);
create type Diem_B as table of Diem;