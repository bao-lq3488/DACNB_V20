package view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class Form_XoaSua2 {

	Shell shell;

	public Form_XoaSua2(Display display) {

		shell = new Shell(display, SWT.APPLICATION_MODAL | SWT.CLOSE);

		createUI();

		shell.open();
	}
	
	private void createUI() {

		shell.setSize(300, 180);
		shell.setText("Update");
		shell.setLocation(10, 10);

		Label lbThongTin = new Label(shell, SWT.CENTER | SWT.BORDER);
		lbThongTin.setText("Thong Tin Mon Hoc");
		lbThongTin.setSize(120, 20);
		lbThongTin.setLocation(80, 20);

		Text txBox = new Text(shell, SWT.LEFT | SWT.READ_ONLY | SWT.V_SCROLL
				| SWT.BORDER);
		txBox.setSize(170, 40);
		txBox.setLocation(60, 50);

		Button btSua = new Button(shell, SWT.CENTER);
		btSua.setSize(50, 25);
		btSua.setLocation(60, 110);
		btSua.setText("Sua");

		Button btXoa = new Button(shell, SWT.CENTER);
		btXoa.setSize(50, 25);
		btXoa.setLocation(120, 110);
		btXoa.setText("Xoa");

		Button btCancel = new Button(shell, SWT.CENTER);
		btCancel.setSize(50, 25);
		btCancel.setLocation(180, 110);
		btCancel.setText("Cancel");
		btCancel.addListener(SWT.Selection, btn_Cancle_Clicked());
		// setButtonCancel();
		// this.button.setSize(50, 25);
		// this.button.setLocation(180, 110);
		// this.button.setText("Cancel");
		// this.button.addListener(SWT.Selection, new Listener() {
		// public void handleEvent(Event event) {
		// System.exit(0);
		// }
		// });
		//
		// shell.open();
		//
		// while (!shell.isDisposed()) {
		// if (!display.readAndDispatch())
		// display.sleep();
		// }
		// display.dispose();
		// }
		//
		// public void setDisplay() {
		// this.display = new Display();
		// this.shell = new Shell(display, SWT.CLOSE);
		// this.shell.setText("Xoa");
		// this.
		//
		// }
		//
		// public void setTextbox() {
		// this.Text = new Text(shell, SWT.LEFT | SWT.READ_ONLY | SWT.V_SCROLL
		// | SWT.BORDER);
		// }
		//
		// public void setButtonSua() {
		// this.button = new Button(shell, SWT.CENTER);
		// }
		//
		// public void setButtonXoa() {
		// this.button = new Button(shell, SWT.CENTER);
		// }
		//
		// public void setButtonCancel() {
		// this.button = new Button(shell, SWT.CENTER);
		// }
		//
		// public static void main(String args[]) {
		// new Form_XoaSua2();
	}

	public Listener btn_Cancle_Clicked() {
		return new Listener() {
			public void handleEvent(Event event) {
				shell.close();
			}
		};
	}
}
