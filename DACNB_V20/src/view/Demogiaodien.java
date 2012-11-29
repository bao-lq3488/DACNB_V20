//package view;
//
//import org.eclipse.swt.SWT;
//import org.eclipse.swt.widgets.Button;
//import org.eclipse.swt.widgets.Combo;
//import org.eclipse.swt.widgets.Display;
//import org.eclipse.swt.widgets.Label;
//import org.eclipse.swt.widgets.MessageBox;
//import org.eclipse.swt.widgets.Shell;
//import org.eclipse.swt.widgets.Text;
//
//public class Demogiaodien {
//
//	Display display;
//	Shell shell;
//	Label Label;
//	Text Text;
//	Button Button;
//	Combo Combo;
//
//	public Demogiaodien() {
//
//		setDisplay();
//
//		setLabelChao();
//		this.Label.setText(" Xin Chao, Moi Dang Nhap");
//		this.Label.setSize(145, 18);
//		this.Label.setLocation(80, 15);
//
//		setLabelAcc();
//		this.Label.setLocation(10, 50);
//		this.Label.setSize(50, 20);
//		this.Label.setText("Account");
//
//		setTextAcc();
//		this.Text.setLocation(90, 45);
//		this.Text.setSize(50, 100);
//		this.Text.setBackground(display.getSystemColor(SWT.COLOR_WHITE));
//		this.Text.setForeground(display.getSystemColor(SWT.COLOR_BLACK));
//		this.Text.pack();
//
//		setLabelPass();
//		this.Label.setLocation(10, 80);
//		this.Label.setSize(50, 20);
//		this.Label.setText("Password");
//
//		setTextPass();
//		this.Text.setText("");
//		this.Text.setLocation(90, 75);
//		this.Text.setSize(50, 50);
//		this.Text.setBackground(display.getSystemColor(SWT.COLOR_WHITE));
//		this.Text.setForeground(display.getSystemColor(SWT.COLOR_BLACK));
//		this.Text.setEchoChar('*');
//		this.Text.pack();
//
//		setButtonOk();
//		this.Button.setSize(50, 25);
//		this.Button.setText("Login");
//		this.Button.setLocation(150, 130);
//		
//<<<<<<< HEAD
////		 buttonOk.addListener(SWT.Selection, new Listener()) {
////		 public void handleEvent(Event event) {
////		 String username = textacc.getText();
////		 String password = textpass.getText();
////		
////		 if ("".equals(username)) {
////		
////
////		 MessageBox messageBox = new MessageBox(shell, SWT.OK
////		 | SWT.ICON_ERROR | SWT.CANCEL);
////		 messageBox
////		 .setMessage("Vui Long Khai Bao Username Va Password");
////		 messageBox.open();
////		 }
////		 if ("".equals(password)) {
////		 MessageBox messageBox = new MessageBox(shell, SWT.OK
////		 | SWT.ICON_WARNING | SWT.CANCEL);
////		 messageBox.setMessage("Nhap Password");
////		 messageBox.open();
////		 } else {
////		 MessageBox messageBox = new MessageBox(shell, SWT.OK
////		 | SWT.CANCEL);
////		messageBox.setText("Login Form");
////		 messageBox.setMessage("Welcome: " + textacc.getText());
////		 messageBox.open();
////		 }
////		 }
////		 
////
////		 User user = new User();
////		 if (user.checkLogin(username, password)){
////		 hello welcome
////		 }
////		});
//=======
//					
//					MessageBox messageBox = new MessageBox(shell, SWT.OK
//							| SWT.ICON_ERROR | SWT.CANCEL);
//					messageBox
//							.setMessage("Vui Long Khai Bao Username Va Password");
//					messageBox.open();
//				}
//				if (password == "") {
//					MessageBox messageBox = new MessageBox(shell, SWT.OK
//							| SWT.ICON_WARNING | SWT.CANCEL);
//					messageBox.setMessage("Nhap Password");
//					messageBox.open();
//				} else {
////					MessageBox messageBox = new MessageBox(shell, SWT.OK
////							| SWT.CANCEL);
////					messageBox.setText("Login Form");
////					messageBox.setMessage("Welcome: " + textacc.getText());
////					messageBox.open();
//				//	User user = new User();
//					//if (user.checkLogin(username, password)){
//						// hello welcome
//					}
//				}
//			
//		});
//		
//>>>>>>> branch 'master' of https://github.com/bao-lq3488/DACNB_V20.git
//
//		setButtonCancel();
//		this.Button.setSize(50, 25);
//		this.Button.setText("Cancel");
//		this.Button.setLocation(225, 130);
//
//		setButtonGhiNho();
//		this.Button.setLocation(220, 104);
//		this.Button.setText("Ghi Nho");
//		this.Button.setSize(90, 20);
//
//		String[] data = { "Sinh Vien", "Giang Vien", "Phong Dao Tao" };
//		setCombo();
//		this.Combo.setItems(data);
//		this.Combo.select(1);
//		this.Combo.setItems(data);
//		this.Combo.setSize(90, 20);
//		this.Combo.setLocation(10, 130);
//		this.Combo.setText("Sinh Vien");
//
//		shell.open();
//
//		while (!shell.isDisposed()) {
//			if (!display.readAndDispatch())
//				display.sleep();
//		}
//		display.dispose();
//	}
//
//	public void setDisplay() {
//		this.display = new Display();
//		this.shell = new Shell(display, SWT.CLOSE);
//		this.shell.setText("Quan Ly Sinh Vien");
//		this.shell.setSize(300, 200);
//	}
//
//	public void setLabelChao() {
//		this.Label = new Label(shell, SWT.LEFT | SWT.BORDER);
//	}
//
//	public void setLabelAcc() {
//		this.Label = new Label(shell, SWT.LEFT);
//	}
//
//	public void setTextAcc() {
//		this.Text = new Text(shell, SWT.LEFT | SWT.BORDER);
//	}
//
//	public void setLabelPass() {
//		this.Label = new Label(shell, SWT.LEFT);
//	}
//
//	public void setTextPass() {
//		this.Text = new Text(shell, SWT.LEFT | SWT.BORDER);
//	}
//
//	public void setButtonOk() {
//		this.Button = new Button(shell, SWT.CENTER);
//	}
//
//	public void setButtonCancel() {
//		this.Button = new Button(shell, SWT.CENTER);
//	}
//
//	public void setButtonGhiNho() {
//		this.Button = new Button(shell, SWT.RADIO);
//	}
//
//	public void setCombo() {
//		this.Combo = new Combo(shell, SWT.DROP_DOWN);
//	}
//
//	public static void main(String args[]) {
//		new Demogiaodien();
//	}
//
//}
