package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.eclipse.swt.widgets.Shell;

import view.Form_ThemSV;

import model.ConnectionJDBC;

public class themSinhVien {

	static ConnectionJDBC conn = new ConnectionJDBC(
			"oracle.jdbc.driver.OracleDriver", "localhost", "1521", "XE",
			"QLSV", "12345", null);
	private static boolean result;

	public boolean isResult() {
		return result;
	}

	public static boolean setResult(boolean result) {
		return themSinhVien.result = result;
	}

	public static boolean doAddSinhVien() {

		try {
			Connection con = DriverManager.getConnection(conn.url,
					conn.getUsername(), conn.getPassword());
			System.out.println("Connection : " + conn.doConnection());
			Statement stmt = con.createStatement();
			String query = "INSERT INTO SINHVIEN (IDSINHVIEN,TENSINHVIEN,NGAYSINH,DIACHI,STATUS,IDLOP,DATEJOIN,DATEEND) "
					+ "VALUES ('"+ "','phan hoang dung',to_date('1991/01/01','YYYY/MM/DD'),'HCM','DANG HOC','QL091A','2009','2012')";
			stmt.executeUpdate(query);
			return setResult(true);

		} catch (Exception e) {
			System.out.println("Got an exception! ");
			System.err.println(e.getMessage());
			return setResult(false);
		}

	}

}
