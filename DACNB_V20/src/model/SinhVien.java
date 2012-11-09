package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class SinhVien {
	public static ConnectionJDBC conn = null;

	public static void selectSinhVien() throws SQLException {
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
				String IDSinhVien = rs.getString("IDSINHVIEN");
				String TenSinhVien = rs.getString("TENSV");
				String NgaySinh = rs.getString("NGAYSINH");
				String DiaChi = rs.getString("DIACHI");
				String KhoaHoc = rs.getString("KHOAHOC");
				String Lop = rs.getString("LOP");
				String Nganh = rs.getString("IDNGANH");
				System.out.println(IDSinhVien + "     " + TenSinhVien + "    "
						+ NgaySinh + "   " + DiaChi + "    " + KhoaHoc + "    "
						+ Lop + "   " + Nganh);
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
	public static void arrayListSinhVien(){
	
		ArrayList<Object> arl = new ArrayList<Object>();
//		String IDSinhVien = new String();
//		String TenSinhVien = new String();
//		String NgaySinh = new String();
//		String DiaChi = new String();
//		String KhoaHoc = new String();
//		String Lop = new String();
//		String Nganh = new String();
		
		
	}
}
