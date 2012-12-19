------ SinhVien--------------------------------------
INSERT INTO SinhVien(IDSinhVien,TenSV,NgaySinh,LopHoc,NamHoc)
    VALUES ('093581','Nguyen Thanh Tam',to_date('1991-09-05','yyyy-mm-dd'),'QL081','2008');

INSERT INTO SinhVien(IDSinhVien,TenSV,NgaySinh,LopHoc,NamHoc)  
    VALUES ('093565','Nguyen Trinh Thanh Phuc',to_date('1991-09-16','yyyy-mm-dd'),'QL081','2008');

INSERT INTO SinhVien(IDSinhVien,TenSV,NgaySinh,LopHoc,NamHoc)  
    VALUES ('093488','Le Quoc Bao',to_date('1991-01-01','yyyy-mm-dd'),'QL081','2008');

INSERT INTO SinhVien(IDSinhVien,TenSV,NgaySinh,LopHoc,NamHoc) 
    VALUES ('093527','Hoang Duy Khanh',to_date('1991-01-01','yyyy-mm-dd'),'QL081','2008');

INSERT INTO SinhVien(IDSinhVien,TenSV,NgaySinh,LopHoc,NamHoc) 
    VALUES ('070078','Tran Bao Quang',to_date('1989-06-15','yyyy-mm-dd'),'HT071','2007');


  -------------------------Mon---------------------------------------
Insert Into Mon(IDMon,TenMon)
    Values ('123','Giao Duc Cong Dan');
Insert Into Mon(IDMon,TenMon)
    Values ('456','Van Hoc');
    
--------------------------Khoa---------------------------------------
INSERT INTO Khoa(IDKhoa,TenKhoa,TruongKhoa)
  VALUES('CNTT','Cong Nghe Thong Tin','Thay Phat');
INSERT INTO Khoa(IDKhoa,TenKhoa,TruongKhoa)
  VALUES('QTKD','Quan Tri Kinh Doanh','Co Quyen');
  
----------------------LopMonHoc----------------------------------------
INSERT INTO LopMonHoc(IDLop,TenLop,ThoiGianBatDau,ThoiGianKetThuc)
    VALUES('GDCD','Lop Cong Dan',to_date('2009-01-01','yyyy-mm-dd'),to_date('2009-04-01','yyyy-mm-dd'));
INSERT INTO LopMonHoc(IDLop,TenLop,ThoiGianBatDau,ThoiGianKetThuc)
    VALUES('VH','Lop Van Hoc',to_date('2009-02-02','yyyy-mm-dd'),to_date('2009-05-01','yyyy-mm-dd'));
  
----------------------------BangDiem------------------------------------
INSERT INTO BangDiem(IDBangDiem,DiemQT,DiemHK,DiemTB)
    VALUES('A',8.43,7.34,6.37);
INSERT INTO BangDiem(IDBangDiem,DiemQT,DiemHK,DiemTB)
    VALUES('B',8.56,7.38,10.34);
INSERT INTO BangDiem(IDBangDiem,DiemQT,DiemHK,DiemTB)
    VALUES('C',10.34,10.76,10.25);
INSERT INTO BangDiem(IDBangDiem,DiemQT,DiemHK,DiemTB)
    VALUES('D',9.45,10.76,6.56);
INSERT INTO BangDiem(IDBangDiem,DiemQT,DiemHK,DiemTB)
    VALUES('E',6.36,10.65,7.56);
--------------------------------------------------------------------------------