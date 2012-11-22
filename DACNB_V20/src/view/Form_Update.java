package view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class Form_Update {
	Display display;
	Shell shell;
	Label label;
	Text text;
	Button button;

	public Form_Update() {
		setDisplay();

		setLabelThongTin();
		this.label.setText("Nhap Ten Mon Hoc");
		this.label.setSize(120, 20);
		this.label.setLocation(90, 20);

		setTextbox();
		this.text.setSize(150, 20);
		this.text.setLocation(75, 50);

		setButtonOk();
		this.button.setSize(50, 25);
		this.button.setLocation(140, 90);
		this.button.setText("Ok");

		setButtonCancel();
		this.button.setSize(50, 25);
		this.button.setLocation(200, 90);
		this.button.setText("Cancel");
		this.button.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event event) {
				System.exit(0);
			}
		});

		setLabelLietKe();
		this.label.setText("Danh Sach Mon Hoc");
		this.label.setLocation(15, 95);
		this.label.setSize(110, 20);
		this.label.setForeground(display.getSystemColor(SWT.COLOR_BLUE));

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
		this.shell.setText("Cap Nhat Diem");
		this.shell.setSize(300, 180);
	}

	public void setLabelThongTin() {
		this.label = new Label(shell, SWT.CENTER | SWT.BORDER);
	}

	public void setTextbox() {
		this.text = new Text(shell, SWT.LEFT);
	}

	public void setButtonOk() {
		this.button = new Button(shell, SWT.CENTER);
	}

	public void setButtonCancel() {
		this.button = new Button(shell, SWT.CENTER);
	}

	public void setLabelLietKe() {
		this.label = new Label(shell, SWT.LEFT);
	}

	public static void main(String args[]) {
		new Form_Update();
	}
}
