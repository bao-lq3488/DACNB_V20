package view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

public class Form_LietKe {

	Shell shell;

	public Form_LietKe(Shell mainShell) {

		shell = new Shell(mainShell, SWT.APPLICATION_MODAL | SWT.CLOSE);
		
		createUI();

		shell.open();
<<<<<<< HEAD

		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
=======
>>>>>>> branch 'master' of https://github.com/bao-lq3488/DACNB_V20.git
	}

	private void createUI() {
		
		shell.setSize(300, 180);
		shell.setText("Liet Ke");
		shell.setLocation(10, 10);
		
		Label lblTenMH = new Label(shell, SWT.CENTER | SWT.BORDER);
		lblTenMH.setText("Ten Mon Hoc");
		lblTenMH.setSize(85, 20);
		lblTenMH.setLocation(5, 10);
		
		Label lblKeDoc1 = new Label(shell, SWT.SEPARATOR | SWT.VERTICAL);
		lblKeDoc1.setLocation(90, 0);
		lblKeDoc1.setSize(30, 200);
		
		Label lblKiHieu = new Label(shell, SWT.CENTER | SWT.BORDER);
		lblKiHieu.setText("Ki Hieu");
		lblKiHieu.setSize(45, 20);
		lblKiHieu.setLocation(120, 10);
		
		Label lblKeDoc2 = new Label(shell, SWT.SEPARATOR | SWT.VERTICAL);
		lblKeDoc2.setLocation(160, 0);
		lblKeDoc2.setSize(30, 200);
		
		Label lblTC = new Label(shell, SWT.CENTER | SWT.BORDER);
		lblTC.setText("So Tin Chi");
		lblTC.setSize(70, 20);
		lblTC.setLocation(190, 10);
		
		Label lblKeNgang = new Label(shell, SWT.SEPARATOR | SWT.HORIZONTAL
		| SWT.SHADOW_OUT);
		lblKeNgang.setLocation(0, 20);
		lblKeNgang.setSize(300, 30);
	}
}
