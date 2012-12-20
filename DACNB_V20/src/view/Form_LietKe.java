package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;

import model.ConnectionJDBC;
import model.SinhVien;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;

public class Form_LietKe {
	
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
	Shell shell;

	private java.util.List SinhVien;
	
	public Form_LietKe() throws SQLException {
		SinhVien = new ArrayList();
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
				SinhVien.add(sv);
				
				
				
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

	}

	public Form_LietKe(Shell mainShell) {

		shell = new Shell(mainShell, SWT.APPLICATION_MODAL | SWT.CLOSE);
		Display display = new Display();
		  Shell shell = new Shell(display);
		  shell.setText("Tennis players");
		  createUI();
		  shell.pack();
		  shell.open();
		  while (!shell.isDisposed()) {
		  if (!display.readAndDispatch()) {
		  display.sleep();
		  }
		  }
		  display.dispose();
	}

	private void createUI() {
		Table table = new Table(shell, SWT.BORDER);

		shell.setText("A Table Shell Example");
		shell.setLayout(new FillLayout());

		shell.pack();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		shell.open();
		TableColumn[] column = new TableColumn[7];
		column[0] = new TableColumn(table, SWT.NONE);
		column[0].setText("Ma Sinh Vien");

		column[1] = new TableColumn(table, SWT.NONE);
		column[1].setText("Ten Sinh Vien");

		column[2] = new TableColumn(table, SWT.NONE);
		column[2].setText("Ngay Sinh");
		
		column[3] = new TableColumn(table, SWT.NONE);
		column[3].setText("Dia Chi");
		
		column[4] = new TableColumn(table, SWT.NONE);
		column[4].setText("Status");
		
		column[5] = new TableColumn(table, SWT.NONE);
		column[5].setText("ID Lop");
		
		column[6] = new TableColumn(table, SWT.NONE);
		column[6].setText("Ngay Nhap Hoc");
		
		column[7] = new TableColumn(table, SWT.NONE);
		column[7].setText("Ngay Ket Thuc");
		
		fillTable(table);
		for (int i = 0, n = column.length; i < n; i++) {
			  column[i].pack();
			  }		
	}

	private void fillTable(Table table) {
		table.setRedraw(false);
		for (Iterator iterator = SinhVien.iterator();iterator.hasNext();){
			SinhVien sv = (SinhVien) iterator.next();
			TableItem item = new TableItem(table, SWT.NONE);
			int c=0;
			item.setText(c++, sv.getIDSINHVIEN());
			item.setText(c++, sv.getTENSinhVien());
			item.setText(c++, sv.getNGAYSINH());
			item.setText(c++, sv.getDIACHI());
			item.setText(c++, sv.getStatus());
			item.setText(c++, sv.getIdLOP());
			item.setText(c++, sv.getDatejoin());
			item.setText(c++, sv.getDateend());			
		}
		table.setRedraw(true);
		
		
	}
}
