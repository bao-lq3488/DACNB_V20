package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Nganh {
	public String getIDNganh() {
		return IDNganh;
	}
	public void setIDNganh(String iDNganh) {
		IDNganh = iDNganh;
	}
	public String getTenNganh() {
		return TenNganh;
	}
	public void setTenNganh(String tenNganh) {
		TenNganh = tenNganh;
	}
	String IDNganh;
	String TenNganh;
	public static ArrayList<Nganh> setAllNganh() throws SQLException {
		ArrayList<Nganh> nganhList = new ArrayList<Nganh>();
		ConnectionJDBC conn = new ConnectionJDBC(
				"oracle.jdbc.driver.OracleDriver", "localhost", "1521", "XE",
				"QLSV", "12345", null);
		Connection con = DriverManager.getConnection(conn.url,
				conn.getUsername(), conn.getPassword());
		String qry = "SELECT IDNganh,TENGANH FROM NGANH";
		Statement stmt = null;
		try {
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(qry);
			while (rs.next()) {
				Nganh nganh = new Nganh();
				nganh.setIDNganh(rs.getString("IDNGANH"));
				nganh.setTenNganh(rs.getString("TENMON"));
				nganhList.add(nganh);
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
		return nganhList;
	}
}
