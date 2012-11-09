package view;

import java.awt.MenuBar;

import org.eclipse.swt.*;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class Main_QLMH {
	Display display;
	Shell shell;
	Menu menu2, menu, menu3;
	MenuItem menuItem, menu2Item, menu3Item;

	public Main_QLMH() {
		setDisplay();
		
		setMenuBar();
		this.shell.setMenuBar(menu);
		
		setTabQLMH();
		this.menuItem.setText("QLMH");

		menuQLMH();
		this.menuItem.setMenu(menu);

		setLietKeMH_QLMH();
		this.menuItem.setText("Liet Ke");

		setThemMH_QLMH();
		this.menuItem.setText("Them");

		setXoaMH_QLMH();
		this.menuItem.setText("Xoa");

		setSuaMH_QLMH();
		this.menuItem.setText("Sua");

		setXemMH_QLMH();
		this.menuItem.setText("Xem");

		setCapNhat_QLMH();
		this.menuItem.setText("Cap Nhat Diem");

		setTabQLSV();
		this.menuItem.setText("QLSV");

		menuQLSV();
		this.menuItem.setMenu(menu);

		setLietKeMH_QLSV();
		this.menuItem.setText("Liet Ke");

		setThemMH_QLSV();
		this.menuItem.setText("Them");

		setXoaMH_QLSV();
		this.menuItem.setText("Xoa");

		setSuaMH_QLSV();
		this.menuItem.setText("Sua");

		setXemMH_QLSV();
		this.menuItem.setText("Xem");

		setCapNhat_QLSV();
		this.menuItem.setText("Cap Nhat Diem");

		// MenuItem InAn = new MenuItem(menu, SWT.CASCADE);
		// InAn.setText("In An");
		// Menu menuInAn = new Menu(shell, SWT.DROP_DOWN);
		// InAn.setMenu(menuInAn);
		//
		// MenuItem DSSV = new MenuItem(menuInAn, SWT.PUSH);
		// DSSV.setText("Danh Sach SV");
		//
		// MenuItem DiemMH = new MenuItem(menuInAn, SWT.PUSH);
		// DiemMH.setText("Diem Mon Hoc");
		//
		// MenuItem DiemSV = new MenuItem(menuInAn, SWT.PUSH);
		// DiemSV.setText("Diem Sinh Vien");

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

	public void setMenuBar() {
		this.menu = new Menu(shell, SWT.BAR);
	}

	public void setTabQLMH() {
		this.menuItem = new MenuItem(menu, SWT.CASCADE);
	}

	public void menuQLMH() {
		this.menu = new Menu(shell, SWT.DROP_DOWN);
	}

	public void setLietKeMH_QLMH() {
		this.menuItem = new MenuItem(menu, SWT.PUSH);
	}

	public void setThemMH_QLMH() {
		this.menuItem = new MenuItem(menu, SWT.PUSH);
	}

	public void setXoaMH_QLMH() {
		this.menuItem = new MenuItem(menu, SWT.PUSH);
	}

	public void setSuaMH_QLMH() {
		this.menuItem = new MenuItem(menu, SWT.PUSH);
	}

	public void setXemMH_QLMH() {
		this.menuItem = new MenuItem(menu, SWT.PUSH);
	}

	public void setCapNhat_QLMH() {
		this.menuItem = new MenuItem(menu, SWT.PUSH);
	}

	public void setTabQLSV() {
		this.menu = new Menu(shell, SWT.CASCADE);
	}

	public void menuQLSV() {
		this.menu = new Menu(shell, SWT.DROP_DOWN);
	}

	public void setLietKeMH_QLSV() {
		this.menuItem = new MenuItem(menu, SWT.PUSH);
	}

	public void setThemMH_QLSV() {
		this.menuItem = new MenuItem(menu, SWT.PUSH);
	}

	public void setXoaMH_QLSV() {
		this.menuItem = new MenuItem(menu, SWT.PUSH);
	}

	public void setSuaMH_QLSV() {
		this.menuItem = new MenuItem(menu, SWT.PUSH);
	}

	public void setXemMH_QLSV() {
		this.menuItem = new MenuItem(menu, SWT.PUSH);
	}

	public void setCapNhat_QLSV() {
		this.menuItem = new MenuItem(menu, SWT.PUSH);
	}

	public static void main(String args[]) {
		new Main_QLMH();
	}

}
