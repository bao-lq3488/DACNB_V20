package view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class Form_ThongTinMH {
	Display display;
	Shell shell;
	Label label;
	Text Text;
	Button button;

	public Form_ThongTinMH() {
		setDisplay();

		setLabel();
		this.label.setSize(120, 20);
		this.label.setText("Nhap Ten Mon Hoc");
		this.label.setLocation(80, 20);

		setTextbox();
		this.Text.setSize(140, 20);
		this.Text.setLocation(70, 55);

		setButtonSearch();
		this.button.setSize(50, 25);
		this.button.setText("Search");
		this.button.setLocation(140, 90);

		setButtonCancel();
		this.button.setSize(50, 25);
		this.button.setText("Cancel");
		this.button.setLocation(200, 90);
		this.button.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event event) {
				System.exit(0);
			}
		});

		setLabelDanhSach();
		this.label.setText("Danh Sach Mon Hoc");
		this.label.setSize(115, 20);
		this.label.setLocation(10, 95);
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
		this.shell.setText("Thong Tin Mon Hoc");
		this.shell.setSize(300, 180);
	}

	public void setLabel() {
		this.label = new Label(shell, SWT.CENTER | SWT.BORDER);
	}

	public void setTextbox() {
		this.Text = new Text(shell, SWT.LEFT);
	}

	public void setButtonSearch() {
		this.button = new Button(shell, SWT.CENTER);
	}

	public void setButtonCancel() {
		this.button = new Button(shell, SWT.CENTER);
	}

	public void setLabelDanhSach() {
		this.label = new Label(shell, SWT.LEFT);
	}

	public static void main(String args[]) {
		new Form_ThongTinMH();

	}

}
