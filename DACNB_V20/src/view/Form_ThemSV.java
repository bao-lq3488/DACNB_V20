package view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class Form_ThemSV {
	Display display;
	Shell shell;
	Label label;
	Text text;
	Button button;

	public Form_ThemSV() {
		setDisplay();

		setLabelThongTin();
		this.label.setText("Nhap Thong Tin Can Them");
		this.label.setLocation(60, 20);
		this.label.setSize(160, 20);

		setTextbox();
		this.text.setLocation(45, 50);
		this.text.setSize(200, 70);

		setButtonOk();
		this.button.setSize(50, 25);
		this.button.setLocation(140, 130);
		this.button.setText("Ok");

		setButtonCancel();
		this.button.setSize(50, 25);
		this.button.setLocation(200, 130);
		this.button.setText("Cancel");
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
		this.shell.setText("Them Sinh Vien");
		this.shell.setSize(300, 200);
	}

	public void setLabelThongTin() {
		this.label = new Label(shell, SWT.CENTER | SWT.BORDER);
	}

	public void setTextbox() {
		this.text = new Text(shell, SWT.LEFT | SWT.V_SCROLL | SWT.WRAP);
	}

	public void setButtonOk() {
		this.button = new Button(shell, SWT.CENTER);
	}

	public void setButtonCancel() {
		this.button = new Button(shell, SWT.CENTER);
	}

	public static void main(String args[]) {
		new Form_ThemSV();

	}
}
