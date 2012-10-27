package view;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.ScrollBar;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class Form_InAn2 {
	public Form_InAn2() {
		Display display = new Display();
		Shell shell = new Shell(display, SWT.CLOSE);
		shell.setText("In An");
		shell.setSize(300, 180);

		Label Nhapten = new Label(shell, SWT.CENTER | SWT.BORDER);
		Nhapten.setText("Danh Sach Mon Hoc/Sinh Vien");
		Nhapten.setSize(180, 20);
		Nhapten.setLocation(55, 20);
		
		Text textbox = new Text(shell, SWT.LEFT | SWT.READ_ONLY | SWT.BORDER | SWT.V_SCROLL);
		textbox.setLocation(70, 55);
		textbox.setSize(150, 40);
		
		Button In = new Button(shell, SWT.CENTER);
		In.setSize(50, 25);
		In.setLocation(130, 110);
		In.setText("In");
		
		Button Cancel = new Button(shell, SWT.CENTER);
		Cancel.setSize(50, 25);
		Cancel.setLocation(190, 110);
		Cancel.setText("Cancel");
		
		shell.open();

		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		display.dispose();
	}

	public static void main(String args[]) {
		new Form_InAn2();

	}
}
