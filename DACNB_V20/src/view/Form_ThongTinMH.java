package view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class Form_ThongTinMH {

	Shell shell;
	Label label;
	Text Text;
	Button button;

	public Form_ThongTinMH(Display display) {
		shell = new Shell(display, SWT.CLOSE);
		shell.setText("Thong Tin Mon Hoc");

		createUI();

		shell.setLocation(10, 10);

		shell.open();

		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		display.dispose();
	}

	private void createUI() {

		shell.setSize(300, 180);

		Label lbTenMH = new Label(shell, SWT.CENTER | SWT.BORDER);
		lbTenMH.setSize(120, 20);
		lbTenMH.setText("Nhap Ten Mon Hoc");
		lbTenMH.setLocation(80, 20);

		Text txBox = new Text(shell, SWT.LEFT);
		txBox.setSize(140, 20);
		txBox.setLocation(70, 55);

		Button btSearch = new Button(shell, SWT.CENTER);
		btSearch.setSize(50, 25);
		btSearch.setText("Search");
		btSearch.setLocation(140, 90);
		btSearch.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event event) {
			new Form_ThongTinMH2(shell.getDisplay());
			}
		});

		Button btCancel = new Button(shell, SWT.CENTER);
		btCancel.setSize(50, 25);
		btCancel.setText("Cancel");
		btCancel.setLocation(200, 90);
		btCancel.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event event) {
				System.exit(0);
			}
		});

		Label lbDanhSach = new Label(shell, SWT.LEFT);
		lbDanhSach.setText("Danh Sach Mon Hoc");
		lbDanhSach.setSize(115, 20);
		lbDanhSach.setLocation(10, 95);
//		lbDanhSach.setForeground(display.getSystemColor(SWT.COLOR_BLUE));

	}
}
