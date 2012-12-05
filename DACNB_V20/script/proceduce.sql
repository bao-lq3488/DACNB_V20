--------- procedure of SinhVien-------------------
create procedure proc_getAll
create procedure proc_getbyID
  (
    p_IDSinhVien    in SinhVien.IDSinhVien   ,
    p_TenSV         out SinhVien.TenSV        ,
    p_NgaySinh    out SinhVien.NgaySinh       ,
    p_HocKy       out SinhVien.HocKy          ,
    p_NamHoc      out SinhVien.NamHoc   
  )
  as
  begin
      select
            TenSV         ,
            NgaySinh      ,
            LopHoc        ,
            NamHoc        
      from 
            SinhVien
      where
            IDSinhVien = p_IDSinhVien  ;
    exception
        when others then
              Raise_Application_Error (
              -20001,p_IDSinhVien ||':$:'|| SQLERM, True);
    end proc_getbyID;
    grant execute on proc_getbyID to user1;
    
create procedure proc_InsertSinhVien
  (
    p_IDSinhVien in SinhVien.IDSinhVien ,
    p_TenSV      in SinhVien.TenSV      ,
    p_NgaySinh   in SinhVien.NgaySinh   ,
    p_HocKy      in SinhVien.HocKy      ,
    p_NamHoc     in SinhVien.NamHoc
  )
  as
  begin
    insert into SinhVien
      (
        IDSinhVien ,
        TenSV      ,
        NgaySinh   ,
        HocKy      ,
        NamHoc     
      )
    values
      (
        p_IDSinhVien ,
        p_TenSV      ,
        p_NgaySinh   ,
        p_HocKy      ,
        p_NamHoc
      )
    commit;
  exception
    when others then
      rollback;
end proc_InsertSinhVien;
  grant execute in proc_InsertSinhVien to user1;
          
create procedure UpdateSinhVien(
  p_IDSinhVien in SinhVien.IDSinhVien%type,
  p_TenSV      in SinhVien.TenSV%type,
  p_NgaySinh   in SinhVien.NgaySinh%type,
  p_HocKy      in SinhVien.HocKy%type,
  p_NamHoc     in SinhVien.NamHoc%type)
    as
    begin
    update SinhVien
     set 
      TenSV     = p_TenSV,
      NgaySinh  = p_NgaySinh,
      HocKy     = p_HocKy,
      NamHoc    = p_NamHoc
     where 
      IDSinhVien = p_IDSinhVien
    ;
   commit;
   exception 
    when others then
        RAISE_APPLICATION_ERROR (070078,
          p_IDSinhVien     || ':$:' ||
          p_TenSV          || ':$:' ||
          p_NgaySinh       || ':$:' ||
          p_HocKy          || ':$:' ||
          p_NamHoc         || ':$:' ||
          SQLERM, true) ;
      
   end proc_UpdateSinhVien;
   grant execute on proc_UpdateSinhVien to user1;
   
create procedure proc_DeleteSinhVien(
  p_IDSinhVien  in SinhVien.IDSinhVien%type,)
    as 
    begin
     delete from SinhVien
            where IDSinhVien = delete_IDSinhVien;
  end proc_DeleteSinhVien;
  grant execute on proc_DeleteSinhVien to user1;
;

-------------procedure of Mon-----------------
create procedure getAll
create procedure getbyID
  {
  p_IDMon   in Mon.IDMon   ,
  p_TenMon  out Mon.TenMon 
  }
  as
  begin
      select
            TenMon
      from 
            Mon
      where
            IDMon = p_TenMon;
    exception
        when others then
            Raise_Application_Error( -20001,
                                    p_IDMon ||':$:'|| SQLERM, True);
  end proc_getbyID;
  grant execute on  proc_getbyID to user1;
create procedure InsertMon
  (
    p_IDMon    in Mon.IDMon   ,
    p_TenMon   in Mon.TenMon  
  )
  as
  begin 
      insert into Mon
                    (
                      IDMon  ,
                      TenMon
                    )
                  Values
                    (
                      p_IDMon  ,
                      p_TenMon
                    )
                  commit;
              exception
                when others then
                    Raise_Application_Error (-20001,
                                            p_IDMon   ||':$:'||
                                            p_TenMon  ||':$:'||
                                            SQLERM, True );
          end proc_InsertMon;
        grant execute on proc_InsertMon to user1;
        
create procedure UpdateMon(
  p_IDMon   in Mon.IDMon%type,
  p_TenMon  in Mon.TenMon%type)
    as
    begin
      update Mon
      set 
          TenMon = p_TenMon
      where 
          IDMon = p_IDMon
    ;
   commit;
   exception 
    when others then
        rollback;
      
   end proc_UpdateMon;
   grant execute on proc_UpdateMon to user1;
create procedure DeleteMon
  (
    delete_IDMon Mon.IDMon%type
  )as 
  begin
    delete from Mon
    where IDMon = delete_IDMon;
  end DeleteMon;
  grant execute on DeleteMon to user1;
;
-------------procedure of Khoa-----------------
create procedure getAll
create procedure getbyID
  (
    p_IDKhoa     in  Khoa.IDKhoa   ,
    p_TenKhoa    out Khoa.TenKhoa  ,
    p_TruongKhoa out Khoa.TruongKhoa
  )as
    begin
        select 
            TenKhoa  ,
            TruongKhoa
        into
            p_TenKhoa ,
            p_TruongKhoa
        from 
            Khoa
        where 
            IDKhoa = p_IDKhoa ;
      exception 
            when others then Raise_Application_Eoor (-20001,
                                                    p_IDKhoa  ||':%:'||
                                                    SQLERM, True);
      end proc_getbyID;
      grant execute on proc_getbyID to user1;
      
create procedure proc_InsertKhoa
  (
    p_IDKhoa      in Khoa.IDKhoa  ,
    p_TenKhoa     in Khoa.TenKhoa ,
    p_TruongKhoa  in Khoa.TruongKhoa
  )as
  begin
      INSERT INTO Khoa
                  (
                    IDKhoa  ,
                    TenKhoa ,
                    TruongKhoa 
                  )
      Values
                  (
                    p_IDKhoa    ,
                    p_TenKhoa   ,
                    p_TruongKhoa
                  )
      commit;
      exception
             when others then
                Raise_Application_Error (-20001,
                                        p_IDKhoa      || ':$:' ||
                                        p_TenKhoa     || ':$:' ||
                                        p_TruongKHoa  || ':$:' ||
                                        SQLERM, True);
    end proc_InsertKhoa;
    grant execute on proc_InsertKhoa to user1;
  
create procedure proc_UpdateKhoa
  (
    p_IDKhoa      in Khoa.IDKhoa%type,
    p_TenKhoa     in Khoa.TenKhoa%type,
    p_TruongKhoa  in Khoa.TruongKhoa%type
  )
  as 
  begin
    update Khoa 
      set 
        TenKhoa       = p_TenKhoa   ,
        TruongKhoa    = p_TruongKhoa
    where 
        IDKhoa      = p_IDKhoa  ;
    commit;
    exception others then
          rollback;
  end proc_UpdateKhoa;
  grant execute on proc_UpdateKhoa to user1;
          
create procedure proc_DeleteKhoa 
  (
    p_IDKhoa  in Khoa.IDKhoa%type
  )as 
  begin
    delete from 
              Khoa
           where
              IDKhoa = p_IDKhoa;
  end proc_DeleteKhoa;
  grant execute on proc_DeleteKhoa to user1;
;
/*-------------procedure of Nganh-----------------
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
*/
-------------procedure of BangDiem-----------------
create procedure getAll
create procedure getbyID
  (
    p_IDMon          in  BangDiem.Mon.IDMon  ,
    p_IDSinhVien     in BangDiem.SinhVien.IDSinhVien  ,
    p_DiemQT          out BangDiem.DiemQT  ,
    p_DiemHK          out BangDiem.DiemHK  ,
    p_DiemTB          out BangDiem.DiemTB  ,
  )as
    begin
        select 
            DiemQT  ,
            DiemHK  ,
            DiemTB
        into
            p_DiemQT  ,
            p_DiemHK  ,
            p_DiemTB  ,
        from 
            BangDiem, Mon, SinhVien
        where 
            BangDiem.Mon.IDMon = BangDiem.Mon.p_IDMon
          and
            BangDiem.SinhVien.IDSinhVien = BangDiem.SinhVien.p_IDSinhVien;
      exception 
            when others then Raise_Application_Eoor (-20001,
                                                    p_IDMon      ||':%:'||
                                                    p_IDSinhVien ||':%:'||
                                                    SQLERM, True);
      end proc_getbyID;
      grant execute on proc_getbyID to user1;
      
create procedure proc_InsertBangDiem
  (
    p_IDMon          in BangDiem.Mon.IDMon               ,
    p_IDSinhVien     in BangDiem.SinhVien.IDSinhVien     ,
    p_DiemQT         in BangDiem.DiemQT                  ,
    p_DiemHK         in BangDiem.DiemHK                  ,
    p_DiemTB         in BangDiem.DiemTB
  )as
  begin
      INSERT INTO BangDiem
                  (
                    IDMon         ,
                    IDSinhVien    ,
                    DiemQT        ,
                    DiemHK        ,
                    DiemTB
                  )
      Values
                  (
                    p_IDMon        ,
                    p_IDSinhVien   ,
                    p_DiemQT       ,
                    p_DiemHK       ,
                    p_DiemTB
                  )
      commit;
      exception
             when others then
                Raise_Application_Error (-20001,
                                        p_IDMon        || ':$:' ||
                                        p_IDSinhVien   || ':$:' ||
                                        p_DiemQT       || ':$:' ||
                                        p_DiemHK       ||':%:'||
                                        p_DiemTB       ||':%:'||
                                        SQLERM, True);
    end proc_InsertBangDiem;
    grant execute on proc_InsertBangDiem to user1;
  
create procedure proc_UpdateBangDiem
  (
    p_IDMon           in BangDiem.Mon.IDMon%type,
    p_IDSinhVien      in BangDiem.SinhVien.IDSinhVien%type,
    p_DiemQT          in BangDiem.DiemQT%type,
    p_DiemHK           in BangDiem.DiemHK%type ,
    p_DiemTB           in BangDiem.DiemTB%type
  )
  as 
  begin
    update BangDiem 
      set 
        DiemQT  = p_DiemQT  ,
        DiemHK  = p_DiemHK  ,
        DiemTB  = p_DiemTB  
    where 
        BangDiem.Mon.IDMon           = BangDiem.Mon.p_IDMon
        and
        BangDiem.SinhVien.IDSinhVien = BangDiem.SinhVien.p_IDSinhVien;
    commit;
    exception others then
          rollback;
  end proc_UpdateBangDiem;
  grant execute on proc_UpdateBangDiem to user1;
          
create procedure proc_DeleteBangDiem 
  (
    p_IDMon         in BangDiem.Mon.IDMon%type,
    p_IDSinhVien    in BangDiem.SinhVien.IDSinhVien%type
  )as 
  begin
    delete from 
              BangDiem
           where
              BangDiem.Mon.IDMon  = BangDiem.Mon.p_IDMon
              and
              BangDiem.SinhVien.IDSinhVien = BangDiem.SinhVien_IDSinhVien;
  end proc_DeleteBangDiem;
  grant execute on proc_DeleteBangDiem to user1;
;

---------------- LopMonHoc-----------------------

create procedure getAll
create procedure getbyID
  (
    p_IDLop       in  LopMonHoc.IDLop   ,
    p_TenLop      out LopMonHoc.TenLop  ,
    p_ThoiGianHoc out LopMonHoc.ThoiGianHoc 
  )as
    begin
        select 
            TenLop  ,
            ThoiGianHoc
        into
            p_TenLop ,
            p_ThoiGianHoc
        from 
            LopMonHoc
        where 
            IDLop = p_IDLop ;
      exception 
            when others then Raise_Application_Eoor (-20001,
                                                    p_IDLop  ||':%:'||
                                                    SQLERM, True);
      end proc_getbyID;
      grant execute on proc_getbyID to user1;
      
create procedure proc_InsertLopMonHoc
  (
    p_IDLop        in LopMonHoc.IDLop  ,
    p_TenLop       in LopMonHoc.TenLop ,
    p_ThoiGianHoc  in LopMonHoc.ThoiGianHoc
  )as
  begin
      INSERT INTO LopMonHoc
                  (
                    IDLop  ,
                    TenLop ,
                    ThoiGianHoc
                  )
      Values
                  (
                    p_IDLop    ,
                    p_TenLop   ,
                    p_ThoiGianHoc
                  )
      commit;
      exception
             when others then
                Raise_Application_Error (-20001,
                                        p_IDLop      || ':$:' ||
                                        p_TenLop     || ':$:' ||
                                        p_ThoiGianHoc  || ':$:' ||
                                        SQLERM, True);
    end proc_InsertLopMonHoc;
    grant execute on proc_InsertLopMonHoc to user1;
  
create procedure proc_UpdateLopMonHoc
  (
    p_IDLop        in LopMonHoc.IDLop%type,
    p_TenLop       in LopMonHoc.TenLop%type,
    p_ThoiGianHoc  in LopMonHoc.ThoiGianHoc%type
  )
  as 
  begin
    update LopMonHoc
      set 
        TenLop         = p_TenLop ,
        ThoiGianHoc    = p_ThoiGianHoc
    where 
        IDLop      = p_IDLop  ;
    commit;
    exception others then
          rollback;
  end proc_UpdateLopMonHoc;
  grant execute on proc_UpdateLopMonHoc to user1;
          
create procedure proc_DeleteLopMonHoc 
  (
    p_IDLop  in LopMonHoc.IDLop%type
  )as 
  begin
    delete from 
              LopMonHoc
           where
              IDLop = p_IDLop;
  end proc_DeleteLopMonHoc;
  grant execute on proc_DeleteLopMonHoc to user1;