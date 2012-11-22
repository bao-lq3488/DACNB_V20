package view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class Form_InAn {
	Display display;
	Shell shell;
	Label label;
	Text text;
	Button button;

	public Form_InAn() {
		setDisplay();

		setLabel();
		this.label.setText("Nhap Ten Mon Hoc/Sinh Vien");
		this.label.setSize(200, 20);
		this.label.setLocation(45, 20);

		setText();
		this.text.setLocation(90, 55);
		this.text.setSize(100, 20);

		setButtonSearch();
		this.button.setSize(50, 25);
		this.button.setLocation(130, 95);
		this.button.setText("Search");

		setButtonCancel();
		this.button.setSize(50, 25);
		this.button.setLocation(190, 95);
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
		this.shell.setText("In An");
		this.shell.setSize(300, 180);
	}

	public void setLabel() {
		this.label = new Label(shell, SWT.CENTER | SWT.BORDER);
	}

	public void setText() {
		this.text = new Text(shell, SWT.LEFT);
	}

	public void setButtonSearch() {
		this.button = new Button(shell, SWT.CENTER);
	}

	public void setButtonCancel() {
		this.button = new Button(shell, SWT.CENTER);
	}

	public static void main(String args[]) {
		new Form_InAn();

	}
}
