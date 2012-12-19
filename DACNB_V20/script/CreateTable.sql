

CREATE TABLE SinhVien(
  IDSinhVien varchar2(10),
  TenSV varchar2(50),
  NgaySinh date,
  DiaChi varchar2(200),
  KhoaHoc varchar2(10),
  Lop varchar2(10),
  Nganh varchar(50)
  )


create table Khoa(
  IDKhoa varchar2(10),
  TenKhoa varchar2(50),
  IDMon varchar2(10),
  TruongKhoa varchar2(50)
)

create table nganh(
  IDNganh varchar2(10),
  TenNganh varchar2(50),
  IDSinhVien VARCHAR2(10)
)

create table Mon(
  IDMon varchar2(10),
  TenMon varchar2(50),
  IDSINHVIEN VARCHAR2(10),
  IDKhoa Varchar2(10)
)

create table Diem(
  IDDiem varchar2(10),
  IDMon varchar2(10),
  DiemQT float,
  DiemHK float,
  DiemTB float
)

commit;
  