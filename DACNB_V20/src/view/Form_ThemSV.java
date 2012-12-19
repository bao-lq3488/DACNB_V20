package view;

import java.sql.Connection;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import controller.JDBCConnection;

public class Form_ThemSV {
	
	Shell shell;
	Text txt_idSinhVien;
	Text txt_tenSinhVien;

	public Form_ThemSV(Shell maiShell) {

		this.shell = new Shell(maiShell, SWT.APPLICATION_MODAL | SWT.CLOSE);
		
		createUI();
	
		Connection conn = null;
		JDBCConnection jdbccon = new JDBCConnection(conn);
		String query = "INSERT INTO SINHVIEN (IDSINHVIEN,TENSINHVIEN,NGAYSINH,DIACHI,STATUS,IDLOP,DATEJOIN,DATEEND) "
					+ "VALUES ('"+ txt_idSinhVien.getText() +"','" + txt_tenSinhVien.getText() + "',to_date('1991/01/01','YYYY/MM/DD'),'HCM','DANG HOC','QL091A','2009','2012')";
		jdbccon.insertQuery(query, conn);
		this.shell.open();
	}
	
	private void createUI() {
	
//		shell.setSize(300, 200);
//		shell.setText("In An");
//		shell.setLocation(10, 10);
//	
//		Label lblThongTin = new Label(shell, SWT.CENTER | SWT.BORDER);
//		lblThongTin.setText("Nhap Sinh Vien Can Them");
//		lblThongTin.setLocation(60, 20);
//		lblThongTin.setSize(160, 20);
//		
//		Text txtBox = new Text(shell, SWT.LEFT | SWT.V_SCROLL | SWT.WRAP);
//		txtBox.setLocation(45, 50);
//		txtBox.setSize(200, 70);

		GridLayout gl = new GridLayout();
		gl.numColumns = 4;
		gl.verticalSpacing = 10;

		GridData gd = new GridData(SWT.FILL,SWT.FILL,true,true);
		Label lbl_idSinhVien = new Label(this.shell, SWT.CENTER);
		lbl_idSinhVien.setText("ID Sinh Vien:");
		lbl_idSinhVien.setLayoutData(gd);
		
		gd = new GridData(SWT.FILL,SWT.FILL,true,true);
		Text txt_idSinhVien = new Text(this.shell, SWT.CENTER);
		txt_idSinhVien.setLayoutData(gd);

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
				// Muon save thi ghi duoi dong nay
				
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
