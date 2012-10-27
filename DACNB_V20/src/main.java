import model.ConnectionJDBC;

public class main {
	
	// IO Error: Invalid number format for port number
	public static void main(String args[]) {
		ConnectionJDBC con = new ConnectionJDBC(
				"oracle.jdbc.driver.OracleDriver", "localhost", "1521", "XE",
				"QLSV", "12345");
		System.out.println("Connection : " + con.doConnection());
	}
}
