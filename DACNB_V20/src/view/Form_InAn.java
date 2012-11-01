package view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class Form_InAn {
	Display display;
	Shell shell;
	Label Label;
	Text Text;
	Button Button;

	public Form_InAn() {
		setDisplay();

		setLabel();
		this.Label.setText("Nhap Ten Mon Hoc/Sinh Vien");
		this.Label.setSize(200, 20);
		this.Label.setLocation(45, 20);

		setText();
		this.Text.setLocation(90, 55);
		this.Text.setSize(100, 20);

		setButtonSearch();
		this.Button.setSize(50, 25);
		this.Button.setLocation(130, 95);
		this.Button.setText("Search");
		
		setButtonCancel();
		this.Button.setSize(50, 25);
		this.Button.setLocation(190, 95);
		this.Button.setText("Cancel");

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
		this.Label = new Label(shell, SWT.CENTER | SWT.BORDER);
	}

	public void setText() {
		this.Text = new Text(shell, SWT.LEFT);
	}
	
	public void setButtonSearch(){
		this.Button = new Button(shell, SWT.CENTER);
	}

	public void setButtonCancel(){
		this.Button = new Button(shell, SWT.CENTER);
	}
	public static void main(String args[]) {
		new Form_InAn();

	}
}
