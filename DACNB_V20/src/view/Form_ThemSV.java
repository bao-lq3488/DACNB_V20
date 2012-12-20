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
	Text txt_idSinhVien,txt_ngaysinhSinhVien,txt_diachi,txt_status,txt_idLop;
	Text txt_tenSinhVien,txt_dateJoin,txt_dateEnd;
	String idsv = "";
	String tensv = "";
	String ngaysinh = "";
	String diachi = "";
	String status = "";
	String idLop = "";
	String datejoin = "";
	String dateend = "";
	String query;
	Connection conn = null;
	JDBCConnection jdbccon = null;
	
	Connection con = null;
	ConnectionJDBC conn1 = null;
	Statement stmt = null;
	
	public Form_ThemSV(Shell mainShell) {

		this.shell = new Shell(SWT.APPLICATION_MODAL | SWT.CLOSE);
		conn1 = new ConnectionJDBC("oracle.jdbc.driver.OracleDriver","localhost", "1521", "XE", "qlsv", "12345",null);
		
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
		txt_idSinhVien.addListener(SWT.Modify, getIDsv(txt_idSinhVien));

		gd = new GridData(SWT.FILL,SWT.FILL,true,true);
		Label lbl_tenSinhVien = new Label(this.shell, SWT.CENTER);
		lbl_tenSinhVien.setText("Ten Sinh Vien:");
		lbl_tenSinhVien.setLayoutData(gd);
		
		gd = new GridData(SWT.FILL,SWT.FILL,true,true);
		txt_tenSinhVien = new Text(this.shell, SWT.CENTER);
		txt_tenSinhVien.setLayoutData(gd);
		txt_tenSinhVien.addListener(SWT.Modify, new Listener() {
			
			@Override
			public void handleEvent(Event arg0) {
				// TODO Auto-generated method stub
				tensv = txt_tenSinhVien.getText();
			}
		});
		
		
		gd = new GridData(SWT.FILL,SWT.FILL,true,true);
		Label lbl_ngaysinhSinhVien = new Label(this.shell, SWT.CENTER);
		lbl_ngaysinhSinhVien.setText("Ngay Sinh:");
		lbl_ngaysinhSinhVien.setLayoutData(gd);
		
		gd = new GridData(SWT.FILL,SWT.FILL,true,true);
		txt_ngaysinhSinhVien = new Text(this.shell, SWT.CENTER);
		txt_ngaysinhSinhVien.setLayoutData(gd);
		txt_ngaysinhSinhVien.addListener(SWT.Modify, new Listener() {
			
			@Override
			public void handleEvent(Event arg0) {
				// TODO Auto-generated method stub
				ngaysinh = txt_ngaysinhSinhVien.getText();
			}
		});
		
		gd = new GridData(SWT.FILL,SWT.FILL,true,true);
		Label lbl_diachi = new Label(this.shell, SWT.CENTER);
		lbl_diachi.setText("Dia Chi:");
		lbl_diachi.setLayoutData(gd);
		
		gd = new GridData(SWT.FILL,SWT.FILL,true,true);
		txt_diachi = new Text(this.shell, SWT.CENTER);
		txt_diachi.setLayoutData(gd);
		txt_diachi.addListener(SWT.Modify, new Listener() {
			
			@Override
			public void handleEvent(Event arg0) {
				// TODO Auto-generated method stub
				diachi = txt_diachi.getText();
			}
		});
		
		
		gd = new GridData(SWT.FILL,SWT.FILL,true,true);
		Label lbl_status = new Label(this.shell, SWT.CENTER);
		lbl_status.setText("Tinh Trang:");
		lbl_status.setLayoutData(gd);
		
		gd = new GridData(SWT.FILL,SWT.FILL,true,true);
		txt_status = new Text(this.shell, SWT.CENTER);
		txt_status.setLayoutData(gd);
		txt_status.addListener(SWT.Modify, new Listener() {
			
			@Override
			public void handleEvent(Event arg0) {
				// TODO Auto-generated method stub
				status = txt_status.getText();
			}
		});
		
		gd = new GridData(SWT.FILL,SWT.FILL,true,true);
		Label lbl_idLop = new Label(this.shell, SWT.CENTER);
		lbl_idLop.setText("Ma Lop:");
		lbl_idLop.setLayoutData(gd);
		
		gd = new GridData(SWT.FILL,SWT.FILL,true,true);
		txt_idLop = new Text(this.shell, SWT.CENTER);
		txt_idLop.setLayoutData(gd);
		txt_idLop.addListener(SWT.Modify, new Listener() {
			
			@Override
			public void handleEvent(Event arg0) {
				// TODO Auto-generated method stub
				idLop = txt_idLop.getText();
			}
		});
		gd = new GridData(SWT.FILL,SWT.FILL,true,true);
		Label lbl_dateJoin = new Label(this.shell, SWT.CENTER);
		lbl_dateJoin.setText("Ngay Nhap Hoc:");
		lbl_dateJoin.setLayoutData(gd);
		
		gd = new GridData(SWT.FILL,SWT.FILL,true,true);
		txt_dateJoin = new Text(this.shell, SWT.CENTER);
		txt_dateJoin.setLayoutData(gd);
		txt_dateJoin.addListener(SWT.Modify, new Listener() {
			
			@Override
			public void handleEvent(Event arg0) {
				// TODO Auto-generated method stub
				datejoin = txt_dateJoin.getText();
			}
		});
		
		gd = new GridData(SWT.FILL,SWT.FILL,true,true);
		Label lbl_dateEnd = new Label(this.shell, SWT.CENTER);
		lbl_dateEnd.setText("Ngay Ket Thuc:");
		lbl_dateEnd.setLayoutData(gd);
		
		gd = new GridData(SWT.FILL,SWT.FILL,true,true);
		txt_dateEnd = new Text(this.shell, SWT.CENTER);
		txt_dateEnd.setLayoutData(gd);
		txt_dateEnd.addListener(SWT.Modify, new Listener() {
			
			@Override
			public void handleEvent(Event arg0) {
				// TODO Auto-generated method stub
				dateend = txt_dateEnd.getText();
			}
		});
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

	private Listener getIDsv(final Text txt_idSinhVien) {
		return new Listener() {

	        public void handleEvent(Event e) {

	            idsv = txt_idSinhVien.getText();

	        }

	    };
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
							+ "VALUES ('" + idsv + "','"+tensv+"',to_date('"+ngaysinh+"','YYYY/MM/DD'),'"+diachi+"','"+status+"','"+idLop+"','"+datejoin+"','"+dateend+"')";
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


