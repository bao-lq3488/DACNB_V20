package view;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;


public class Form_XoaSua {
	public Form_XoaSua(){
		
		Display display = new Display();
		Shell shell = new Shell(display, SWT.CLOSE);
		shell.setText("Xoa");
		shell.setSize(300, 180);
		
		Label Thongtin = new Label(shell, SWT.CENTER | SWT.BORDER);
		Thongtin.setText("Nhap Ten Mon Can Xoa - Sua");
		Thongtin.setSize(170, 20);
		Thongtin.setLocation(70, 20);
		
		Text textbox = new Text(shell, SWT.LEFT);
		textbox.setSize(150, 20);
		textbox.setLocation(80, 50);
		
		Button Search = new Button(shell, SWT.CENTER);
		Search.setSize(50, 25);
		Search.setLocation(140, 90);
		Search.setText("Search");
		
		Button Cancel = new Button(shell, SWT.CENTER);
		Cancel.setSize(50, 25);
		Cancel.setLocation(200, 90);
		Cancel.setText("Cancel");
		
		Label LietKeMH = new Label(shell, SWT.LEFT);
		LietKeMH.setText("Liet Ke Mon Hoc");
		LietKeMH.setLocation(30, 95);
		LietKeMH.setSize(90, 20);
		LietKeMH.setForeground(display.getSystemColor(SWT.COLOR_BLUE));	
		
		
		shell.open();

		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		display.dispose();
	}

	public static void main(String args[]) {
		new Form_XoaSua();
	}
}
