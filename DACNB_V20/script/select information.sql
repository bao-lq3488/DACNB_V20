 use QuanLySinhVien
 -------------------------
select TenSV, IDSinhVien
from SinhVien

select SinhVien.TenSV count(Mon.IDMon) as SoLuong
from SinhVien join Mon on Mon.IDSinhVien=SinhVien.IDSinhVien 
group by SinhVien.TenSV

select Diem
from Diem D, Mon M, SinhVien S
where D.IDDiem=MaSV.IDMon and M.IDSinhVien=S.IDSinhVien

select TenSV,Khoa, Nganh
from SinhVien S, Khoa K, Nganh N
where 