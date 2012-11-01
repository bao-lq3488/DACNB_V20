package view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class Form_ThongTinMH {
	Display display;
	Shell shell;
	Label Label;
	Text Text;
	Button Button;

	public Form_ThongTinMH() {
		setDisplay();

		setLabel();
		this.Label.setSize(120, 20);
		this.Label.setText("Nhap Ten Mon Hoc");
		this.Label.setLocation(80, 20);

		setTextbox();
		this.Text.setSize(140, 20);
		this.Text.setLocation(70, 55);

		setButtonSearch();
		this.Button.setSize(50, 25);
		this.Button.setText("Search");
		this.Button.setLocation(140, 90);

		setButtonCancel();
		this.Button.setSize(50, 25);
		this.Button.setText("Cancel");
		this.Button.setLocation(200, 90);

		setLabelDanhSach();
		this.Label.setText("Danh Sach Mon Hoc");
		this.Label.setSize(115, 20);
		this.Label.setLocation(10, 95);
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
		this.shell.setText("Thong Tin Mon Hoc");
		this.shell.setSize(300, 180);
	}

	public void setLabel() {
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

	public void setLabelDanhSach() {
		this.Label = new Label(shell, SWT.LEFT);
	}

	public static void main(String args[]) {
		new Form_ThongTinMH();

	}

}
