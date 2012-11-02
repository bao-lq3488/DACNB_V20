package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SinhVien {
	public static ConnectionJDBC conn = null;

	public static void selectSinhVien() throws SQLException{
		ConnectionJDBC conn = new ConnectionJDBC("oracle.jdbc.driver.OracleDriver","localhost","1521","XE","QLSV","12345",null);
		Connection con = DriverManager.getConnection(conn.url, conn.getUsername(), conn.getPassword());
		String qry = "SELECT  * FROM SINHVIEN";
		Statement stmt = null;
		try{
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(qry);
			while (rs.next()){
				String IDSinhVien = rs.getString("IDSinhVien");
				String TenSinhVien = rs.getString("TenSV");
				String NgaySinh = rs.getString("NgaySinh");
				String DiaChi = rs.getString("DiaChi");
				String KhoaHoc = rs.getString("KhoaHoc");
				String Lop = rs.getString("Lop");
				String Nganh = rs.getString("Nganh");
				System.out.println(IDSinhVien + "/t" + TenSinhVien + "/t" + NgaySinh + "/t" + DiaChi + "/t" + KhoaHoc + "/t" + Lop + "/t" + Nganh);
		}
		
		}catch (SQLException e){
			e.printStackTrace();
		}finally{
			if (stmt != null){
				try{
					stmt.close();
				}catch (SQLException ex) {
					ex.printStackTrace();
				}
			}
			if (con != null ){
				try{
					con.close();
				} catch (SQLException ex) {
					ex.printStackTrace();
				}
				
			}
		}
		
	}
}
