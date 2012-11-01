package view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

public class Form_LietKe {
	Display display;
	Shell shell;
	Label Label;

	public Form_LietKe() {
		setDisplay();

		setLabelTenMH();
		this.Label.setText("Ten Mon Hoc");
		this.Label.setSize(85, 20);
		this.Label.setLocation(5, 10);

		setLabelKedoc1();
		this.Label.setLocation(90, 0);
		this.Label.setSize(30, 200);

		setLabelKiHieu();
		this.Label.setText("Ki Hieu");
		this.Label.setSize(45, 20);
		this.Label.setLocation(120, 10);

		setLabelKedoc2();
		this.Label.setLocation(160, 0);
		this.Label.setSize(30, 200);

		setLabelTC();
		this.Label.setText("So Tin Chi");
		this.Label.setSize(70, 20);
		this.Label.setLocation(190, 10);

		setLabelKengang();
		this.Label.setLocation(0, 20);
		this.Label.setSize(300, 30);

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
		this.shell.setText("Liet Ke");
		this.shell.setSize(300, 180);
	}

	public void setLabelTenMH() {
		this.Label = new Label(shell, SWT.CENTER | SWT.BORDER);
	}

	public void setLabelKedoc1() {
		this.Label = new Label(shell, SWT.SEPARATOR | SWT.VERTICAL);
	}

	public void setLabelKiHieu() {
		this.Label = new Label(shell, SWT.CENTER | SWT.BORDER);
	}

	public void setLabelKedoc2() {
		this.Label = new Label(shell, SWT.SEPARATOR | SWT.VERTICAL);
	}

	public void setLabelTC() {
		this.Label = new Label(shell, SWT.CENTER | SWT.BORDER);
	}

	public void setLabelKengang() {
		this.Label = new Label(shell, SWT.SEPARATOR | SWT.HORIZONTAL
				| SWT.SHADOW_OUT);
	}

	public static void main(String args[]) {
		new Form_LietKe();

	}
}
