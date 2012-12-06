package view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;

public class Main_QLMH {
	
	Shell shell;
	Menu menuBar, menuQLMH, menuQLSV, menuInAn;
	MenuItem quanLy_MH, quanLy_SV, inAn, lietKe_MH, them_MH, xoa_MH, sua_MH, xem_MH,
			capNhat_MH, lietKe_SV, them_SV, xoa_SV, sua_SV, xem_SV, capNhatDiem_SV,
			danhSach_SV, diem_MH, diem_SV;

<<<<<<< HEAD
	public Main_QLMH(Display display,Shell shellCha) {
=======
	public Main_QLMH(Display display) {
>>>>>>> branch 'master' of https://github.com/bao-lq3488/DACNB_V20.git
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
<<<<<<< HEAD
		MenuBar = new Menu(shell, SWT.BAR);

		MenuQLMH = new Menu(MenuBar);

		QLMH = new MenuItem(MenuBar, SWT.CASCADE);
		QLMH.setText("Quan Ly Mon Hoc");
		QLMH.setMenu(MenuQLMH);

		LietKe_MH = new MenuItem(MenuQLMH, SWT.PUSH);
		LietKe_MH.setText("Liet Ke");
		LietKe_MH.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event arg0) {
				new Form_LietKe(shell.getDisplay());
			}
		});
		Them_MH = new MenuItem(MenuQLMH, SWT.PUSH);
		Them_MH.setText("Them");
=======
>>>>>>> branch 'master' of https://github.com/bao-lq3488/DACNB_V20.git
		
<<<<<<< HEAD
		Xoa_MH = new MenuItem(MenuQLMH, SWT.PUSH);
		Xoa_MH.setText("Xoa");
		Xoa_MH.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event arg0) {
				new Form_XoaSua(shell.getDisplay());
			}
		});
=======
		shell.setText("Quan Ly Sinh Vien");
		shell.setSize(400, 300);
>>>>>>> branch 'master' of https://github.com/bao-lq3488/DACNB_V20.git
		
<<<<<<< HEAD
		Sua_MH = new MenuItem(MenuQLMH, SWT.PUSH);
		Sua_MH.setText("Sua");
		Sua_MH.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event arg0) {
				new Form_XoaSua(shell.getDisplay());
			}
		});
=======
		// Tao menu quan ly mon hoc
		menuBar = new Menu(shell, SWT.BAR);
>>>>>>> branch 'master' of https://github.com/bao-lq3488/DACNB_V20.git
		
<<<<<<< HEAD
		Xem_MH = new MenuItem(MenuQLMH, SWT.PUSH);
		Xem_MH.setText("Xem");
		Xem_MH.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event arg0) {
				new Form_ThongTinMH(shell.getDisplay());
			}
		});
=======
		menuQLMH = new Menu(menuBar);
>>>>>>> branch 'master' of https://github.com/bao-lq3488/DACNB_V20.git
		
<<<<<<< HEAD
		CapNhat_MH = new MenuItem(MenuQLMH, SWT.PUSH);
		CapNhat_MH.setText("Cap Nhat Diem");
		CapNhat_MH.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event arg0) {
				new Form_Update(shell.getDisplay());
			}
		});
=======
		quanLy_MH = new MenuItem(menuBar, SWT.CASCADE);
		quanLy_MH.setText("Quan Ly Mon Hoc");
		quanLy_MH.setMenu(menuQLMH);
>>>>>>> branch 'master' of https://github.com/bao-lq3488/DACNB_V20.git

		lietKe_MH = new MenuItem(menuQLMH, SWT.PUSH);
		lietKe_MH.setText("Liet Ke");
		
<<<<<<< HEAD
		Them_SV = new MenuItem(MenuQLSV, SWT.PUSH);
		Them_SV.setText("Them");
		Them_SV.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event arg0) {
				new Form_ThemSV(shell.getDisplay());
			}
		});

		Xoa_SV = new MenuItem(MenuQLSV, SWT.PUSH);
		Xoa_SV.setText("Xoa");
=======
		lietKe_MH.addListener(SWT.Selection, btn_LietKe_MH_Clicked());
>>>>>>> branch 'master' of https://github.com/bao-lq3488/DACNB_V20.git
		
		them_MH = new MenuItem(menuQLMH, SWT.PUSH);
		them_MH.setText("Them");
		
		xoa_MH = new MenuItem(menuQLMH, SWT.PUSH);
		xoa_MH.setText("Xoa");
		xoa_MH.addListener(SWT.Selection, btn_Xoa_MH_Clicked());
		
<<<<<<< HEAD
		CapNhat_SV = new MenuItem(MenuQLSV, SWT.PUSH);
		CapNhat_SV.setText("Cap Nhat Diem");
		CapNhat_SV.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event arg0) {
				new Form_Update(shell.getDisplay());
			}
		});
=======
		sua_MH = new MenuItem(menuQLMH, SWT.PUSH);
		sua_MH.setText("Sua");
		sua_MH.addListener(SWT.Selection, btn_Sua_MH_Clicked());
		
		xem_MH = new MenuItem(menuQLMH, SWT.PUSH);
		xem_MH.setText("Xem");
		xem_MH.addListener(SWT.Selection, btn_Xem_MH_Clicked());
		
		capNhat_MH = new MenuItem(menuQLMH, SWT.PUSH);
		capNhat_MH.setText("Cap Nhat Diem");
		capNhat_MH.addListener(SWT.Selection, btn_CapNhatDiem_MH_Clicked());
>>>>>>> branch 'master' of https://github.com/bao-lq3488/DACNB_V20.git

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

<<<<<<< HEAD
//	public static void main(String args[]) {
//		new Main_QLMH();
//	}
=======
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
				new Form_LietKe(shell);
			}
		};
	}

//	public static void main(String args[]) {
//		new Main_QLMH();
//	}
	
>>>>>>> branch 'master' of https://github.com/bao-lq3488/DACNB_V20.git
}
