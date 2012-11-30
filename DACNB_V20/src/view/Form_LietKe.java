package view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

public class Form_LietKe {

	Shell shell;
	Label label;

	public Form_LietKe(Shell mainShell) {

		shell = new Shell(mainShell, SWT.APPLICATION_MODAL | SWT.CLOSE);
		shell.setText("Liet Ke");

		createUI();

		shell.setLocation(10, 10);

		shell.open();

//		while (!shell.isDisposed()) {
//			if (!display.readAndDispatch()) {
//				display.sleep();
//			}
//		}
//		display.dispose();
	}

	private void createUI() {
		
		shell.setSize(300, 180);
		
		Label lbTenMH = new Label(shell, SWT.CENTER | SWT.BORDER);
		lbTenMH.setText("Ten Mon Hoc");
		lbTenMH.setSize(85, 20);
		lbTenMH.setLocation(5, 10);
		
		Label lbKeDoc1 = new Label(shell, SWT.SEPARATOR | SWT.VERTICAL);
		lbKeDoc1.setLocation(90, 0);
		lbKeDoc1.setSize(30, 200);
		
		Label lbKiHieu = new Label(shell, SWT.CENTER | SWT.BORDER);
		lbKiHieu.setText("Ki Hieu");
		lbKiHieu.setSize(45, 20);
		lbKiHieu.setLocation(120, 10);
		
		Label lbKeDoc2 = new Label(shell, SWT.SEPARATOR | SWT.VERTICAL);
		lbKeDoc2.setLocation(160, 0);
		lbKeDoc2.setSize(30, 200);
		
		Label lbTC = new Label(shell, SWT.CENTER | SWT.BORDER);
		lbTC.setText("So Tin Chi");
		lbTC.setSize(70, 20);
		lbTC.setLocation(190, 10);
		
		Label lbKeNgang = new Label(shell, SWT.SEPARATOR | SWT.HORIZONTAL
		| SWT.SHADOW_OUT);
		lbKeNgang.setLocation(0, 20);
		lbKeNgang.setSize(300, 30);
	}


}
