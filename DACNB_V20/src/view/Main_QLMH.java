package view;

import org.eclipse.swt.*;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class Main_QLMH {
	Display display;
	Shell shell;

	public Main_QLMH() {
		setDisplay();

		Menu menu = new Menu(shell, SWT.BAR);
		shell.setMenuBar(menu);

		MenuItem QLMH = new MenuItem(menu, SWT.CASCADE);
		QLMH.setText("QLMH");
		Menu menuQLMH = new Menu(shell, SWT.DROP_DOWN);
		QLMH.setMenu(menuQLMH);

		MenuItem LietKe_QLMH = new MenuItem(menuQLMH, SWT.PUSH);
		LietKe_QLMH.setText("Liet Ke");

		MenuItem Them_QLMH = new MenuItem(menuQLMH, SWT.PUSH);
		Them_QLMH.setText("Them");

		MenuItem Xoa_QLMH = new MenuItem(menuQLMH, SWT.PUSH);
		Xoa_QLMH.setText("Xoa");

		MenuItem Sua_QLMH = new MenuItem(menuQLMH, SWT.PUSH);
		Sua_QLMH.setText("Sua");

		MenuItem Xem_QLMH = new MenuItem(menuQLMH, SWT.PUSH);
		Xem_QLMH.setText("Xem");

		MenuItem CapNhat_QLMH = new MenuItem(menuQLMH, SWT.PUSH);
		CapNhat_QLMH.setText("Cap Nhat Diem");

		MenuItem QLSV = new MenuItem(menu, SWT.CASCADE);
		QLSV.setText("QLSV");
		Menu menuQLSV = new Menu(shell, SWT.DROP_DOWN);
		QLSV.setMenu(menuQLSV);

		MenuItem LietKe_QLSV = new MenuItem(menuQLSV, SWT.PUSH);
		LietKe_QLSV.setText("Liet Ke");

		MenuItem Them_QLSV = new MenuItem(menuQLSV, SWT.PUSH);
		Them_QLSV.setText("Them");

		MenuItem Xoa_QLSV = new MenuItem(menuQLSV, SWT.PUSH);
		Xoa_QLSV.setText("Xoa");

		MenuItem Sua_QLSV = new MenuItem(menuQLSV, SWT.PUSH);
		Sua_QLSV.setText("Sua");

		MenuItem Xem_QLSV = new MenuItem(menuQLSV, SWT.PUSH);
		Xem_QLSV.setText("Xem");

		MenuItem CapNhat_QLSV = new MenuItem(menuQLSV, SWT.PUSH);
		CapNhat_QLSV.setText("Cap Nhat Diem");

		MenuItem InAn = new MenuItem(menu, SWT.CASCADE);
		InAn.setText("In An");
		Menu menuInAn = new Menu(shell, SWT.DROP_DOWN);
		InAn.setMenu(menuInAn);

		MenuItem DSSV = new MenuItem(menuInAn, SWT.PUSH);
		DSSV.setText("Danh Sach SV");

		MenuItem DiemMH = new MenuItem(menuInAn, SWT.PUSH);
		DiemMH.setText("Diem Mon Hoc");

		MenuItem DiemSV = new MenuItem(menuInAn, SWT.PUSH);
		DiemSV.setText("Diem Sinh Vien");

		shell.open();

		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		display.dispose();
	}

	public void setDisplay() {
		this.display = new Display();
		this.shell = new Shell(display, SWT.CLOSE);
		this.shell.setText("Quan Ly Sinh Vien");
		this.shell.setSize(400, 300);

	}

	public static void main(String args[]) {
		new Main_QLMH();
	}

}
