package view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class Form_CapNhatDiem_MH {

	Shell shell;

	public Form_CapNhatDiem_MH(Shell mainShell) {
		
		shell = new Shell(mainShell, SWT.APPLICATION_MODAL | SWT.CLOSE);

		createUI();

		shell.open();
	}

	private void createUI() {
		
		shell.setSize(300, 180);
		shell.setText("Update");
		shell.setLocation(10, 10);
		
		Label lblThongTin = new Label(shell, SWT.CENTER | SWT.BORDER);
		lblThongTin.setText("Nhap Ten Mon Hoc");
		lblThongTin.setSize(120, 20);
		lblThongTin.setLocation(90, 20);

		Text txtBox = new Text(shell, SWT.LEFT);
		txtBox.setSize(150, 20);
		txtBox.setLocation(75, 50);

		Button btnOk = new Button(shell, SWT.CENTER);
		btnOk.setSize(50, 25);
		btnOk.setLocation(140, 90);
		btnOk.setText("Ok");

		Button btnCancel = new Button(shell, SWT.CENTER);
		btnCancel.setSize(50, 25);
		btnCancel.setLocation(200, 90);
		btnCancel.setText("Cancel");
		btnCancel.addListener(SWT.Selection, btn_Cancle_Clicked());

		Label lblLietKe = new Label(shell, SWT.LEFT);
		lblLietKe.setText("Danh Sach Mon Hoc");
		lblLietKe.setLocation(15, 95);
		lblLietKe.setSize(110, 20);
		// lbLietKe.setForeground(display.getSystemColor(SWT.COLOR_BLUE));
	}

	public Listener btn_Cancle_Clicked() {
		return new Listener() {
			public void handleEvent(Event event) {
				shell.close();
			}
		};
	}
}
