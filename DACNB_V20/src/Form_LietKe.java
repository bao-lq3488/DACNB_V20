import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;


public class Form_LietKe {
	public Form_LietKe(){
		Display display = new Display();
		Shell shell = new Shell(display, SWT.CLOSE);
		shell.setText("Liet Ke");
		shell.setSize(300, 180);
		
		Label TenMH = new Label(shell, SWT.CENTER | SWT.BORDER);
		TenMH.setText("Ten Mon Hoc");
		TenMH.setSize(85, 20);
		TenMH.setLocation(5, 10);
		
		Label kedoc1 = new Label(shell, SWT.SEPARATOR | SWT.VERTICAL);
		kedoc1.setLocation(90, 0);
		kedoc1.setSize(30, 200);
		
		Label KiHieu = new Label(shell, SWT.CENTER | SWT.BORDER);
		KiHieu.setText("Ki Hieu");
		KiHieu.setSize(45, 20);
		KiHieu.setLocation(120, 10);
		
		Label kedoc2 = new Label(shell, SWT.SEPARATOR | SWT.VERTICAL);
		kedoc2.setLocation(160, 0);
		kedoc2.setSize(30, 200);
		
		Label SoTC = new Label(shell, SWT.CENTER | SWT.BORDER);
		SoTC.setText("So Tin Chi");
		SoTC.setSize(70, 20);
		SoTC.setLocation(190, 10);
		
		Label kedoc3 = new Label(shell, SWT.SEPARATOR | SWT.HORIZONTAL | SWT.SHADOW_OUT);
		kedoc3.setLocation(0, 20);
		kedoc3.setSize(300, 30);
		
		shell.open();

		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		display.dispose();
	}

	public static void main(String args[]) {
		new Form_LietKe();
	
	}
}
