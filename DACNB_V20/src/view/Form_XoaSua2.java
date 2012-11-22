package view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class Form_XoaSua2 {
	Display display;
	Shell shell;
	Label Label;
	Text Text;
	Button button;

	public Form_XoaSua2() {
		setDisplay();

		setLabelThongTin();
		this.Label.setText("Thong Tin Mon Hoc");
		this.Label.setSize(120, 20);
		this.Label.setLocation(80, 20);

		setTextbox();
		this.Text.setSize(170, 40);
		this.Text.setLocation(60, 50);

		setButtonSua();
		this.button.setSize(50, 25);
		this.button.setLocation(60, 110);
		this.button.setText("Sua");

		setButtonXoa();
		this.button.setSize(50, 25);
		this.button.setLocation(120, 110);
		this.button.setText("Xoa");

		setButtonCancel();
		this.button.setSize(50, 25);
		this.button.setLocation(180, 110);
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
		this.shell.setText("Xoa");
		this.shell.setSize(300, 180);

	}

	public void setLabelThongTin() {
		this.Label = new Label(shell, SWT.CENTER | SWT.BORDER);
	}

	public void setTextbox() {
		this.Text = new Text(shell, SWT.LEFT | SWT.READ_ONLY | SWT.V_SCROLL
				| SWT.BORDER);
	}

	public void setButtonSua() {
		this.button = new Button(shell, SWT.CENTER);
	}

	public void setButtonXoa() {
		this.button = new Button(shell, SWT.CENTER);
	}

	public void setButtonCancel() {
		this.button = new Button(shell, SWT.CENTER);
	}

	public static void main(String args[]) {
		new Form_XoaSua2();
	}
}
