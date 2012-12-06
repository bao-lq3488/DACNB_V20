------ SinhVien--------------------------------------
INSERT INTO SinhVien(SinhVien_O(IDSinhVien,TenSV,NgaySinh))
  VALUES ('093581','Nguyen Thanh Tam',to_date('1991/09/05','YYYY/MM/DD'),'HCM','2009','QL091A','CNTT'));
INSERT INTO SinhVien  
  VALUES (SinhVien_O('093565','Nguyen Trinh Thanh Phuc',to_date('1991/09/16','YYYY/MM/DD'),'BIEN HOA','2009','QL091A','CNTT'));
INSERT INTO SinhVien  
  VALUES (SinhVien_O('093488','Le Quoc Bao',to_date('1991/01/01','YYYY/MM/DD'),'HCM','2009','QL091A','CNTT'));
INSERT INTO SinhVien 
  VALUES (SinhVien_O('093527','Hoang Duy Khanh',to_date('1991/01/01','YYYY/MM/DD'),'HCM','2009','QL091A','CNTT'));
INSERT INTO SinhVien 
  VALUES (SinhVien_O('070078','Tran Bao Quang',to_date('1989/06/15','YYYY/MM/DD'),'HCM','2007','HT071','CNTT'));
INSERT INTO SinhVien_in_Course(LopHoc,NamHoc)
  VALUES('QL071','2007');
INSERT INTO SinhVien_in_Course(LopHoc,NamHoc)
  VALUES('QL081','2008');
INSERT INTO SinhVien_in_Course(LopHoc,NamHoc)
  VALUES('QL091','2009');
INSERT INTO SinhVien_in_Course(LopHoc,NamHoc)
  VALUES('HT071','2007');
INSERT INTO SinhVien_in_Course(LopHoc,NamHoc)
  VALUES('HT081','2008');
INSERT INTO SinhVien_in_Course(LopHoc,NamHoc)
  VALUES('HT091','2009');

  -------------------------Mon---------------------------------------
Insert Into Mon(IDMon,TenMon)
    Values ('123','Giao Duc Cong Dan');
Insert Into Mon(IDMon,TenMon)
    Values ('456','Van Hoc');
--------------------------Khoa---------------------------------------
INSERT INTO Khoa(Khoa_O(IDKhoa,TenKhoa,TruongKhoa))
  VALUES(Khoa_O('CNTT','Cong Nghe Thong Tin','Thay Phat'));
INSERT INTO Khoa(Khoa_O(IDKhoa,TenKhoa,TruongKhoa))
  VALUES(Khoa_O('QTKD','Quan Tri Kinh Doanh','Co Quyen'));
----------------------LopMonHoc----------------------------------------
INSERT INTO LopMonHoc(LopMonHoc_O(IDLop,TenLop,ThoiGianHoc_O(ThoiGianHoc_O(HocKy,ThoiGianBatDau,ThoiGianKetThuc,GioHoc)))
  VALUES(LopMonHoc_O('GDCD','Lop Giao Duc Cong Dan',ThoiGianHoc_O('2','2007','2008','5 gio sang')));
INSERT INTO LopMonHoc(LopMonHoc_O(IDLop,TenLop,ThoiGianHoc_O(ThoiGianHoc_O(HocKy,ThoiGianBatDau,ThoiGianKetThuc,GioHoc)))
  VALUES(LopMonHoc_O('VH','Lop Van Hoc',ThoiGianHoc_O('2','2007','2008','10 gio toi')));
----------------------------------------------------------------