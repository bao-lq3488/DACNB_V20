package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionJDBC {

	private Connection connection = null;
	public Connection getConnection() {
		return connection;
	}

	private String driverName;
	private String serverName;
	private String portNumber;
	private String sid;
	private String username;
	private String password;

	private String url = "jdbc:oracle:thin:@" + this.getServerName() + ":"
			+ this.getPortNumber() + ":" + this.getSid();

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
			String portNumber, String sid, String username, String password) {
		super();
		this.driverName = driverName;
		this.serverName = serverName;
		this.portNumber = portNumber;
		this.sid = sid;
		this.username = username;
		this.password = password;
	}

	public boolean doConnection() {
		try {
			Class.forName(driverName);

			connection = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {

			System.out.println("ClassNotFoundException : " + e.getMessage());
			return false;
		} catch (SQLException e) {

			System.out.println(e.getMessage());
			return false;
		}
		return true;
	}

}
