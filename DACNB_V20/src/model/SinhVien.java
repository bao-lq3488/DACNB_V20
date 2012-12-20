package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class SinhVien {

	public String getIDSINHVIEN() {
		return IDSINHVIEN;
	}

	public void setIDSINHVIEN(String iDSINHVIEN) {
		IDSINHVIEN = iDSINHVIEN;
	}

	public String getTENSinhVien() {
		return TENSINHVIEN;
	}

	public void setTENSinhVien(String tENSinhVien) {
		TENSINHVIEN = tENSinhVien;
	}

	public String getNGAYSINH() {
		return NGAYSINH;
	}

	public void setNGAYSINH(String nGAYSINH) {
		NGAYSINH = nGAYSINH;
	}

	public String getDIACHI() {
		return DIACHI;
	}

	public void setDIACHI(String dIACHI) {
		DIACHI = dIACHI;
	}

	public String getStatus() {
		return STATUS;
	}

	public void setStatus(String status) {
		this.STATUS = status;
	}

	public String getIdLOP() {
		return IDLOP;
	}

	public void setIdLOP(String idLOP) {
		this.IDLOP = idLOP;
	}

	public String getDatejoin() {
		return DATEJOIN;
	}

	public void setDatejoin(String datejoin) {
		this.DATEJOIN = datejoin;
	}

	public String getDateend() {
		return DATEEND;
	}

	public void setDateend(String dateend) {
		this.DATEEND = dateend;
	}

	String IDSINHVIEN;
	String TENSINHVIEN;
	String NGAYSINH;
	String DIACHI;
	String STATUS;
	String IDLOP;
	String DATEJOIN;
	String DATEEND;

	public static ArrayList<SinhVien> setAllSinhvien() throws SQLException {
		ArrayList<SinhVien> svList = new ArrayList<SinhVien>();
		ConnectionJDBC conn = new ConnectionJDBC(
				"oracle.jdbc.driver.OracleDriver", "localhost", "1521", "XE",
				"QLSV", "12345", null);
		Connection con = DriverManager.getConnection(conn.url,
				conn.getUsername(), conn.getPassword());
		String qry = "SELECT IDSINHVIEN,TENSINHVIEN,NGAYSINH,DIACHI,STATUS,IDLOP,DATEJOIN,DATEEND FROM SINHVIEN";
		Statement stmt = null;
		try {
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(qry);
			while (rs.next()) {
				SinhVien sv = new SinhVien();
				sv.setIDSINHVIEN(rs.getString("IDSINHVIEN"));
				sv.setTENSinhVien(rs.getString("TENSINHVIEN"));
				sv.setNGAYSINH(rs.getString("NGAYSINH"));
				sv.setDIACHI(rs.getString("DIACHI"));
				sv.setStatus(rs.getString("STATUS"));
				sv.setIdLOP(rs.getString("IDLOP"));
				sv.setDatejoin(rs.getString("DATEJOIN"));
				sv.setDateend(rs.getString("DATEEND"));
				System.out.println(sv.getIDSINHVIEN() + "	    "
						+ sv.getTENSinhVien() + "	    " + sv.getNGAYSINH()
						+ "	    " + sv.getDIACHI() + "	    " + sv.getStatus()
						+ "	    " + sv.getIdLOP() + "	    " + sv.getDatejoin()
						+ "	    " + sv.getDateend());
				svList.add(sv);
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
		return svList;

	}

}
