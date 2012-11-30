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
		shell.setText("Update");

		createUI();

		shell.setLocation(10, 10);

		shell.open();

//		while (!shell.isDisposed()) {
//			if (!mainShell.readAndDispatch()) {
//				mainShell.sleep();
//			}
//		}
//		mainShell.dispose();
	}

	private void createUI() {

		shell.setSize(300, 180);

		Label lbThongTin = new Label(shell, SWT.CENTER | SWT.BORDER);
		lbThongTin.setText("Nhap Ten Mon Can Xoa - Sua");
		lbThongTin.setSize(170, 20);
		lbThongTin.setLocation(70, 20);

		Text txBox = new Text(shell, SWT.LEFT);
		txBox.setSize(150, 20);
		txBox.setLocation(80, 50);

		Button btSearch = new Button(shell, SWT.CENTER);
		btSearch.setSize(50, 25);
		btSearch.setLocation(140, 90);
		btSearch.setText("Search");
		btSearch.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event event) {
				new Form_XoaSua2(shell.getDisplay());
			}
		});

		Button btCancel = new Button(shell, SWT.CENTER);
		btCancel.setSize(50, 25);
		btCancel.setLocation(200, 90);
		btCancel.setText("Cancel");
		btCancel.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event event) {
				System.exit(0);
			}
		});

		Label LietKeMH = new Label(shell, SWT.LEFT);
		LietKeMH.setText("Liet Ke Mon Hoc");
		LietKeMH.setLocation(30, 95);
		LietKeMH.setSize(90, 20);
		// LietKeMH.setForeground(display.getSystemColor(SWT.COLOR_BLUE));
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
