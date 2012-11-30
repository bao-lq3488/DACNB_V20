package view;

import org.eclipse.swt.SWT;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class Login {
	
	Shell shell;
	Label LabelAcc, LabelPass, Chao;
	Text TextAcc, TextPass;
	Button ButtonOk, ButtonCancel, ButtonGhiNho;
	Combo combo;
	public Login(Display display) {
		shell = new Shell(display);
		shell.setText("Quan Ly Sinh Vien");
		shell.setSize(300, 200);

		Chao = new Label(shell, SWT.LEFT | SWT.BORDER);
		Chao.setText("Xin Chao, Moi Dang Nhap");
		Chao.setSize(145, 18);
		Chao.setLocation(80, 15);

		LabelAcc = new Label(shell, SWT.LEFT);
		LabelAcc.setLocation(10, 50);
		LabelAcc.setSize(50, 20);
		LabelAcc.setText("Account");

		TextAcc = new Text(shell, SWT.LEFT | SWT.BORDER);
		TextAcc.setLocation(90, 45);
		TextAcc.setSize(500, 100);
		TextAcc.setBackground(display.getSystemColor(SWT.COLOR_WHITE));
		TextAcc.setForeground(display.getSystemColor(SWT.COLOR_BLACK));
		TextAcc.pack();

		LabelPass = new Label(shell, SWT.LEFT);
		LabelPass.setLocation(10, 80);
		LabelPass.setSize(50, 20);
		LabelPass.setText("Password");

		TextPass = new Text(shell, SWT.LEFT | SWT.BORDER);
		TextPass.setText("");
		TextPass.setLocation(90, 75);
		TextPass.setSize(50, 50);
		TextPass.setBackground(display.getSystemColor(SWT.COLOR_WHITE));
		TextPass.setForeground(display.getSystemColor(SWT.COLOR_BLACK));
		TextPass.setEchoChar('*');
		TextPass.pack();

		
		ButtonOk = new Button(shell, SWT.CENTER);
		ButtonOk.setSize(50, 25);
		ButtonOk.setText("Login");
		ButtonOk.setLocation(150, 130);
		ButtonOk.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event event) {
				String Username = TextAcc.getText();
				String Password = TextPass.getText();

				if ("".equals(Username) || ("".equals(Password))) {
					MessageBox messageBox = new MessageBox(shell, SWT.ICON_ERROR);
					messageBox.setMessage("Enter the your Account or Password");
					messageBox.open();
				} else {
					MessageBox messageBox = new MessageBox(shell, SWT.OK);
					messageBox.setText("Login Form");
					messageBox.setMessage("Welcome " + TextAcc.getText());
					messageBox.open();
					shell.getDisplay().dispose();
					Display display = new Display();
					new Main_QLMH(display);
				}
				
			}
		});
		
		TextAcc.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		TextPass.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		ButtonCancel = new Button(shell, SWT.CENTER);
		ButtonCancel.setSize(50, 25);
		ButtonCancel.setText("Cancel");
		ButtonCancel.setLocation(225, 130);
		ButtonCancel.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event event) {
				System.exit(0);
			}
		});

		ButtonGhiNho = new Button(shell, SWT.RADIO);
		ButtonGhiNho.setLocation(220, 104);
		ButtonGhiNho.setText("Ghi Nho");
		ButtonGhiNho.setSize(90, 20);

		combo = new Combo(shell, SWT.DROP_DOWN);
		String[] data = { "Sinh Vien", "Phong Dao Tao" };
		combo.setItems(data);
		combo.select(1);
		combo.setItems(data);
		combo.setSize(90, 20);
		combo.setLocation(10, 130);
		combo.setText("Sinh Vien");

		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	protected String TextPass() {
		return null;
	}

	protected String TextAcc() {
		return null;
	}

	public static void main(String args[]) {
		Display display = new Display();
		new Login(display);
		
		display.dispose();
	}
}
