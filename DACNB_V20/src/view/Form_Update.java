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

	Shell shell;
	Label label;
	Text text;
	Button button;

	public Form_Update(Display display) {
		
		shell = new Shell(display, SWT.CLOSE);
		shell.setText("Update");

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
		
		shell.setSize(300, 180);
		
		Label lbThongTIn = new Label(shell, SWT.CENTER | SWT.BORDER);
		lbThongTIn.setText("Nhap Ten Mon Hoc");
		lbThongTIn.setSize(120, 20);
		lbThongTIn.setLocation(90, 20);

		Text txBox = new Text(shell, SWT.LEFT);
		txBox.setSize(150, 20);
		txBox.setLocation(75, 50);

		Button btOk = new Button(shell, SWT.CENTER);
		btOk.setSize(50, 25);
		btOk.setLocation(140, 90);
		btOk.setText("Ok");

		Button btCancel = new Button(shell, SWT.CENTER);
		btCancel.setSize(50, 25);
		btCancel.setLocation(200, 90);
		btCancel.setText("Cancel");
		btCancel.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event event) {
				System.exit(0);
			}
		});

		Label lbLietKe = new Label(shell, SWT.LEFT);
		lbLietKe.setText("Danh Sach Mon Hoc");
		lbLietKe.setLocation(15, 95);
		lbLietKe.setSize(110, 20);
		// lbLietKe.setForeground(display.getSystemColor(SWT.COLOR_BLUE));
	}
}
