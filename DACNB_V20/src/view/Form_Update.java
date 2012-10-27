package view;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class Form_Update {
	public Form_Update() {
		Display display = new Display();
		Shell shell = new Shell(display, SWT.CLOSE);
		shell.setText("Cap Nhat Diem");
		shell.setSize(300, 180);

		Label Thongtin = new Label(shell, SWT.CENTER | SWT.BORDER);
		Thongtin.setText("Nhap Ten Mon Hoc");
		Thongtin.setSize(120, 20);
		Thongtin.setLocation(90, 20);

		Text textbox = new Text(shell, SWT.LEFT);
		textbox.setSize(150, 20);
		textbox.setLocation(75, 50);

		Button Ok = new Button(shell, SWT.CENTER);
		Ok.setSize(50, 25);
		Ok.setLocation(140, 90);
		Ok.setText("Ok");

		Button Cancel = new Button(shell, SWT.CENTER);
		Cancel.setSize(50, 25);
		Cancel.setLocation(200, 90);
		Cancel.setText("Cancel");

		Label LietKeMH = new Label(shell, SWT.LEFT);
		LietKeMH.setText("Danh Sach Mon Hoc");
		LietKeMH.setLocation(15, 95);
		LietKeMH.setSize(110, 20);
		LietKeMH.setForeground(display.getSystemColor(SWT.COLOR_BLUE));

		shell.open();

		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		display.dispose();
	}

	public static void main(String args[]) {
		new Form_Update();
	}
}
