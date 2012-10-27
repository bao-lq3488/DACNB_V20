import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class Form_ThemSV {
	public Form_ThemSV() {
		Display display = new Display();
		Shell shell = new Shell(display, SWT.CLOSE);
		shell.setText("Them Sinh Vien");
		shell.setSize(300, 200);

		Label ThongTin = new Label(shell, SWT.CENTER | SWT.BORDER);
		ThongTin.setText("Nhap Thong Tin Can Them");
		ThongTin.setLocation(60, 20);
		ThongTin.setSize(160, 20);

		Text textbox = new Text(shell, SWT.LEFT | SWT.V_SCROLL | SWT.WRAP);
		textbox.setLocation(45, 50);
		textbox.setSize(200, 70);

		Button Ok = new Button(shell, SWT.CENTER);
		Ok.setSize(50, 25);
		Ok.setLocation(140, 130);
		Ok.setText("Ok");

		Button Cancel = new Button(shell, SWT.CENTER);
		Cancel.setSize(50, 25);
		Cancel.setLocation(200, 130);
		Cancel.setText("Cancel");

		shell.open();

		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		display.dispose();
	}

	public static void main(String args[]) {
		new Form_ThemSV();

	}
}
