package view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class Form_ThemSV {
	
	Shell shell;

	public Form_ThemSV(Shell mainShell) {

		shell = new Shell(mainShell, SWT.APPLICATION_MODAL | SWT.CLOSE);
		
		createUI();
	
		shell.open();
	}
	
	private void createUI() {
	
		shell.setSize(300, 200);
		shell.setText("In An");
		shell.setLocation(10, 10);
	
		Label lblThongTin = new Label(shell, SWT.CENTER | SWT.BORDER);
		lblThongTin.setText("Nhap Sinh Vien Can Them");
		lblThongTin.setLocation(60, 20);
		lblThongTin.setSize(160, 20);
		
		Text txtBox = new Text(shell, SWT.LEFT | SWT.V_SCROLL | SWT.WRAP);
		txtBox.setLocation(45, 50);
		txtBox.setSize(200, 70);

		Button btnOk = new Button(shell, SWT.CENTER);
		btnOk.setSize(50, 25);
		btnOk.setLocation(140, 130);
		btnOk.setText("Ok");
		
		Button btnCancel = new Button(shell, SWT.CENTER);
		btnCancel.setSize(50, 25);
		btnCancel.setLocation(200, 130);
		btnCancel.setText("Cancel");
		btnCancel.addListener(SWT.Selection, btn_Cancle_Clicked());
	}

	public Listener btn_Cancle_Clicked() {
		return new Listener() {
			public void handleEvent(Event event) {
				shell.close();
			}
		};
	}
}
