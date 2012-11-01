package view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class Form_ThemSV {
	Display display;
	Shell shell;
	Label Label;
	Text Text;
	Button Button;

	public Form_ThemSV() {
		setDisplay();

		setLabelThongTin();
		this.Label.setText("Nhap Thong Tin Can Them");
		this.Label.setLocation(60, 20);
		this.Label.setSize(160, 20);

		setTextbox();
		this.Text.setLocation(45, 50);
		this.Text.setSize(200, 70);

		setButtonOk();
		this.Button.setSize(50, 25);
		this.Button.setLocation(140, 130);
		this.Button.setText("Ok");

		setButtonCancel();
		this.Button.setSize(50, 25);
		this.Button.setLocation(200, 130);
		this.Button.setText("Cancel");

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
		this.Label = new Label(shell, SWT.CENTER | SWT.BORDER);
	}

	public void setTextbox() {
		this.Text = new Text(shell, SWT.LEFT | SWT.V_SCROLL | SWT.WRAP);
	}

	public void setButtonOk() {
		this.Button = new Button(shell, SWT.CENTER);
	}

	public void setButtonCancel() {
		this.Button = new Button(shell, SWT.CENTER);
	}

	public static void main(String args[]) {
		new Form_ThemSV();

	}
}
