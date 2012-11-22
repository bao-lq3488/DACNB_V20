package view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.ScrollBar;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class Form_InAn2 {
	Display display;
	Shell shell;
	Label label;
	Text text;
	Button button;
	
	public Form_InAn2() {
		setDisplay();
		
		setLabel();
		this.label = new Label(shell, SWT.CENTER | SWT.BORDER);
		this.text = new Text(shell, SWT.LEFT | SWT.READ_ONLY | SWT.BORDER| SWT.V_SCROLL);
		this.text.setLocation(70, 55);
		this.text.setSize(150, 40);

		setButtonIn();
		this.button.setSize(50, 25);
		this.button.setLocation(130, 110);
		this.button.setText("In");

		setButtonCancel();
		this.button.setSize(50, 25);
		this.button.setLocation(190, 110);
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
	
	public void setLabel(){
		this.label = new Label(shell, SWT.CENTER | SWT.BORDER);
		this.label.setText("Danh Sach Mon Hoc/Sinh Vien");
		this.label.setSize(180, 20);
		this.label.setLocation(55, 20);
	}
	
	public void setButtonIn(){
		this.button = new Button(shell, SWT.CENTER);
	}
	public void setButtonCancel(){
		this.button = new Button(shell, SWT.CENTER);
	}

	public static void main(String args[]) {
		new Form_InAn2();
	}
}
