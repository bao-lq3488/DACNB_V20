import java.sql.Connection;
import java.sql.SQLException;

import model.ConnectionJDBC;
import model.SinhVien;


public class main {
	//IO Error: Invalid number format for port number
	public static Connection conn = null;
	public static void main(final String arg[]) {
		try{
			ConnectionJDBC con = null;
			con = new ConnectionJDBC("oracle.jdbc.driver.OracleDriver","localhost","1521","XE","ORACLE_HIBERNATE","meoden12",null);
			System.out.println("Connection : " + con.doConnection());
			//SinhVien.selectSinhVien();
			SinhVien sv = new SinhVien();
			sv.getAllSinhvien();
		}catch (SQLException ex) {
			System.out.println(ex);
		}
	}
}

