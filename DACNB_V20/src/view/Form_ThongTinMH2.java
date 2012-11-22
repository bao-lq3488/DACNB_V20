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
	Display display;
	Shell shell;
	Label label;
	Button button;
	Text text;

	public Form_ThongTinMH2() {
		setDisplay();

		setLabel();
		this.label.setSize(120, 20);
		this.label.setText("Thong Tin Mon Hoc");
		this.label.setLocation(80, 20);

		setTextbox();
		this.text.setSize(160, 40);
		this.text.setLocation(60, 55);

		setButton();
		this.button.setSize(50, 25);
		this.button.setText("Cancel");
		this.button.setLocation(200, 110);
		this.button.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event event) {
				System.exit(0);
			}
		});
		
		shell.open();

		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		display.dispose();
	}

	public void setDisplay() {
		this.display = new Display();
		this.shell = new Shell(display, SWT.CLOSE);
		this.shell.setText("Thong Tin Mon Hoc");
		this.shell.setSize(300, 180);
	}

	public void setLabel() {
		this.label = new Label(shell, SWT.CENTER | SWT.BORDER);
	}

	public void setTextbox() {
		this.text = new Text(shell, SWT.LEFT | SWT.READ_ONLY | SWT.BORDER
				| SWT.V_SCROLL);
	}

	public void setButton() {
		this.button = new Button(shell, SWT.CENTER);
	}

	public static void main(String args[]) {
		new Form_ThongTinMH2();

	}

}
