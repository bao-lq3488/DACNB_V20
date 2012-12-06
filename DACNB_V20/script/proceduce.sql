--------- procedure of SinhVien-------------------
create procedure getAll
create procedure getbyID
create procedure InsertSinhVien(
  new_IDSinhVien SinhVien.IDSinhVien%type,
  new_TenSV SinhVien.TenSV%type,
  new_NgaySinh SinhVien.NgaySinh%type) as
    begin
    insert into SinhVien
                (IDSinhVien,TenSV,NgaySinh)
          values('012345', 'Sieu Nhan Gao',to_date('1990/09/05','YYYY/MM/DD') );
    end InsertSinhVien;
          
create procedure UpdateSinhVien(
update_IDSinhVien SinhVien.IDSinhVien%type)as 

  begin
    update from SinhVien
    where IDSinhVien = update_IDSinhVien;
  end UpdateSinhVien;
  grant execute on UpdateSinhVien to QLSV;
;
create procedure DeleteSinhVien(
delete_IDSinhVien SinhVien.IDSinhVien%type)as 
  begin
    delete from SinhVien
    where IDSinhVien = delete_IDSinhVien;
  end DeleteSinhVien;
  grant execute on DeleteSinhVien to QLSV;
;

-------------procedure of Mon-----------------
create procedure getAll
create procedure getbyID
create procedure InsertMon
create procedure UpdateMon(
update_IDMon Mon.IDMon%type)as 
  begin
    update from Mon
    where IDMon = update_IDMon;
  end UpdateMon;
  grant execute on UpdateMon to QLSV;
;
create procedure DeleteMon(
delete_IDMon Mon.IDMon%type)as 
  begin
    delete from Mon
    where IDMon = delete_IDMon;
  end DeleteMon;
  grant execute on DeleteMon to QLSV;
;
-------------procedure of Khoa-----------------
create procedure getAll
create procedure getbyID
create procedure InsertKhoa
create procedure UpdateKhoa(
update_IDKhoa Khoa.IDKhoa%type)as 
  begin
    update from Khoa
    where IDKhoa = update_IDKhoa;
  end UpdateKhoa;
  grant execute on UpdateKhoa to QLSV;
;
create procedure DeleteKhoa(
delete_IDKhoa Khoa.IDKhoa%type)as 
  begin
    delete from Khoa
    where IDKhoa = delete_IDKhoa;
  end DeleteKhoa;
  grant execute on DeleteKhoa to QLSV;
;
-------------procedure of Nganh-----------------
create procedure getAll
create procedure getbyID
create procedure InsertNganh
create procedure UpdateNganh(
update_IDNganh Nganh.IDNganh%type)as 
  begin
    update from Nganh
    where IDNganh = update_IDNganh;
  end UpdateNganh;
  grant execute on UpdateNganh to QLSV;
;
create procedure DeleteNganh(
delete_IDNganh Nganh.IDNganh%type)as 
  begin
    delete from Nganh
    where IDNganh = delete_IDNganh;
  end DeleteNganh;
  grant execute on DeleteNganh to QLSV;
;
-------------procedure of Diem-----------------
