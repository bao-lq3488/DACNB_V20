package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class SinhVien {
	public static ConnectionJDBC conn = null;

	public String getIDSinhVien() {
		return IDSinhVien;
	}

	public void setIDSinhVien(String iDSinhVien) {
		IDSinhVien = iDSinhVien;
	}

	public String getTenSinhVien() {
		return TenSinhVien;
	}

	public void setTenSinhVien(String tenSinhVien) {
		TenSinhVien = tenSinhVien;
	}

	public String getNgaySinh() {
		return NgaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		NgaySinh = ngaySinh;
	}

	public String getDiaChi() {
		return DiaChi;
	}

	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}

	public String getKhoaHoc() {
		return KhoaHoc;
	}

	public void setKhoaHoc(String khoaHoc) {
		KhoaHoc = khoaHoc;
	}

	public String getLop() {
		return Lop;
	}

	public void setLop(String lop) {
		Lop = lop;
	}

	public String getNganh() {
		return Nganh;
	}

	public void setNganh(String nganh) {
		Nganh = nganh;
	}

	String IDSinhVien;
	String TenSinhVien;
	String NgaySinh;
	String DiaChi;
	String KhoaHoc;
	String Lop;
	String Nganh;

	public static void selectSinhVien() throws SQLException {
		ArrayList<SinhVien> svList = new ArrayList<SinhVien>();
		ConnectionJDBC conn = new ConnectionJDBC(
				"oracle.jdbc.driver.OracleDriver", "localhost", "1521", "XE",
				"QLSV", "12345", null);
		Connection con = DriverManager.getConnection(conn.url,
				conn.getUsername(), conn.getPassword());
		String qry = "SELECT IDSINHVIEN,TENSV,NGAYSINH,DIACHI,KHOAHOC,LOP,IDNGANH FROM SINHVIEN";
		Statement stmt = null;
		try {
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(qry);
			while (rs.next()) {
				SinhVien sv = new SinhVien();
				sv.setIDSinhVien(rs.getString("IDSINHVIEN"));
				sv.setTenSinhVien(rs.getString("TENSV"));
				sv.setNgaySinh(rs.getString("NGAYSINH"));
				sv.setDiaChi(rs.getString("DIACHI"));
				sv.setKhoaHoc(rs.getString("KHOAHOC"));
				sv.setLop(rs.getString("LOP"));
				sv.setNganh(rs.getString("IDNGANH"));
				 System.out.println(sv.getIDSinhVien() + "     "
				 + sv.getTenSinhVien() + "    " + sv.getNgaySinh()
				 + "   " + sv.getDiaChi() + "    " + sv.getKhoaHoc()
				 + "    " + sv.getLop() + "   " + sv.getNganh());
				svList.add(sv);
			}
	

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException ex) {
					ex.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException ex) {
					ex.printStackTrace();
				}

			}
		}

	}

}
