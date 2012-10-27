package view;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class Form_XoaSua2 {
	public Form_XoaSua2() {

		Display display = new Display();
		Shell shell = new Shell(display, SWT.CLOSE);
		shell.setText("Xoa");
		shell.setSize(300, 180);

		Label Thongtin = new Label(shell, SWT.CENTER | SWT.BORDER);
		Thongtin.setText("Thong Tin Mon Hoc");
		Thongtin.setSize(120, 20);
		Thongtin.setLocation(80, 20);

		Text textbox = new Text(shell, SWT.LEFT | SWT.READ_ONLY | SWT.V_SCROLL | SWT.BORDER);
		textbox.setSize(170, 40);
		textbox.setLocation(60, 50);

		Button Sua = new Button(shell, SWT.CENTER);
		Sua.setSize(50, 25);
		Sua.setLocation(60, 110);
		Sua.setText("Sua");

		Button Xoa = new Button(shell, SWT.CENTER);
		Xoa.setSize(50, 25);
		Xoa.setLocation(120, 110);
		Xoa.setText("Xoa");

		Button Cancel = new Button(shell, SWT.CENTER);
		Cancel.setSize(50, 25);
		Cancel.setLocation(180, 110);
		Cancel.setText("Cancel");

		shell.open();

		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		display.dispose();
	}

	public static void main(String args[]) {
		new Form_XoaSua2();
	}
}
