package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionJDBC {

	Connection connection = null;
	String driverName;
	String serverName;
	String portNumber;
	String sid;
	public String username;
	public String password;
	public String url;

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getServerName() {
		return serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	public String getPortNumber() {
		return portNumber;
	}

	public void setPortNumber(String portNumber) {
		this.portNumber = portNumber;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public ConnectionJDBC(String driverName, String serverName,
			String portNumber, String sid, String username, String password,
			Connection connection) {
		super();
		this.connection = connection;
		this.driverName = driverName;
		this.serverName = serverName;
		this.portNumber = portNumber;
		this.sid = sid;
		this.username = username;
		this.password = password;

		this.url = "jdbc:oracle:thin:@" + this.getServerName() + ":"
				+ this.getPortNumber() + ":" + this.getSid();

	}

	public boolean doConnection() {

		
		try {
			Class.forName(this.driverName);
			this.connection = DriverManager.getConnection(this.url, this.username, this.password);
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException : " + e.getMessage());
			return false;
		} catch (SQLException e) {

			System.out.println("test" + e.getMessage());
			return false;
		}
		
		return true;
	}
	public ConnectionJDBC getConnection() throws SQLException{
		ConnectionJDBC conn = null;
		url = "jdbc:oracle:thin:@" + this.getServerName() + ":"
				+ this.getPortNumber() + ":" + this.getSid();
		conn = (ConnectionJDBC) DriverManager.getConnection(url, this.getUsername(), this.getPassword());
		return conn;
	}

}
