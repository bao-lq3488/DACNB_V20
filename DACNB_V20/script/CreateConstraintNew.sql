/*-----------------Table SinhVien----------------*/
alter table SINHVIEN add constraint SinhVien_idsinhvien_pk primary key (IDSinhVien);
alter table SINHVIEN add constraint SINHVIEN_IDSINHVIEN_UNI UNIQUE (IDSINHVIEN);
alter table SINHVIEN add constraint SINHVIEN_Idlop_fk foreign key (IDlop) references LOP(IDLOP);  

/*-----------------Table Lop-------------------*/
alter table LOP add constraint Lop_idlop_pk primary key (IDLOP);
alter table LOP add constraint LOP_IDKHOA_fk foreign key (IDKHOA) references KHOA(IDKHOA);

/*-----------------Table KHOA----------------*/
alter table KHOA add constraint Khoa_idkhoa_pk primary key (IDKHOA);

  
  commit;