package view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class Form_XoaSua {

	Shell shell;
	Label label;
	Text lext;
	Button button;

	public Form_XoaSua(Shell mainShell) {

		shell = new Shell(mainShell, SWT.APPLICATION_MODAL | SWT.CLOSE);

		createUI();

		shell.open();
	}

	private void createUI() {

		shell.setSize(300, 180);
		shell.setLocation(10, 10);
		shell.setText("Xoa & Sua");

		Label lblThongTin = new Label(shell, SWT.CENTER | SWT.BORDER);
		lblThongTin.setText("Nhap Ten Mon Can Xoa - Sua");
		lblThongTin.setSize(170, 20);
		lblThongTin.setLocation(70, 20);

		Text txtBox = new Text(shell, SWT.LEFT);
		txtBox.setSize(150, 20);
		txtBox.setLocation(80, 50);

		Button btnSearch = new Button(shell, SWT.CENTER);
		btnSearch.setSize(50, 25);
		btnSearch.setLocation(140, 90);
		btnSearch.setText("Search");
		btnSearch.addListener(SWT.Selection, btn_Search_Clicked());

		Button btnCancel = new Button(shell, SWT.CENTER);
		btnCancel.setSize(50, 25);
		btnCancel.setLocation(200, 90);
		btnCancel.setText("Cancel");
		btnCancel.addListener(SWT.Selection, btn_Cancle_Clicked());

		Label lietKeMH = new Label(shell, SWT.LEFT);
		lietKeMH.setText("Liet Ke Mon Hoc");
		lietKeMH.setLocation(30, 95);
		lietKeMH.setSize(90, 20);
		// LietKeMH.setForeground(display.getSystemColor(SWT.COLOR_BLUE));
	}

	public Listener btn_Search_Clicked() {
		return new Listener() {
			public void handleEvent(Event event) {
				new Form_XoaSua2(shell.getDisplay());
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

	//
	// setButtonCancel();
	// this.button.
	//
	// setLabelLKMH();
	// this.label.setText("Liet Ke Mon Hoc");
	// this.label.setLocation(30, 95);
	// this.label.setSize(90, 20);
	// this.label.setForeground(display.getSystemColor(SWT.COLOR_BLUE));
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
	// this.shell.setSize(300, 180);
	// }
	//

	// public void setTextbox() {
	// this.lext = new Text(shell, SWT.LEFT);
	// }
	//
	// public void
	//
	// public static void main(String args[]) {
	// new Form_XoaSua();
	// }
}
