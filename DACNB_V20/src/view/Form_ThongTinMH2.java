package view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class Form_ThongTinMH2 {

	Shell shell;
	Label label;
	Button button;
	Text text;

	public Form_ThongTinMH2(Display display) {
		shell = new Shell(display, SWT.CLOSE);
		shell.setText("Thong Tin Mon Hoc");

		createUI();

		shell.setLocation(10, 10);

		shell.open();

		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		display.dispose();
	}
	private void createUI(){
		shell.setSize(300, 180);

		Label lb = new Label(shell, SWT.CENTER | SWT.BORDER);
		lb.setSize(120, 20);
		lb.setText("Thong Tin Mon Hoc");
		lb.setLocation(80, 20);

		Text txBox = new Text(shell, SWT.LEFT | SWT.READ_ONLY | SWT.BORDER
				| SWT.V_SCROLL);
		txBox.setSize(160, 40);
		txBox.setLocation(60, 55);

		Button tbCancel = new Button(shell, SWT.CENTER);
		tbCancel.setSize(50, 25);
		tbCancel.setText("Cancel");
		tbCancel.setLocation(200, 110);
		tbCancel.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event event) {
				System.exit(0);
			}
		});
	}

	// setButton();
	// this.button.setSize(50, 25);
	// this.button.setText("Cancel");
	// this.button.setLocation(200, 110);
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
	// this.shell.setText("Thong Tin Mon Hoc");
	// this.shell.
	// }
	//
	// public void setLabel() {
	// this.label = new Label(shell, SWT.CENTER | SWT.BORDER);
	// }
	//
	// public void setTextbox() {
	// this.text = new Text(shell, SWT.LEFT | SWT.READ_ONLY | SWT.BORDER
	// | SWT.V_SCROLL);
	// }
	//
	// public void setButton() {
	// this.button
	// }
	//
	// public static void main(String args[]) {
	// new Form_ThongTinMH2();
	//
	// }

}
