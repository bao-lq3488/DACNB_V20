package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Khoa {

	public String getIDKhoa() {
		return IDKhoa;
	}

	public void setIDKhoa(String iDKhoa) {
		IDKhoa = iDKhoa;
	}

	public String getTenKhoa() {
		return TenKhoa;
	}

	public void setTenKhoa(String tenKhoa) {
		TenKhoa = tenKhoa;
	}

	public String getTruongKhoa() {
		return TruongKhoa;
	}

	public void setTruongKhoa(String truongKhoa) {
		TruongKhoa = truongKhoa;
	}

	String IDKhoa;
	String TenKhoa;
	String TruongKhoa;
	
	public static void getDataKhoa() throws SQLException {
		ArrayList<Khoa> kList = new ArrayList<Khoa>();
		ConnectionJDBC conn = new ConnectionJDBC(
				"oracle.jdbc.driver.OracleDriver", "localhost", "1521", "XE",
				"QLSV", "12345", null);
		Connection con = DriverManager.getConnection(conn.url,
				conn.getUsername(), conn.getPassword());
		String qry = "SELECT IDKHOA,TENKHOA,TRUONGKHOA FROM KHOA";
		Statement stmt = null;
		try {
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(qry);
			while (rs.next()) {
				Khoa k = new Khoa();
				k.setIDKhoa(rs.getString("IDKHOA"));
				k.setTenKhoa(rs.getString("TENKHOA"));
				k.setTruongKhoa(rs.getString("TRUONGKHOA"));
				kList.add(k);
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
