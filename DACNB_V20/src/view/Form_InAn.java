package view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class Form_InAn {
	
	Shell shell;
	Label label;
	Text text;
	Button button;

	public Form_InAn(Display display) {

		shell = new Shell(display, SWT.CLOSE);
		shell.setText("In An");
		
		createUI();

		shell.setLocation(10, 10);

		shell.open();

		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		display.dispose();
	}

	private void createUI() {
		
		shell.setSize(300, 280);
		
		Label lb = new Label(shell, SWT.CENTER | SWT.BORDER);
		lb.setText("Nhap Ten Mon Hoc/Sinh Vien");
		lb.setSize(200, 20);
		lb.setLocation(45, 20);
		
		Text tx = new Text(shell, SWT.LEFT);
		tx.setLocation(90, 55);
		tx.setSize(100, 20);
		
		Button ButtonSearch = new Button(shell, SWT.CENTER);
		ButtonSearch.setSize(50, 25);
		ButtonSearch.setLocation(130, 95);
		ButtonSearch.setText("Search");

		Button ButtonCancel = new Button(shell, SWT.CENTER);
		ButtonCancel.setSize(50, 25);
		ButtonCancel.setLocation(190, 95);
		ButtonCancel.setText("Cancel");
		ButtonCancel.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event event) {
				System.exit(0);
			}
		});
		
		Text txread = new Text(shell, SWT.LEFT | SWT.READ_ONLY | SWT.BORDER| SWT.V_SCROLL);
		txread.setLocation(50, 135);
		txread.setSize(190, 100);
	}

}
