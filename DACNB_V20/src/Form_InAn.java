import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class Form_InAn {
	public Form_InAn() {
		Display display = new Display();
		Shell shell = new Shell(display, SWT.CLOSE);
		shell.setText("In An");
		shell.setSize(300, 180);

		Label Nhapten = new Label(shell, SWT.CENTER | SWT.BORDER);
		Nhapten.setText("Nhap Ten Mon Hoc/Sinh Vien");
		Nhapten.setSize(200, 20);
		Nhapten.setLocation(45, 20);
		
		Text textbox = new Text(shell, SWT.LEFT);
		textbox.setLocation(90, 55);
		textbox.setSize(100, 20);
		
		Button Search = new Button(shell, SWT.CENTER);
		Search.setSize(50, 25);
		Search.setLocation(130, 95);
		Search.setText("Search");
		
		Button Cancel = new Button(shell, SWT.CENTER);
		Cancel.setSize(50, 25);
		Cancel.setLocation(190, 95);
		Cancel.setText("Cancel");
		
		shell.open();

		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		display.dispose();
	}

	public static void main(String args[]) {
		new Form_InAn();

	}
}
