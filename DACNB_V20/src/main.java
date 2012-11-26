import java.sql.Connection;
import java.sql.SQLException;

import model.ConnectionJDBC;
import model.SinhVien;


public class main {
	//IO Error: Invalid number format for port number
	public static Connection conn = null;
	public static void main(String arg[]) {
		try{
			ConnectionJDBC con = new ConnectionJDBC("oracle.jdbc.driver.OracleDriver","localhost","1521","XE","QLSV","12345",null);
			System.out.println("Connection : " + con.doConnection());
			SinhVien sv;
			//SinhVien.selectSinhVien();
			SinhVien.setAllSinhvien();
		}catch (SQLException ex) {
			System.out.println(ex);
		}
	}
}

