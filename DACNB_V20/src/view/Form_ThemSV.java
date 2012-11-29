package view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class Form_ThemSV {
	
	Shell shell;
	Label label;
	Text text;
	Button button;

	public Form_ThemSV(Display display) {

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
	
		shell.setSize(300, 200);
	
		Label lbThongTin = new Label(shell, SWT.CENTER | SWT.BORDER);
		lbThongTin.setText("Nhap Sinh Vien Can Them");
		lbThongTin.setLocation(60, 20);
		lbThongTin.setSize(160, 20);
		
		Text txbox = new Text(shell, SWT.LEFT | SWT.V_SCROLL | SWT.WRAP);
		txbox.setLocation(45, 50);
		txbox.setSize(200, 70);

		Button btOk = new Button(shell, SWT.CENTER);
		btOk.setSize(50, 25);
		btOk.setLocation(140, 130);
		btOk.setText("Ok");
		
		Button btCancel = new Button(shell, SWT.CENTER);
		btCancel.setSize(50, 25);
		btCancel.setLocation(200, 130);
		btCancel.setText("Cancel");
		btCancel.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event event) {
				System.exit(0);
			}
		});
	}
}
