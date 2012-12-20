package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
<<<<<<< HEAD
import java.sql.Statement;
=======
>>>>>>> branch 'master' of https://github.com/bao-lq3488/DACNB_V20.git
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
<<<<<<< HEAD
	
	public String getIDSINHVIEN() {
		return IDSINHVIEN;
=======

	Shell shell;
	public SinhVien sinhVien = new SinhVien();

	public Form_LietKe(Shell mainShell) throws SQLException {

		shell = new Shell(mainShell, SWT.APPLICATION_MODAL | SWT.CLOSE);

		createUI(shell);

		shell.open();
>>>>>>> branch 'master' of https://github.com/bao-lq3488/DACNB_V20.git
	}

	public void setIDSINHVIEN(String iDSINHVIEN) {
		IDSINHVIEN = iDSINHVIEN;
	}

<<<<<<< HEAD
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
=======
		// shell.setSize(300, 180);
		// shell.setText("Liet Ke");
		// shell.setLocation(10, 10);
		//
		// Label lblTenMH = new Label(shell, SWT.CENTER | SWT.BORDER);
		// lblTenMH.setText("Ten Mon Hoc");
		// lblTenMH.setSize(85, 20);
		// lblTenMH.setLocation(5, 10);
		//
		// Label lblKeDoc1 = new Label(shell, SWT.SEPARATOR | SWT.VERTICAL);
		// lblKeDoc1.setLocation(90, 0);
		// lblKeDoc1.setSize(30, 200);
		//
		// Label lblKiHieu = new Label(shell, SWT.CENTER | SWT.BORDER);
		// lblKiHieu.setText("Ki Hieu");
		// lblKiHieu.setSize(45, 20);
		// lblKiHieu.setLocation(120, 10);
		//
		// Label lblKeDoc2 = new Label(shell, SWT.SEPARATOR | SWT.VERTICAL);
		// lblKeDoc2.setLocation(160, 0);
		// lblKeDoc2.setSize(30, 200);
		//
		// Label lblTC = new Label(shell, SWT.CENTER | SWT.BORDER);
		// lblTC.setText("So Tin Chi");
		// lblTC.setSize(70, 20);
		// lblTC.setLocation(190, 10);
		//
		// Label lblKeNgang = new Label(shell, SWT.SEPARATOR | SWT.HORIZONTAL
		// | SWT.SHADOW_OUT);
		// lblKeNgang.setLocation(0, 20);
		// lblKeNgang.setSize(300, 30);
		//composite.setLayout(new FillLayout());
		final Table table = new Table(shell , SWT.BORDER);
>>>>>>> branch 'master' of https://github.com/bao-lq3488/DACNB_V20.git

		shell.setText("A Table Shell Example");
		shell.setLayout(new FillLayout());

		table.setHeaderVisible(true);
		table.setLinesVisible(true);
<<<<<<< HEAD
		shell.open();
		TableColumn[] column = new TableColumn[7];
=======

		TableColumn[] column = new TableColumn[8];
>>>>>>> branch 'master' of https://github.com/bao-lq3488/DACNB_V20.git
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
<<<<<<< HEAD
		column[5].setText("ID Lop");
		
		column[6] = new TableColumn(table, SWT.NONE);
		column[6].setText("Ngay Nhap Hoc");
		
		column[7] = new TableColumn(table, SWT.NONE);
		column[7].setText("Ngay Ket Thuc");
		
=======
		column[5].setText("ID LOP");
		
		column[6] = new TableColumn(table, SWT.NONE);
		column[6].setText("Nam nhap hoc");
		
		column[7] = new TableColumn(table, SWT.NONE);
		column[7].setText("Nam ket thuc");

>>>>>>> branch 'master' of https://github.com/bao-lq3488/DACNB_V20.git
		fillTable(table);
		for (int i = 0, n = column.length; i < n; i++) {
<<<<<<< HEAD
			  column[i].pack();
			  }		
=======
			column[i].pack();
		}
		shell.pack();
>>>>>>> branch 'master' of https://github.com/bao-lq3488/DACNB_V20.git
	}

	private void fillTable(Table table) {
		table.setRedraw(false);
<<<<<<< HEAD
		for (Iterator iterator = SinhVien.iterator();iterator.hasNext();){
			SinhVien sv = (SinhVien) iterator.next();
=======
		
		
		for(Iterator<SinhVien> iterator = sinhVien.getAllSinhvien().iterator();iterator.hasNext();)
		{		
			sinhVien = (SinhVien) iterator.next();
>>>>>>> branch 'master' of https://github.com/bao-lq3488/DACNB_V20.git
			TableItem item = new TableItem(table, SWT.NONE);
<<<<<<< HEAD
			int c=0;
			item.setText(c++, sv.getIDSINHVIEN());
			item.setText(c++, sv.getTENSinhVien());
			item.setText(c++, sv.getNGAYSINH());
			item.setText(c++, sv.getDIACHI());
			item.setText(c++, sv.getStatus());
			item.setText(c++, sv.getIdLOP());
			item.setText(c++, sv.getDatejoin());
			item.setText(c++, sv.getDateend());			
=======
			int c = 0;
			item.setText(c++, sinhVien.getIDSINHVIEN());
			item.setText(c++, sinhVien.getTENSinhVien());
			item.setText(c++, sinhVien.getNGAYSINH());
			item.setText(c++, sinhVien.getDIACHI());
			item.setText(c++, sinhVien.getStatus());
			item.setText(c++, sinhVien.getIdLOP());
			item.setText(c++, sinhVien.getDatejoin());
			item.setText(c++, sinhVien.getDateend());
>>>>>>> branch 'master' of https://github.com/bao-lq3488/DACNB_V20.git
		}
		
		table.setRedraw(true);
		
		
	}
}
