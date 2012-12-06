package view;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.ControlListener;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
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
	Label labelAcc, labelPass, thongBaoChao;
	Text textAcc, textPass;
	Button buttonOk, buttonCancel, buttonGhiNho;
	Combo combo;
	
	public Login(Display display) {
	
		shell = new Shell(display);
		
		creatUI();

		shell.open();
		shell.addKeyListener(escClicked());
		
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	public KeyListener escClicked() {
		return new KeyListener() {
			
			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
			
			@Override
			public void keyPressed(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		};
	}

	public void creatUI() {
		
		shell.setText("Quan Ly Sinh Vien");
		shell.setSize(300, 200);

		thongBaoChao = new Label(shell, SWT.LEFT | SWT.BORDER);
		thongBaoChao.setText("Xin Chao, Moi Dang Nhap");
		thongBaoChao.setSize(145, 18);
		thongBaoChao.setLocation(80, 15);

		labelAcc = new Label(shell, SWT.LEFT);
		labelAcc.setLocation(10, 50);
		labelAcc.setSize(50, 20);
		labelAcc.setText("Account");

		textAcc = new Text(shell, SWT.LEFT | SWT.BORDER);
		textAcc.setLocation(90, 45);
		textAcc.setSize(500, 100);
		textAcc.setBackground(shell.getDisplay().getSystemColor(SWT.COLOR_WHITE));
		textAcc.setForeground(shell.getDisplay().getSystemColor(SWT.COLOR_BLACK));
		textAcc.pack();

		labelPass = new Label(shell, SWT.LEFT);
		labelPass.setLocation(10, 80);
		labelPass.setSize(50, 20);
		labelPass.setText("Password");

		textPass = new Text(shell, SWT.LEFT | SWT.BORDER);
		textPass.setText("");
		textPass.setLocation(90, 75);
		textPass.setSize(50, 50);
		textPass.setBackground(shell.getDisplay().getSystemColor(SWT.COLOR_WHITE));
		textPass.setForeground(shell.getDisplay().getSystemColor(SWT.COLOR_BLACK));
		textPass.setEchoChar('*');
		textPass.pack();

		
		buttonOk = new Button(shell, SWT.CENTER);
		buttonOk.setSize(50, 25);
		buttonOk.setText("Login");
		buttonOk.setLocation(150, 130);
		buttonOk.addListener(SWT.Selection, btn_Ok_Clicked());
		
		textAcc.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		textPass.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		buttonCancel = new Button(shell, SWT.CENTER);
		buttonCancel.setSize(50, 25);
		buttonCancel.setText("Cancel");
		buttonCancel.setLocation(225, 130);
		buttonCancel.addListener(SWT.Selection, btn_Cancle_Clicked());

		buttonGhiNho = new Button(shell, SWT.RADIO);
		buttonGhiNho.setLocation(220, 104);
		buttonGhiNho.setText("Ghi Nho");
		buttonGhiNho.setSize(90, 20);

		combo = new Combo(shell, SWT.DROP_DOWN);
		String[] data = { "Sinh Vien", "Phong Dao Tao" };
		combo.setItems(data);
		combo.select(1);
		combo.setItems(data);
		combo.setSize(90, 20);
		combo.setLocation(10, 130);
		combo.setText("Sinh Vien");
		
	}

	public Listener btn_Cancle_Clicked() {
		return new Listener() {
			public void handleEvent(Event event) {
				textAcc.setText("");
				textPass.setText("");
				textAcc.setFocus();
			}
		};
	}

	public Listener btn_Ok_Clicked() {
		return new Listener() {
			public void handleEvent(Event event) {
				String Username = textAcc.getText();
				String Password = textPass.getText();

				if ("".equals(Username) || ("".equals(Password))) {
					MessageBox messageBox = new MessageBox(shell, SWT.ICON_ERROR);
					messageBox.setMessage("Enter the your Account or Password");
					messageBox.open();
				} else {
					MessageBox messageBox = new MessageBox(shell, SWT.OK);
					messageBox.setText("Login Form");
					messageBox.setMessage("Welcome " + textAcc.getText());
					messageBox.open();
					
					shell.getDisplay().dispose();
					Display display = new Display();
					new Main_QLMH(display);
				}
				
			}
		};
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
