package view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

public class Form_LietKe {
	Display display;
	Shell shell;
	Label label;

	public Form_LietKe() {
		setDisplay();

		setLabelTenMH();
		this.label.setText("Ten Mon Hoc");
		this.label.setSize(85, 20);
		this.label.setLocation(5, 10);

		setLabelKedoc1();
		this.label.setLocation(90, 0);
		this.label.setSize(30, 200);

		setLabelKiHieu();
		this.label.setText("Ki Hieu");
		this.label.setSize(45, 20);
		this.label.setLocation(120, 10);

		setLabelKedoc2();
		this.label.setLocation(160, 0);
		this.label.setSize(30, 200);

		setLabelTC();
		this.label.setText("So Tin Chi");
		this.label.setSize(70, 20);
		this.label.setLocation(190, 10);

		setLabelKengang();
		this.label.setLocation(0, 20);
		this.label.setSize(300, 30);

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
		this.label = new Label(shell, SWT.CENTER | SWT.BORDER);
	}

	public void setLabelKedoc1() {
		this.label = new Label(shell, SWT.SEPARATOR | SWT.VERTICAL);
	}

	public void setLabelKiHieu() {
		this.label = new Label(shell, SWT.CENTER | SWT.BORDER);
	}

	public void setLabelKedoc2() {
		this.label = new Label(shell, SWT.SEPARATOR | SWT.VERTICAL);
	}

	public void setLabelTC() {
		this.label = new Label(shell, SWT.CENTER | SWT.BORDER);
	}

	public void setLabelKengang() {
		this.label = new Label(shell, SWT.SEPARATOR | SWT.HORIZONTAL
				| SWT.SHADOW_OUT);
	}

	public static void main(String args[]) {
		new Form_LietKe();

	}
}
