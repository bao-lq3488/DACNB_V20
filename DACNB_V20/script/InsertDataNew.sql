/*------------SINHVIEN-------------*/
INSERT INTO SinhVien (IDSINHVIEN,TENSinhVien,NGAYSINH,DIACHI,status,idLOP,datejoin,dateend)
  VALUES ('093581','Nguyen Thanh Tam',to_date('1991/09/05','YYYY/MM/DD'),'HCM','DANG HOC','QL091A','2009','2012');
INSERT INTO SinhVien (IDSINHVIEN,TENSinhVien,NGAYSINH,DIACHI,status,idLOP,datejoin,dateend) 
  VALUES ('093565','Nguyen Trinh Thanh Phuc',to_date('1991/09/16','YYYY/MM/DD'),'BIEN HOA','DANG HOC','QL091A','2009','2012');
INSERT INTO SinhVien (IDSINHVIEN,TENSinhVien,NGAYSINH,DIACHI,status,idLOP,datejoin,dateend) 
  VALUES ('093488','Le Quoc Bao',to_date('1991/01/01','YYYY/MM/DD'),'HCM','DANG HOC','QL091A','2009','2012');
INSERT INTO SinhVien (IDSINHVIEN,TENSinhVien,NGAYSINH,DIACHI,status,idLOP,datejoin,dateend) 
  VALUES ('093527','Hoang Duy Khanh',to_date('1991/01/01','YYYY/MM/DD'),'HCM','DANG HOC','QL091A','2009','2012');
  
/*------------LOP----------------*/
INSERT INTO LOP (IDlop,Tenlop,IDkhoa)
  values ('QL091A','Cong Nghe Phan Mem Khoa 2009','KHCN');
  
/*-----------KHOA-------*/
INSERT INTO KHOA (IDkhoa,Tenkhoa)
  values ('KHCN','Khoa Hoc Cong Nghe');

  
  
  commit;