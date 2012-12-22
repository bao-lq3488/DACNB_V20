CREATE TYPE SinhVien_O AS OBJECT(
  IDSinhVien varchar2(10),
  TenSinhVien varchar2(50),
  NgaySinh date,
  DiaChi varchar2(50),
  Status varchar2(100),
  IDLop varchar2 (20),
  DateJoin varchar2(10),
  DateEnd varchar2(10),
  
  member procedure proc_getbyID (p_IDSinhVien in varchar2,p_TenSV out varchar2,p_NgaySinh out date,p_DiaChi out varchar2,p_Status out varchar2,p_IDLop out varchar2,p_DateJoin out varchar2,p_DateEnd out varchar2),
  member procedure proc_InsertSinhVien (p_IDSinhVien in varchar2,p_TenSV in varchar2,p_NgaySinh in date,p_DiaChi in varchar2,p_Status in varchar2,p_IDLop in varchar2,p_DateJoin in varchar2,p_DateEnd in varchar2),
  member procedure proc_UpdateSinhVien (p_IDSinhVien in varchar2,p_TenSV in varchar2,p_NgaySinh in date,p_DiaChi in varchar2,p_Status in varchar2,p_IDLop in varchar2,p_DateJoin in varchar2,p_DateEnd in varchar2),
  member procedure proc_DeleteSinhVien (p_IDSinhVien in varchar2)
);
/
create table SinhVien of SinhVien_O(
  IDSinhVien not null,
  primary key (IDSinhVien)
);

create type Khoa_O as object(
  IDKhoa varchar2(10),
  TenKhoa varchar2(50),
  TruongKhoa varchar2(50),
  Mon_Khoa ref Mon_O,
  member procedure proc_getbyID (p_IDKhoa in varchar2,p_TenKhoa out varchar2,p_TruongKhoa out varchar2),
  member procedure proc_InsertKhoa (p_IDKhoa in varchar2,p_TenKhoa in varchar2,p_TruongKhoa in varchar2),
  member procedure proc_UpdateKhoa (p_IDKhoa in varchar2,p_TenKhoa in varchar2,p_TruongKhoa in varchar2),
  member procedure proc_DeleteKhoa (p_IDKhoa in varchar2)
);
/
--create type Khoa1 as table of Khoa;
create table Khoa of Khoa_O(
  IDKhoa not null,
  primary key(IDKhoa)
);


create type Mon_O as object(
  IDMon varchar2(10),
  TenMon varchar2(50),
  Mon_Diem ref BangDiem_O,
  member procedure proc_getbyID (p_IDMon in varchar2,p_TenMon out varchar2),
  member procedure proc_InsertMon (p_IDMon in varchar2,p_TenMon in varchar2),
  member procedure proc_UpdateMon (p_IDMon in varchar2,p_TenMon in varchar2),
  member procedure proc_DeleleMon (p_IDMon in varchar2)
);
/
--create type Mon1 as table of Mon;
    create table Mon of Mon_O( 
  IDMon not null,
  primary key (IDMon)

);

create type BangDiem_O as object(
  IDBangDiem varchar2(10),
  DiemQT float(5),
  DiemHK float(5),
  DiemTB float(5),
  member procedure proc_getbyID (p_IDBangDiem in varchar2,p_DiemQT out float(5),p_DiemHK out float(5), p_DiemTB out float(5)),
  member procedure proc_InsertBangDiem (p_IDBangDiem in varchar2,p_,p_DiemQT in float(5),p_DiemHK in float(5), p_DiemTB in float(5)),
  member procedure proc_UpdateBangDiem (p_IDBangDiem in varchar2,p_D,p_DiemQT in float(5),p_DiemHK in float(5), p_DiemTB in float(5)),
  member procedure proc_DeleteBangDiem (p_IDBangDiem in varchar2)
);
/
--create type Diem1 as table of Diem;
    create table BangDiem of BangDiem_O;


---------------Lop: moi sinh vien co mot lop duy nhat , trong lop co tong cac mon hoc co dinh, tuy thuoc vao khoa va nganh hoc. --------------------
create type LopMonHoc_O as object(
  IDLop varchar2(20),
  TenLop varchar2(20),
  ThoiGianBatDau date,
  ThoiGianKetThuc date,
  member procedure proc_getbyID (p_IDLop in varchar2,p_TenLop out varchar2,p_ThoiGianBatDau out date,p_ThoiGianKetThuc out date),
  member procedure proc_InsertLopMonHoc (p_IDLop in varchar2,p_TenLop in varchar2,p_ThoiGianBatDau in date,p_ThoiGianKetThuc in date),
  member procedure proc_UpdateLopMonHoc (p_IDLop in varchar2,p_TenLop in varchar2,p_ThoiGianBatDau in date,p_ThoiGianKetThuc in date),
  member procedure proc_DeleteLopMonHoc (p_IDLop in varchar2)
);
/
create table LopMonHoc of LopMonHoc_O(
  IDLop not null,
  primary key (IDLop)
);

------------------------------
create table SinhVien_Mon(
  sinhvienM ref SinhVien_O,
  monM ref Mon_O
);

create table SinhVien_LopMonHoc(
  SinhVienL ref SinhVien_O,
  LopL ref LopMonHoc_O
);

-----------------------------
commit;

