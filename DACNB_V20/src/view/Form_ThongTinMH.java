package view;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;


public class Form_ThongTinMH {

	public Form_ThongTinMH(){

		Display display = new Display();
		Shell shell = new Shell(display, SWT.CLOSE);
		shell.setText("Thong Tin Mon Hoc");
		shell.setSize(300, 180);
		
		Label NhapTen = new Label(shell, SWT.CENTER | SWT.BORDER);
		NhapTen.setSize(120, 20);
		NhapTen.setText("Nhap Ten Mon Hoc");
		NhapTen.setLocation(80, 20);
		
		Text textbox = new Text(shell, SWT.LEFT);
		textbox.setSize(140, 20);
		textbox.setLocation(70, 55);
		
		Button Search = new Button(shell, SWT.CENTER);
		Search.setSize(50, 25);
		Search.setText("Search");
		Search.setLocation(140, 90);
		
		Button Cancel = new Button(shell, SWT.CENTER);
		Cancel.setSize(50, 25);
		Cancel.setText("Cancel");
		Cancel.setLocation(200, 90);
		
		Label Danhsach = new Label(shell, SWT.LEFT);
		Danhsach.setText("Danh Sach Mon Hoc");
		Danhsach.setSize(115, 20);
		Danhsach.setLocation(10, 95);
		Danhsach.setForeground(display.getSystemColor(SWT.COLOR_BLUE));	
		
		shell.open();

		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		display.dispose();
	}

	public static void main(String args[]) {
		new Form_ThongTinMH();

	}
	
}
