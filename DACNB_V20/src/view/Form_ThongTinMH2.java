package view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class Form_ThongTinMH2 {
	Display display;
	Shell shell;
	Label Label;
	Button Button;
	Text Text;

	public Form_ThongTinMH2() {
		setDisplay();

		setLabel();
		this.Label.setSize(120, 20);
		this.Label.setText("Thong Tin Mon Hoc");
		this.Label.setLocation(80, 20);

		setTextbox();
		this.Text.setSize(160, 40);
		this.Text.setLocation(60, 55);

		setButton();
		this.Button.setSize(50, 25);
		this.Button.setText("Thoat");
		this.Button.setLocation(200, 110);

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
		this.Label = new Label(shell, SWT.CENTER | SWT.BORDER);
	}

	public void setTextbox() {
		this.Text = new Text(shell, SWT.LEFT | SWT.READ_ONLY | SWT.BORDER
				| SWT.V_SCROLL);
	}

	public void setButton() {
		this.Button = new Button(shell, SWT.CENTER);
	}

	public static void main(String args[]) {
		new Form_ThongTinMH2();

	}

}
