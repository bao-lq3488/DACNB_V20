CREATE TYPE SinhVien_O AS OBJECT(
  IDSinhVien varchar(10),
  TenSV varchar(50),
--  NgaySinh date,
--  DiaChi varchar(200),
--  KhoaHoc varchar(10),
--  Lop varchar(10),
--  Nganh varchar(50)
constructor function SinhVien_O(IDSinhVien varchar) return self as result
  member function 
  get_inforSV return varchar
) not final;

----------create type body... la chi dinh attribute nao cua object duoc su dung de dang nhap ? ----------
create type body SinhVien_O is 
  constructor function SinhVien_O(IDSinhVien varchar) return self as result
  is external IDSinhVien "093488"
  end;
  
grant select on SinhVien_O to user1 --- user1 ?-----

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

create type Khoa_O as object(
  IDKhoa varchar(10),
  TenKhoa varchar(50),
  TruongKhoa varchar(50),
  Mon_Khoa ref Mon_O
constructor function Khoa_O(IDKhoa varchar) return self as result
  member function 
  get_inforSV return varchar
);

create type body SinhVien_O is member procedure
  constructor function Khoa_O(IDKhoa varchar) return self as result
  is external IDKhoa "093488"
  end;
  
grant select on Khoa_O to user2 --- user1 ?-----
--create type Khoa1 as table of Khoa;
create table Khoa of Khoa_O(
  IDKhoa not null,
  primary key(IDKhoa)
);

create type Nganh_O as object(
  IDNganh varchar(10),
  TenNganh varchar(50),
  SinhVien_Nganh ref SinhVien_O
);
--create type Nganh1 as table of Nganh;
create table Nganh of Nganh_O(
  IDNganh not null,
  primary key (IDNganh),

);

create type Mon_O as object(
  IDMon varchar(10),
  TenMon varchar(50),
  Mon_Diem ref Diem_O
)not final;
--create type Mon1 as table of Mon;
create table Mon of Mon(
  IDMon not null,
  primary key (IDMon),
);
create type Mon_in_term under Mon_O(

);
create type Mon_out_term under Mon_O(

);

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
)not final;
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
