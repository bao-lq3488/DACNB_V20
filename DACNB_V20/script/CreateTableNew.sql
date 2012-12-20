create table SinhVien(
  IDsinhvien varchar2(10),
  Tensinhvien varchar2(50),
  NgaySinh date,
  DiaChi varchar2(200),
  Status varchar2(50),
  IDlop varchar2(10),
  Datejoin varchar2(5),
  Dateend varchar2(5)
  );
  
create table Khoa(
  IDkhoa varchar2(10),
  Tenkhoa varchar2(50)
  );
create table Lop(
  IDlop varchar2(10),
  Tenlop varchar2(50),
  IDkhoa varchar2(10)
  );

commit;