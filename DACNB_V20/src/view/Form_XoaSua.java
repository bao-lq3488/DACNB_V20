package view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class Form_XoaSua {
	Display display;
	Shell shell;
	Label label;
	Text lext;
	Button button;

	public Form_XoaSua() {
		setDisplay();

		setLabelThongTin();
		this.label.setText("Nhap Ten Mon Can Xoa - Sua");
		this.label.setSize(170, 20);
		this.label.setLocation(70, 20);

		setTextbox();
		this.lext.setSize(150, 20);
		this.lext.setLocation(80, 50);

		setButtonSearch();
		this.button.setSize(50, 25);
		this.button.setLocation(140, 90);
		this.button.setText("Search");

		setButtonCancel();
		this.button.setSize(50, 25);
		this.button.setLocation(200, 90);
		this.button.setText("Cancel");
		this.button.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event event) {
				System.exit(0);
			}
		});
		
		setLabelLKMH();
		this.label.setText("Liet Ke Mon Hoc");
		this.label.setLocation(30, 95);
		this.label.setSize(90, 20);
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
		this.shell.setText("Xoa");
		this.shell.setSize(300, 180);
	}

	public void setLabelThongTin() {
		this.label = new Label(shell, SWT.CENTER | SWT.BORDER);
	}

	public void setTextbox() {
		this.lext = new Text(shell, SWT.LEFT);
	}

	public void setButtonSearch() {
		this.button = new Button(shell, SWT.CENTER);
	}

	public void setButtonCancel() {
		this.button = new Button(shell, SWT.CENTER);
	}

	public void setLabelLKMH() {
		this.label = new Label(shell, SWT.LEFT);
	}

	public static void main(String args[]) {
		new Form_XoaSua();
	}
}
