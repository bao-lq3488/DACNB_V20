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
	Display d;
	Shell s;
	Menu MenuBar, MenuQLMH, MenuQLSV, MenuInAn;
	MenuItem QLMH, QLSV, InAn, LietKe_MH, Them_MH, Xoa_MH, Sua_MH, Xem_MH,
			CapNhat_MH, LietKe_SV, Them_SV, Xoa_SV, Sua_SV, Xem_SV, CapNhat_SV,
			DSSV, DiemMH, DiemSV;

	public Main_QLMH() {
		d = new Display();
		s = new Shell(d, SWT.CLOSE);
		s.setText("Quan Ly Sinh Vien");
		s.setSize(400, 300);

		MenuBar = new Menu(s, SWT.BAR);

		MenuQLMH = new Menu(MenuBar);

		QLMH = new MenuItem(MenuBar, SWT.CASCADE);
		QLMH.setText("Quan Ly Mon Hoc");
		QLMH.setMenu(MenuQLMH);

		LietKe_MH = new MenuItem(MenuQLMH, SWT.NONE);
		LietKe_MH.setText("Liet Ke");
		Them_MH = new MenuItem(MenuQLMH, SWT.NONE);
		Them_MH.setText("Them");
		Xoa_MH = new MenuItem(MenuQLMH, SWT.NONE);
		Xoa_MH.setText("Xoa");
		Sua_MH = new MenuItem(MenuQLMH, SWT.NONE);
		Sua_MH.setText("Sua");
		Xem_MH = new MenuItem(MenuQLMH, SWT.NONE);
		Xem_MH.setText("Xem");
		CapNhat_MH = new MenuItem(MenuQLMH, SWT.NONE);
		CapNhat_MH.setText("Cap Nhat Diem");

		MenuQLSV = new Menu(MenuBar);

		QLSV = new MenuItem(MenuBar, SWT.CASCADE);
		QLSV.setText("Quan Ly Sinh Vien");
		QLSV.setMenu(MenuQLSV);

		LietKe_SV = new MenuItem(MenuQLSV, SWT.NONE);
		LietKe_SV.setText("Liet Ke");
		Them_SV = new MenuItem(MenuQLSV, SWT.NONE);
		Them_SV.setText("Them");
		Xoa_SV = new MenuItem(MenuQLSV, SWT.NONE);
		Xoa_SV.setText("Xoa");
		Sua_SV = new MenuItem(MenuQLSV, SWT.NONE);
		Sua_SV.setText("Sua");
		Xem_SV = new MenuItem(MenuQLSV, SWT.NONE);
		Xem_SV.setText("Xem");
		CapNhat_SV = new MenuItem(MenuQLSV, SWT.NONE);
		CapNhat_SV.setText("Cap Nhat Diem");

		MenuInAn = new Menu(MenuBar);

		InAn = new MenuItem(MenuBar, SWT.CASCADE);
		InAn.setText("In An");
		InAn.setMenu(MenuInAn);

		DSSV = new MenuItem(MenuInAn, SWT.NONE);
		DSSV.setText("Danh Sach Sinh Vien");
		DiemMH = new MenuItem(MenuInAn, SWT.NONE);
		DiemMH.setText("Diem Mon Hoc");
		DiemSV = new MenuItem(MenuInAn, SWT.NONE);
		DiemSV.setText("Diem Sinh Vien");

		// LietKe_MH.addSelectionListener(new a());
		// class a implements SelectionListener {
		//
		// public void widgetDefaultSelected(SelectionEvent arg0) {
		// FileDialog fd = new FileDialog(s, SWT.OPEN);
		// fd.setText("Open");
		// fd.setFilterPath("C:/");
		// String[] filterExt = { "*.txt", "*.doc", ".rtf", "*.*" };
		// fd.setFilterExtensions(filterExt);
		// String selected = fd.open();
		// System.out.println(selected);
		// }
		//
		// public void widgetSelected(SelectionEvent arg0) {
		//
		// }
		// }

		LietKe_MH.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event event) {
				//if (event.widget == LietKe_MH) {
					//MessageBox mb = new MessageBox(s);
					//mb.setMessage("hello");
					//mb.open();
					lietke_SV();
					
				//}
			}

			public void lietke_SV() {
				Shell s2 = new Shell(s);
				GridLayout gridlayout = new GridLayout();
				gridlayout.numColumns = 3;
				s2.setLayout(gridlayout);
				
				Label lb1 = new Label(s2, SWT.NONE);
				lb1.setText("alo");
				
				Button bt = new Button(s2, SWT.PUSH);
				bt.setText("ola");

				s2.open();
				while (!s2.isDisposed()) {
					if (!d.readAndDispatch()) {
						d.sleep();
					}
				}
			}
		});
		

		s.setMenuBar(MenuBar);
		s.open();
		while (!s.isDisposed()) {
			if (!d.readAndDispatch()) {
				d.sleep();
			}
		}
	}

	public static void main(String args[]) {
		new Main_QLMH();
	}
}