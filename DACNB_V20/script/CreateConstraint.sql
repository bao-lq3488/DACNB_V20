use QuanLySinhVien
/*-----------------Table SinhVien----------------*/
alter table SINHVIEN add constraint SinhVien_idsinhvien_pk primary key (IDSinhVien);
alter table SINHVIEN add constraint SINHVIEN_IDSINHVIEN_UNI UNIQUE (IDSINHVIEN);

/*-------------------TABLE MON-----------------*/
alter table MON add constraint MON_idmon_pk primary key (IDMON);
alter table MON add constraint MON_idsinhvien_fk foreign key (IDSINHVIEN) references SINHVIEN(IDSINHVIEN);
alter table MON Add constraint MON_IDkhoa_fk foreign key (IDKhoa) references Khoa(IDKHOA);
alter table MON add constraint MON_idMon_UNI UNIQUE (IDMON);

/*--------------------TABLE NGANH---------------*/
alter table NGANH add constraint Nganh_idnganh_pk primary key (IDNGANH);
alter table NGANH add constraint Nganh_idnganh_uni unique (IDNGANH)
alter table NGANH ADD constraint Nganh_idsinhvien_fk foreign key (IDSINHVIEN) references SINHVIEN(IDSINHVIEN);

/*-------------------TABLE KHOA-------------------------*/
alter table KHOA add constraint khoa_idkhoa_pk primary key (IDKHOA);
alter table KHOA add constraint khoa_idkhoa_uni unique (idkhoa);

/*---------------------TABLE DIEM--------------------------*/
alter table DIEM add constraint DIEM_iddiem_pk primary key (IDDIEM);
alter table DIEM add constraint DIEM_iddiem_uni unique (IDDIEM);
alter table DIEM ADD constraint DIEM_idmon_fk foreign key (idmon) references MON(idmon);

/*rename nganh -> IDNganh table sinhvien*/
alter table sinhvien add column nganh to idnganh;



commit;