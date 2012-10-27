package view;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;


public class Form_ThongTinMH2 {

	public Form_ThongTinMH2(){

		Display display = new Display();
		Shell shell = new Shell(display, SWT.CLOSE);
		shell.setText("Thong Tin Mon Hoc");
		shell.setSize(300, 180);
		
		Label NhapTen = new Label(shell, SWT.CENTER | SWT.BORDER);
		NhapTen.setSize(120, 20);
		NhapTen.setText("Thong Tin Mon Hoc");
		NhapTen.setLocation(80, 20);
		
		Text textbox = new Text(shell, SWT.LEFT | SWT.READ_ONLY | SWT.BORDER | SWT.V_SCROLL);
		textbox.setSize(160, 40);
		textbox.setLocation(60, 55);
		
		Button Thoat = new Button(shell, SWT.CENTER);
		Thoat.setSize(50, 25);
		Thoat.setText("Thoat");
		Thoat.setLocation(200, 110);
		
		shell.open();

		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		display.dispose();
	}

	public static void main(String args[]) {
		new Form_ThongTinMH2();
		
	}
	
}

