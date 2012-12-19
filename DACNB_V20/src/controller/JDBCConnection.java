package controller;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import model.ConnectionJDBC;

public class JDBCConnection {

	private static final String user = "QLSV";
	private static final String password = "12345";
	private String serverName = "localhost";
	private String portNumber = "1521";
	private String sid = "XE";
	private static final String typeDB = "jdbc:oracle:thin:@";
	private Statement stmt = null;
	private String jdbcDriver = "oracle.jdbc.driver.OracleDriver";

	public JDBCConnection(Connection conn){

		try {
			Class.forName(jdbcDriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			String url = typeDB + serverName + ":" +
					portNumber + ":" + sid;
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void insertQuery(String query, Connection conn){

			try {
				stmt = conn.createStatement();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				stmt.executeUpdate(query);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
