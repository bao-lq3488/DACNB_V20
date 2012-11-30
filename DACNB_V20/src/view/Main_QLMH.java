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
	Menu MenuBar, MenuQLMH, MenuQLSV, MenuInAn;
	MenuItem QLMH, QLSV, InAn, LietKe_MH, Them_MH, Xoa_MH, Sua_MH, Xem_MH,
			CapNhat_MH, LietKe_SV, Them_SV, Xoa_SV, Sua_SV, Xem_SV, CapNhat_SV,
			DSSV, DiemMH, DiemSV;

	public Main_QLMH(Display display) {
		shell = new Shell(display);
		shell.setText("Quan Ly Sinh Vien");
		shell.setSize(400, 300);

		createUI();
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	public void createUI() {
		MenuBar = new Menu(shell, SWT.BAR);

		MenuQLMH = new Menu(MenuBar);

		QLMH = new MenuItem(MenuBar, SWT.CASCADE);
		QLMH.setText("Quan Ly Mon Hoc");
		QLMH.setMenu(MenuQLMH);

		LietKe_MH = new MenuItem(MenuQLMH, SWT.PUSH);
		LietKe_MH.setText("Liet Ke");
		
		LietKe_MH.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event arg0) {
				new Form_LietKe(shell);
			}
		});
		
		Them_MH = new MenuItem(MenuQLMH, SWT.PUSH);
		Them_MH.setText("Them");
		
		Xoa_MH = new MenuItem(MenuQLMH, SWT.PUSH);
		Xoa_MH.setText("Xoa");
		Xoa_MH.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event arg0) {
				new Form_XoaSua(shell);
			}
		});
		
		Sua_MH = new MenuItem(MenuQLMH, SWT.PUSH);
		Sua_MH.setText("Sua");
		Sua_MH.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event arg0) {
				new Form_XoaSua(shell);
			}
		});
		
		Xem_MH = new MenuItem(MenuQLMH, SWT.PUSH);
		Xem_MH.setText("Xem");
		Xem_MH.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event arg0) {
				new Form_ThongTinMH(shell);
			}
		});
		
		CapNhat_MH = new MenuItem(MenuQLMH, SWT.PUSH);
		CapNhat_MH.setText("Cap Nhat Diem");
		CapNhat_MH.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event arg0) {
				new Form_Update(shell);
			}
		});

		MenuQLSV = new Menu(MenuBar);

		QLSV = new MenuItem(MenuBar, SWT.CASCADE);
		QLSV.setText("Quan Ly Sinh Vien");
		QLSV.setMenu(MenuQLSV);

		LietKe_SV = new MenuItem(MenuQLSV, SWT.PUSH);
		LietKe_SV.setText("Liet Ke");
		
		Them_SV = new MenuItem(MenuQLSV, SWT.PUSH);
		Them_SV.setText("Them");
		Them_SV.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event arg0) {
				new Form_ThemSV(shell);
			}
		});

		Xoa_SV = new MenuItem(MenuQLSV, SWT.PUSH);
		Xoa_SV.setText("Xoa");
		
		Sua_SV = new MenuItem(MenuQLSV, SWT.PUSH);
		Sua_SV.setText("Sua");
		
		Xem_SV = new MenuItem(MenuQLSV, SWT.PUSH);
		Xem_SV.setText("Xem");
		
		CapNhat_SV = new MenuItem(MenuQLSV, SWT.PUSH);
		CapNhat_SV.setText("Cap Nhat Diem");
		CapNhat_SV.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event arg0) {
				new Form_Update(shell);
			}
		});

		MenuInAn = new Menu(MenuBar);

		InAn = new MenuItem(MenuBar, SWT.CASCADE);
		InAn.setText("In An");
		InAn.setMenu(MenuInAn);

		DSSV = new MenuItem(MenuInAn, SWT.PUSH);
		DSSV.setText("Danh Sach Sinh Vien");
		DiemMH = new MenuItem(MenuInAn, SWT.PUSH);
		DiemMH.setText("Diem Mon Hoc");
		DiemSV = new MenuItem(MenuInAn, SWT.PUSH);
		DiemSV.setText("Diem Sinh Vien");

		shell.setMenuBar(MenuBar);
	}

//	public static void main(String args[]) {
//		new Main_QLMH();
//	}
}