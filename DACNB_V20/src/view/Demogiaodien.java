package view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class Demogiaodien {

	public Demogiaodien() {

		Display display = new Display();
		final Shell shell = new Shell(display, SWT.CLOSE);
		shell.setText("Quan Ly Sinh Vien");
		shell.setSize(300, 200);

		Label chao = new Label(shell, SWT.LEFT | SWT.BORDER);
		chao.setText(" Xin Chao, Moi Dang Nhap");
		chao.setSize(145, 18);
		chao.setLocation(80, 15);

		Label labelDangNhap = new Label(shell, SWT.LEFT);
		labelDangNhap.setLocation(10, 50);
		labelDangNhap.setSize(50, 20);
		labelDangNhap.setText("Account");

		final Text textacc = new Text(shell, SWT.LEFT | SWT.BORDER);
		textacc.setLocation(90, 45);
		textacc.setSize(50, 100);
		textacc.setBackground(display.getSystemColor(SWT.COLOR_WHITE));
		textacc.setForeground(display.getSystemColor(SWT.COLOR_BLACK));
		textacc.pack();

		Label labelpass = new Label(shell, SWT.LEFT);
		labelpass.setLocation(10, 80);
		labelpass.setSize(50, 20);
		labelpass.setText("Password");

		final Text textpass = new Text(shell, SWT.LEFT | SWT.BORDER);
		textpass.setText("");
		textpass.setLocation(90, 75);
		textpass.setSize(50, 50);
		textpass.setBackground(display.getSystemColor(SWT.COLOR_WHITE));
		textpass.setForeground(display.getSystemColor(SWT.COLOR_BLACK));
		textpass.setEchoChar('*');
		textpass.pack();

		Button buttonOk = new Button(shell, SWT.CENTER);
		buttonOk.setSize(50, 25);
		buttonOk.setText("Login");
		buttonOk.setLocation(150, 130);
		buttonOk.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event event) {
				String username = textacc.getText();
				String password = textpass.getText();

				if ("".equals(username)) {
		
					
					MessageBox messageBox = new MessageBox(shell, SWT.OK
							| SWT.ICON_ERROR | SWT.CANCEL);
					messageBox
							.setMessage("Vui Long Khai Bao Username Va Password");
					messageBox.open();
				}
				if (password == "") {
					MessageBox messageBox = new MessageBox(shell, SWT.OK
							| SWT.ICON_WARNING | SWT.CANCEL);
					messageBox.setMessage("Nhap Password");
					messageBox.open();
				} else {
//					MessageBox messageBox = new MessageBox(shell, SWT.OK
//							| SWT.CANCEL);
//					messageBox.setText("Login Form");
//					messageBox.setMessage("Welcome: " + textacc.getText());
//					messageBox.open();
				//	User user = new User();
					//if (user.checkLogin(username, password)){
						// hello welcome
					}
				}
			
		});
		


		Button buttonCancel = new Button(shell, SWT.CENTER);
		buttonCancel.setSize(50, 25);
		buttonCancel.setText("Cancel");
		buttonCancel.setLocation(225, 130);
		

		Button buttonluu = new Button(shell, SWT.RADIO);
		buttonluu.setLocation(220, 104);
		buttonluu.setText("Ghi Nho");
		buttonluu.setSize(90, 20);

		String[] data = { "Sinh Vien", "Giang Vien", "Phong Dao Tao" };
		Combo combo = new Combo(shell, SWT.DROP_DOWN);
		combo.setItems(data);
		combo.select(1);
		combo.setItems(data);
		combo.setSize(90, 20);
		combo.setLocation(10, 130);
		combo.setText("Sinh Vien");

		// Text Doipass = new Text(shell, SWT.CENTER | SWT.WRAP);
		// Doipass.setText("Doi Mat Khau");
		// Doipass.setSize(80, 15);
		// Doipass.setLocation(50, 100);
		// Doipass.setBackground(display.getSystemColor(SWT.COLOR_WHITE));
		// Doipass.setForeground(display.getSystemColor(SWT.COLOR_BLACK));

		shell.open();

		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		display.dispose();
	}

	public static void main(String args[]) {
		new Demogiaodien();
	}

}
