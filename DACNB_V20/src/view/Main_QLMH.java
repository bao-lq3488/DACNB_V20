package view;

import java.sql.SQLException;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;

public class Main_QLMH {
	
	Shell shell;
	Menu menuBar, menuQLMH, menuQLSV, menuInAn;
	MenuItem quanLy_MH, quanLy_SV, inAn, lietKe_MH, them_MH, xoa_MH, sua_MH, xem_MH,
			capNhat_MH, lietKe_SV, them_SV, xoa_SV, sua_SV, xem_SV, capNhatDiem_SV,
			danhSach_SV, diem_MH, diem_SV;

	public Main_QLMH(Display display) {
		shell = new Shell(display);

		createUI();
		
		shell.open();
		keepShell(display);
	}

	public void keepShell(Display display) {
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		display.dispose();
	}

	public void createUI() {
		
		shell.setText("Quan Ly Sinh Vien");
		shell.setSize(400, 300);
		
		// Tao menu quan ly mon hoc
		menuBar = new Menu(shell, SWT.BAR);
		
		menuQLMH = new Menu(menuBar);
		
		quanLy_MH = new MenuItem(menuBar, SWT.CASCADE);
		quanLy_MH.setText("Quan Ly Mon Hoc");
		quanLy_MH.setMenu(menuQLMH);

		lietKe_MH = new MenuItem(menuQLMH, SWT.PUSH);
		lietKe_MH.setText("Liet Ke");
		
		lietKe_MH.addListener(SWT.Selection, btn_LietKe_MH_Clicked());
		
		them_MH = new MenuItem(menuQLMH, SWT.PUSH);
		them_MH.setText("Them");
		
		xoa_MH = new MenuItem(menuQLMH, SWT.PUSH);
		xoa_MH.setText("Xoa");
		xoa_MH.addListener(SWT.Selection, btn_Xoa_MH_Clicked());
		
		sua_MH = new MenuItem(menuQLMH, SWT.PUSH);
		sua_MH.setText("Sua");
		sua_MH.addListener(SWT.Selection, btn_Sua_MH_Clicked());
		
		xem_MH = new MenuItem(menuQLMH, SWT.PUSH);
		xem_MH.setText("Xem");
		xem_MH.addListener(SWT.Selection, btn_Xem_MH_Clicked());
		
		capNhat_MH = new MenuItem(menuQLMH, SWT.PUSH);
		capNhat_MH.setText("Cap Nhat Diem");
		capNhat_MH.addListener(SWT.Selection, btn_CapNhatDiem_MH_Clicked());

		// Tao menu quan ly sinh vien
		
		menuQLSV = new Menu(menuBar);
		quanLy_SV = new MenuItem(menuBar, SWT.CASCADE);
		quanLy_SV.setText("Quan Ly Sinh Vien");
		quanLy_SV.setMenu(menuQLSV);

		lietKe_SV = new MenuItem(menuQLSV, SWT.PUSH);
		lietKe_SV.setText("Liet Ke");
		
		them_SV = new MenuItem(menuQLSV, SWT.PUSH);
		them_SV.setText("Them");
		them_SV.addListener(SWT.Selection, btn_Them_SV_Clicked());

		xoa_SV = new MenuItem(menuQLSV, SWT.PUSH);
		xoa_SV.setText("Xoa");
		
		sua_SV = new MenuItem(menuQLSV, SWT.PUSH);
		sua_SV.setText("Sua");
		
		xem_SV = new MenuItem(menuQLSV, SWT.PUSH);
		xem_SV.setText("Xem");
		
		capNhatDiem_SV = new MenuItem(menuQLSV, SWT.PUSH);
		capNhatDiem_SV.setText("Cap Nhat Diem");
		capNhatDiem_SV.addListener(SWT.Selection, btn_CapNhatDiem_SV_Clicked());

		// Tao menu quan ly in an
		menuInAn = new Menu(menuBar);

		inAn = new MenuItem(menuBar, SWT.CASCADE);
		inAn.setText("In An");
		inAn.setMenu(menuInAn);

		danhSach_SV = new MenuItem(menuInAn, SWT.PUSH);
		danhSach_SV.setText("Danh Sach Sinh Vien");
		diem_MH = new MenuItem(menuInAn, SWT.PUSH);
		diem_MH.setText("Diem Mon Hoc");
		diem_SV = new MenuItem(menuInAn, SWT.PUSH);
		diem_SV.setText("Diem Sinh Vien");

		shell.setMenuBar(menuBar);
	}

	// Listener cho button
	
	public Listener btn_CapNhatDiem_SV_Clicked() {
		return new Listener() {
			public void handleEvent(Event arg0) {
				new Form_CapNhatDiem_MH(shell);
			}
		};
	}

	public Listener btn_Them_SV_Clicked() {
		return new Listener() {
			public void handleEvent(Event arg0) {
				new Form_ThemSV(shell);
			}
		};
	}

	public Listener btn_CapNhatDiem_MH_Clicked() {
		return new Listener() {
			public void handleEvent(Event arg0) {
				new Form_CapNhatDiem_MH(shell);
			}
		};
	}

	public Listener btn_Xem_MH_Clicked() {
		return new Listener() {
			public void handleEvent(Event arg0) {
				new Form_ThongTinMH(shell);
			}
		};
	}

	public Listener btn_Sua_MH_Clicked() {
		return new Listener() {
			public void handleEvent(Event arg0) {
				new Form_XoaSua(shell);
			}
		};
	}

	public Listener btn_Xoa_MH_Clicked() {
		return new Listener() {
			public void handleEvent(Event arg0) {
				new Form_XoaSua(shell);
			}
		};
	}

	public Listener btn_LietKe_MH_Clicked() {
		return new Listener() {
			public void handleEvent(Event arg0) {
				try {
					new Form_LietKe(shell);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
	}

//	public static void main(String args[]) {
//		new Main_QLMH();
//	}
	
}