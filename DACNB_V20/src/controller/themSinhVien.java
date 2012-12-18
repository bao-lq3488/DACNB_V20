package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import model.ConnectionJDBC;

public class themSinhVien {

	static ConnectionJDBC conn = new ConnectionJDBC(
			"oracle.jdbc.driver.OracleDriver", "localhost", "1521", "XE",
			"QLSV", "12345", null);

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection(conn.url,
					conn.getUsername(), conn.getPassword());
			System.out.println("Connection : " + conn.doConnection());
			Statement stmt = con.createStatement();
			String query = "INSERT INTO SINHVIEN (IDSINHVIEN,TENSINHVIEN,NGAYSINH,DIACHI,STATUS,IDLOP,DATEJOIN,DATEEND) " +
					"VALUES ('093111','phan hoang dung',to_date('1991/01/01','YYYY/MM/DD'),'HCM','DANG HOC','QL091A','2009','2012')";

			// for (int i=0;i<args.length;i++)
			// {
			// query+= args[i];
			// if(i+1 < args.length)
			// query += "','";
			// }
			// query +="')";
			stmt.executeUpdate(query);

		} catch (Exception e) {
			System.out.println("Got an exception! ");
			System.err.println(e.getMessage());
		}
	}
}
