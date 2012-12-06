package view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class Form_ThongTinMH {

	Shell shell;

	public Form_ThongTinMH(Shell mainShell) {
		shell = new Shell(mainShell, SWT.APPLICATION_MODAL | SWT.CLOSE);
		
		createUI();

		shell.open();
	}

	private void createUI() {

		shell.setSize(300, 180);
		shell.setLocation(10, 10);
		shell.setText("Thong Tin Mon Hoc");

		Label lblTenMH = new Label(shell, SWT.CENTER | SWT.BORDER);
		lblTenMH.setSize(120, 20);
		lblTenMH.setText("Nhap Ten Mon Hoc");
		lblTenMH.setLocation(80, 20);

		Text txtBox = new Text(shell, SWT.LEFT);
		txtBox.setSize(140, 20);
		txtBox.setLocation(70, 55);

		Button btnSearch = new Button(shell, SWT.CENTER);
		btnSearch.setSize(50, 25);
		btnSearch.setText("Search");
		btnSearch.setLocation(140, 90);
		btnSearch.addListener(SWT.Selection, btn_Search_Clicked());

		Button btnCancel = new Button(shell, SWT.CENTER);
		btnCancel.setSize(50, 25);
		btnCancel.setText("Cancel");
		btnCancel.setLocation(200, 90);
		btnCancel.addListener(SWT.Selection, btn_Cancle_Clicked());

		Label lblDanhSach = new Label(shell, SWT.LEFT);
		lblDanhSach.setText("Danh Sach Mon Hoc");
		lblDanhSach.setSize(115, 20);
		lblDanhSach.setLocation(10, 95);
//		lbDanhSach.setForeground(display.getSystemColor(SWT.COLOR_BLUE));

	}

	public Listener btn_Cancle_Clicked() {
		return new Listener() {
			public void handleEvent(Event event) {
				shell.close();
			}
		};
	}

	public Listener btn_Search_Clicked() {
		return new Listener() {
			public void handleEvent(Event event) {
			new Form_ThongTinMH2(shell.getDisplay());
			}
		};
	}
}
