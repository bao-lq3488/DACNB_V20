package view;

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

import controller.themSinhVien;

public class Form_ThemSV {

	public Text getTxt_idSinhVien() {
		return txt_idSinhVien;
	}

	public Text getTxt_tenSinhVien() {
		return txt_tenSinhVien;
	}

	public Text getTxt_ngaysinhSinhVien() {
		return txt_ngaysinhSinhVien;
	}

	public Text getTxt_diachi() {
		return txt_diachi;
	}

	public Text getTxt_status() {
		return txt_status;
	}

	public Text getTxt_idLop() {
		return txt_idLop;
	}

	public Text getTxt_dateJoin() {
		return txt_dateJoin;
	}

	public Text getTxt_dateEnd() {
		return txt_dateEnd;
	}

	public void setTxt_idSinhVien(Text txt_idSinhVien) {
		this.txt_idSinhVien = txt_idSinhVien;
	}

	public void setTxt_tenSinhVien(Text txt_tenSinhVien) {
		this.txt_tenSinhVien = txt_tenSinhVien;
	}

	public void setTxt_ngaysinhSinhVien(Text txt_ngaysinhSinhVien) {
		this.txt_ngaysinhSinhVien = txt_ngaysinhSinhVien;
	}

	public void setTxt_diachi(Text txt_diachi) {
		this.txt_diachi = txt_diachi;
	}

	public void setTxt_status(Text txt_status) {
		this.txt_status = txt_status;
	}

	public void setTxt_idLop(Text txt_idLop) {
		this.txt_idLop = txt_idLop;
	}

	public void setTxt_dateJoin(Text txt_dateJoin) {
		this.txt_dateJoin = txt_dateJoin;
	}

	public void setTxt_dateEnd(Text txt_dateEnd) {
		this.txt_dateEnd = txt_dateEnd;
	}

	Shell shell;
	Text txt_idSinhVien, txt_tenSinhVien, txt_ngaysinhSinhVien, txt_diachi,
			txt_status;
	Text txt_idLop, txt_dateJoin, txt_dateEnd;

	public Form_ThemSV(Shell maiShell) {

		this.shell = new Shell(maiShell, SWT.APPLICATION_MODAL | SWT.CLOSE);

		createUI();

		this.shell.open();
	}

	private void createUI() {

		// shell.setSize(300, 200);
		// shell.setText("In An");
		// shell.setLocation(10, 10);
		//
		// Label lblThongTin = new Label(shell, SWT.CENTER | SWT.BORDER);
		// lblThongTin.setText("Nhap Sinh Vien Can Them");
		// lblThongTin.setLocation(60, 20);
		// lblThongTin.setSize(160, 20);
		//
		// Text txtBox = new Text(shell, SWT.LEFT | SWT.V_SCROLL | SWT.WRAP);
		// txtBox.setLocation(45, 50);
		// txtBox.setSize(200, 70);

		GridLayout gl = new GridLayout();
		gl.numColumns = 4;
		gl.verticalSpacing = 10;

		GridData gd = new GridData(SWT.FILL, SWT.FILL, true, true);
		Label lbl_idSinhVien = new Label(this.shell, SWT.CENTER);
		lbl_idSinhVien.setText("ID Sinh Vien:");
		lbl_idSinhVien.setLayoutData(gd);

		gd = new GridData(SWT.FILL, SWT.FILL, true, true);
		txt_idSinhVien = new Text(shell, SWT.LEFT | SWT.BORDER);
		txt_idSinhVien.setLayoutData(gd);

		gd = new GridData(SWT.FILL, SWT.FILL, true, true);
		Label lbl_tenSinhVien = new Label(this.shell, SWT.CENTER);
		lbl_tenSinhVien.setText("Ten Sinh Vien:");
		lbl_tenSinhVien.setLayoutData(gd);

		gd = new GridData(SWT.FILL, SWT.FILL, true, true);
		txt_tenSinhVien = new Text(this.shell, SWT.CENTER);
		txt_tenSinhVien.setLayoutData(gd);

		gd = new GridData(SWT.FILL, SWT.FILL, true, true);
		Label lbl_ngaysinhSinhVien = new Label(this.shell, SWT.CENTER);
		lbl_ngaysinhSinhVien.setText("Ngay Sinh:");
		lbl_ngaysinhSinhVien.setLayoutData(gd);

		gd = new GridData(SWT.FILL, SWT.FILL, true, true);
		txt_ngaysinhSinhVien = new Text(this.shell, SWT.CENTER);
		txt_ngaysinhSinhVien.setLayoutData(gd);

		gd = new GridData(SWT.FILL, SWT.FILL, true, true);
		Label lbl_diachi = new Label(this.shell, SWT.CENTER);
		lbl_diachi.setText("Dia Chi:");
		lbl_diachi.setLayoutData(gd);

		gd = new GridData(SWT.FILL, SWT.FILL, true, true);
		txt_diachi = new Text(this.shell, SWT.CENTER);
		txt_diachi.setLayoutData(gd);

		gd = new GridData(SWT.FILL, SWT.FILL, true, true);
		Label lbl_status = new Label(this.shell, SWT.CENTER);
		lbl_status.setText("Tinh Trang:");
		lbl_status.setLayoutData(gd);

		gd = new GridData(SWT.FILL, SWT.FILL, true, true);
		txt_status = new Text(this.shell, SWT.CENTER);
		txt_status.setLayoutData(gd);

		gd = new GridData(SWT.FILL, SWT.FILL, true, true);
		Label lbl_idLop = new Label(this.shell, SWT.CENTER);
		lbl_idLop.setText("Ma Lop:");
		lbl_idLop.setLayoutData(gd);

		gd = new GridData(SWT.FILL, SWT.FILL, true, true);
		txt_idLop = new Text(this.shell, SWT.CENTER);
		txt_idLop.setLayoutData(gd);

		gd = new GridData(SWT.FILL, SWT.FILL, true, true);
		Label lbl_dateJoin = new Label(this.shell, SWT.CENTER);
		lbl_dateJoin.setText("Ngay Nhap Hoc:");
		lbl_dateJoin.setLayoutData(gd);

		gd = new GridData(SWT.FILL, SWT.FILL, true, true);
		txt_dateJoin = new Text(this.shell, SWT.CENTER);
		txt_dateJoin.setLayoutData(gd);

		gd = new GridData(SWT.FILL, SWT.FILL, true, true);
		Label lbl_dateEnd = new Label(this.shell, SWT.CENTER);
		lbl_dateEnd.setText("Ngay Ket Thuc:");
		lbl_dateEnd.setLayoutData(gd);

		gd = new GridData(SWT.FILL, SWT.FILL, true, true);
		txt_dateEnd = new Text(this.shell, SWT.CENTER);
		txt_dateEnd.setLayoutData(gd);

		gd = new GridData(SWT.FILL, SWT.FILL, true, true);
		Button btnOk = new Button(this.shell, SWT.CENTER);
		btnOk.setText("Ok");
		btnOk.setLayoutData(gd);
		btnOk.addListener(SWT.Selection, btn_Ok_Clicked());

		gd = new GridData(SWT.FILL, SWT.FILL, true, true);
		Button btnCancel = new Button(shell, SWT.CENTER);
		btnCancel.setText("Cancel");
		btnOk.setLayoutData(gd);
		btnCancel.addListener(SWT.Selection, btn_Cancle_Clicked());

		this.shell.setLayout(gl);

	}

	private Listener btn_Ok_Clicked() {

		return new Listener() {
			public void handleEvent(Event event) {
				// String idSinhVien = txt_idSinhVien.getText();
				// String tenSinhVien = txt_tenSinhVien.getText();
				// String ngaysinh = txt_ngaysinhSinhVien.getText();
				themSinhVien themsinhvien = new themSinhVien();
				if (themsinhvien.doAddSinhVien() == true) {
					MessageBox messageBox = new MessageBox(shell,
							SWT.ICON_ERROR);
					messageBox.setMessage("Da them thanh cong");
					messageBox.open();
				} else {
					MessageBox messageBox = new MessageBox(shell,
							SWT.ICON_ERROR);
					messageBox.setMessage("them khong thanh cong");
					messageBox.open();
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
