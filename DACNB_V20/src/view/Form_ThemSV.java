package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import model.ConnectionJDBC;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import controller.JDBCConnection;

public class Form_ThemSV {
	
	Shell shell;
	Text txt_idSinhVien;
	Text txt_tenSinhVien;
	String s = "";
	String query;
	Connection conn = null;
	JDBCConnection jdbccon = null;
	
	Connection con = null;
	ConnectionJDBC conn1 = null;
	Statement stmt = null;
	
	public Form_ThemSV(Shell mainShell) {

		this.shell = new Shell(SWT.APPLICATION_MODAL | SWT.CLOSE);
		conn1 = new ConnectionJDBC("oracle.jdbc.driver.OracleDriver","localhost", "1521", "XE", "ORACLE_HIBERNATE", "meoden12",null);
		
		createUI();
		this.shell.open();
		
	}
	
	private void createUI() {
	
		GridLayout gl = new GridLayout();
		gl.numColumns = 4;
		gl.verticalSpacing = 10;

		GridData gd = new GridData(SWT.FILL,SWT.FILL,true,true);
		Label lbl_idSinhVien = new Label(this.shell, SWT.CENTER);
		lbl_idSinhVien.setText("ID Sinh Vien:");
		lbl_idSinhVien.setLayoutData(gd);
		
		gd = new GridData(SWT.FILL,SWT.FILL,true,true);
		final Text txt_idSinhVien = new Text(this.shell, SWT.CENTER);
		txt_idSinhVien.setLayoutData(gd);
		txt_idSinhVien.addListener(SWT.Modify, new Listener() {

	        public void handleEvent(Event e) {

	            s = txt_idSinhVien.getText();

	        }

	    });

		gd = new GridData(SWT.FILL,SWT.FILL,true,true);
		Label lbl_tenSinhVien = new Label(this.shell, SWT.CENTER);
		lbl_tenSinhVien.setText("Ten Sinh Vien:");
		lbl_tenSinhVien.setLayoutData(gd);
		
		gd = new GridData(SWT.FILL,SWT.FILL,true,true);
		Text txt_tenSinhVien = new Text(this.shell, SWT.CENTER);
		txt_tenSinhVien.setLayoutData(gd);
		
		gd = new GridData(SWT.FILL,SWT.FILL,true,true);
		Label lbl_ngaysinhSinhVien = new Label(this.shell, SWT.CENTER);
		lbl_ngaysinhSinhVien.setText("Ngay Sinh:");
		lbl_ngaysinhSinhVien.setLayoutData(gd);
		
		gd = new GridData(SWT.FILL,SWT.FILL,true,true);
		Text txt_ngaysinhSinhVien = new Text(this.shell, SWT.CENTER);
		txt_ngaysinhSinhVien.setLayoutData(gd);
		
		gd = new GridData(SWT.FILL,SWT.FILL,true,true);
		Label lbl_diachi = new Label(this.shell, SWT.CENTER);
		lbl_diachi.setText("Dia Chi:");
		lbl_diachi.setLayoutData(gd);
		
		gd = new GridData(SWT.FILL,SWT.FILL,true,true);
		Text txt_diachi = new Text(this.shell, SWT.CENTER);
		txt_diachi.setLayoutData(gd);
		
		gd = new GridData(SWT.FILL,SWT.FILL,true,true);
		Label lbl_status = new Label(this.shell, SWT.CENTER);
		lbl_status.setText("Tinh Trang:");
		lbl_status.setLayoutData(gd);
		
		gd = new GridData(SWT.FILL,SWT.FILL,true,true);
		Text txt_status = new Text(this.shell, SWT.CENTER);
		txt_status.setLayoutData(gd);
		
		gd = new GridData(SWT.FILL,SWT.FILL,true,true);
		Label lbl_idLop = new Label(this.shell, SWT.CENTER);
		lbl_idLop.setText("Ma Lop:");
		lbl_idLop.setLayoutData(gd);
		
		gd = new GridData(SWT.FILL,SWT.FILL,true,true);
		Text txt_idLop = new Text(this.shell, SWT.CENTER);
		txt_idLop.setLayoutData(gd);
		
		gd = new GridData(SWT.FILL,SWT.FILL,true,true);
		Label lbl_dateJoin = new Label(this.shell, SWT.CENTER);
		lbl_dateJoin.setText("Ngay Nhap Hoc:");
		lbl_dateJoin.setLayoutData(gd);
		
		gd = new GridData(SWT.FILL,SWT.FILL,true,true);
		Text txt_dateJoin = new Text(this.shell, SWT.CENTER);
		txt_dateJoin.setLayoutData(gd);
		
		gd = new GridData(SWT.FILL,SWT.FILL,true,true);
		Label lbl_dateEnd = new Label(this.shell, SWT.CENTER);
		lbl_dateEnd.setText("Ngay Ket Thuc:");
		lbl_dateEnd.setLayoutData(gd);
		
		gd = new GridData(SWT.FILL,SWT.FILL,true,true);
		Text txt_dateEnd = new Text(this.shell, SWT.CENTER);
		txt_dateEnd.setLayoutData(gd);
		
		gd = new GridData(SWT.FILL,SWT.FILL,true,true);
		Button btnOk = new Button(this.shell, SWT.CENTER);
		btnOk.setText("Ok");
		btnOk.setLayoutData(gd);
		btnOk.addListener(SWT.Selection, btn_Ok_Clicked());

		gd = new GridData(SWT.FILL,SWT.FILL,true,true);
		Button btnCancel = new Button(shell, SWT.CENTER);
		btnCancel.setText("Cancel");
		btnOk.setLayoutData(gd);
		btnCancel.addListener(SWT.Selection, btn_Cancle_Clicked());
		
		this.shell.setLayout(gl);
		
	}

	private Listener btn_Ok_Clicked() {
		// TODO Auto-generated method stub
		return new Listener() {
			public void handleEvent(Event event) {
//				try {
//					Statement stmt = con.createStatement();
//					String query = "INSERT INTO SINHVIEN (IDSINHVIEN,TENSINHVIEN,NGAYSINH,DIACHI,STATUS,IDLOP,DATEJOIN,DATEEND) "
//						+ "VALUES ('" + s + "','phan shoang dung',to_date('1991/01/01','YYYY/MM/DD'),'HCM','DANG HOC','QL091A','2009','2012')";
//					stmt.executeQuery(query);
//					} catch (SQLException e) {
					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
				
				try {
					con = DriverManager.getConnection(conn1.url,conn1.getUsername(), conn1.getPassword());
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					stmt = con.createStatement();
					String query = "INSERT INTO SINHVIEN (IDSINHVIEN,TENSINHVIEN,NGAYSINH,DIACHI,STATUS,IDLOP,DATEJOIN,DATEEND) "
							+ "VALUES ('" + s + "','phan shoang dung',to_date('1991/01/01','YYYY/MM/DD'),'HCM','DANG HOC','QL091A','2009','2012')";
						stmt.executeUpdate(query);
						MessageBox m = new MessageBox(shell);
						m.open();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} finally {
					try {
						stmt.close();
						con.close();
						
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
	}

	public Listener btn_Cancle_Clicked() {
		return new Listener() {
			public void handleEvent(Event event) {
				shell.close();
			}
		};
	}
}


