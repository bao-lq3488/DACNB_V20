package view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.ScrollBar;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class Form_InAn2 {
	Display display;
	Shell shell;
	Label Label;
	Text Text;
	Button Button;
	
	public Form_InAn2() {
		setDisplay();
		
		setLabel();
		this.Label = new Label(shell, SWT.CENTER | SWT.BORDER);
		this.Text = new Text(shell, SWT.LEFT | SWT.READ_ONLY | SWT.BORDER| SWT.V_SCROLL);
		this.Text.setLocation(70, 55);
		this.Text.setSize(150, 40);

		setButtonIn();
		this.Button.setSize(50, 25);
		this.Button.setLocation(130, 110);
		this.Button.setText("In");

		setButtonCancel();
		this.Button.setSize(50, 25);
		this.Button.setLocation(190, 110);
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
	
	public void setLabel(){
		this.Label = new Label(shell, SWT.CENTER | SWT.BORDER);
		this.Label.setText("Danh Sach Mon Hoc/Sinh Vien");
		this.Label.setSize(180, 20);
		this.Label.setLocation(55, 20);
	}
	
	public void setButtonIn(){
		this.Button = new Button(shell, SWT.CENTER);
	}
	public void setButtonCancel(){
		this.Button = new Button(shell, SWT.CENTER);
	}

	public static void main(String args[]) {
		new Form_InAn2();
	}
}
