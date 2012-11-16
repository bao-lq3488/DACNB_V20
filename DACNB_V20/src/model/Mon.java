package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Mon {
	public String getIDMon() {
		return IDMon;
	}
	public void setIDMon(String iDMon) {
		IDMon = iDMon;
	}
	public String getTenMon() {
		return TenMon;
	}
	public void setTenMon(String tenMon) {
		TenMon = tenMon;
	}
	String IDMon;
	String TenMon;
	public static ArrayList<Mon> setAllMon() throws SQLException {
		ArrayList<Mon> monList = new ArrayList<Mon>();
		ConnectionJDBC conn = new ConnectionJDBC(
				"oracle.jdbc.driver.OracleDriver", "localhost", "1521", "XE",
				"QLSV", "12345", null);
		Connection con = DriverManager.getConnection(conn.url,
				conn.getUsername(), conn.getPassword());
		String qry = "SELECT IDMON,TENMON FROM MON";
		Statement stmt = null;
		try {
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(qry);
			while (rs.next()) {
				Mon mon = new Mon();
				mon.setIDMon(rs.getString("IDMON"));
				mon.setTenMon(rs.getString("TENMON"));
				monList.add(mon);
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
		return monList;

	}
	
}
