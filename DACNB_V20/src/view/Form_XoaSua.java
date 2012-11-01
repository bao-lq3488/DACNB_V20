package view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class Form_XoaSua {
	Display display;
	Shell shell;
	Label Label;
	Text Text;
	Button Button;

	public Form_XoaSua() {
		setDisplay();

		setLabelThongTin();
		this.Label.setText("Nhap Ten Mon Can Xoa - Sua");
		this.Label.setSize(170, 20);
		this.Label.setLocation(70, 20);

		setTextbox();
		this.Text.setSize(150, 20);
		this.Text.setLocation(80, 50);

		setButtonSearch();
		this.Button.setSize(50, 25);
		this.Button.setLocation(140, 90);
		this.Button.setText("Search");

		setButtonCancel();
		this.Button.setSize(50, 25);
		this.Button.setLocation(200, 90);
		this.Button.setText("Cancel");

		setLabelLKMH();
		this.Label.setText("Liet Ke Mon Hoc");
		this.Label.setLocation(30, 95);
		this.Label.setSize(90, 20);
		this.Label.setForeground(display.getSystemColor(SWT.COLOR_BLUE));

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
		this.shell.setText("Xoa");
		this.shell.setSize(300, 180);
	}

	public void setLabelThongTin() {
		this.Label = new Label(shell, SWT.CENTER | SWT.BORDER);
	}

	public void setTextbox() {
		this.Text = new Text(shell, SWT.LEFT);
	}

	public void setButtonSearch() {
		this.Button = new Button(shell, SWT.CENTER);
	}

	public void setButtonCancel() {
		this.Button = new Button(shell, SWT.CENTER);
	}

	public void setLabelLKMH() {
		this.Label = new Label(shell, SWT.LEFT);
	}

	public static void main(String args[]) {
		new Form_XoaSua();
	}
}
