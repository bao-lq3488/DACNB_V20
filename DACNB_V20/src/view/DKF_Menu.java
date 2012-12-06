package view;

import java.awt.event.*;

import javax.swing.*;

public class DKF_Menu extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static JDesktopPane DesktopPane;
	private JMenuBar mnBar;
	private JMenu mnQLMH, mnQLSV, mnInAn, Exit;

	public DKF_Menu() {

		setTitle("Menu");
		setSize(400, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(MAXIMIZED_BOTH);
		DesktopPane = new JDesktopPane();
		DesktopPane.setAutoscrolls(true);
		this.setContentPane(DesktopPane);
		CreateMENU();
	}

	private void CreateMENU() {
		mnBar = new JMenuBar();
		setJMenuBar(mnBar);

		mnQLMH = new JMenu("Quan Ly Mon Hoc");
		mnQLSV = new JMenu("Quan Ly Sinh Vien");
		mnInAn = new JMenu("In An");
		Exit = new JMenu("Thoat");

		mnBar.add(mnQLMH);
		mnBar.add(mnQLSV);
		mnBar.add(mnInAn);
		mnBar.add(Exit);

		JMenuItem mnuLietKeMonHoc = new JMenuItem("Liet Ke Mon Hoc");
		mnQLMH.add(mnuLietKeMonHoc);
		JMenuItem mnuThemMonHoc = new JMenuItem("Them Mon Hoc");
		mnQLMH.add(mnuThemMonHoc);
		JMenuItem mnuXoaSuaMonHoc = new JMenuItem("Xoa Sua Mon Hoc");
		mnQLMH.add(mnuXoaSuaMonHoc);
		JMenuItem mnuXemThongTinMonHoc = new JMenuItem("Xem Thong Tin Mon Hoc");
		mnQLMH.add(mnuXemThongTinMonHoc);
		JMenuItem mnuCapNhatDiem = new JMenuItem("Cap Nhat Diem");
		mnQLMH.add(mnuCapNhatDiem);

		JMenuItem mnuLietKeSinhVien = new JMenuItem("Liet Ke Sinh Vien");
		mnQLSV.add(mnuLietKeSinhVien);
		JMenuItem mnuThemSinhVien = new JMenuItem("Them Sinh Vien");
		mnQLSV.add(mnuThemSinhVien);
		JMenuItem mnuXoaSuaSinhVien = new JMenuItem("Xoa Sua Sinh Vien");
		mnQLSV.add(mnuXoaSuaSinhVien);
		JMenuItem mnuXemThongTinSinhVien = new JMenuItem(
				"Xem Thong Tin Sinh Vien");
		mnQLSV.add(mnuXemThongTinSinhVien);

		JMenuItem mnuInDSSV = new JMenuItem("In Danh Sach Sinh Vien");
		mnInAn.add(mnuInDSSV);

		JMenuItem mnuExit = new JMenuItem("Thoat");
		Exit.add(mnuExit);

//		mnQLMH.addActionListener(this);
//		mnQLSV.addActionListener(this);
//		mnInAn.addActionListener(this);
//		Exit.addActionListener(this);

		mnuLietKeMonHoc.addActionListener(this);
		mnuThemMonHoc.addActionListener(this);
		mnuXoaSuaMonHoc.addActionListener(this);
		mnuXemThongTinMonHoc.addActionListener(this);
		mnuCapNhatDiem.addActionListener(this);

		mnuLietKeSinhVien.addActionListener(this);
		mnuThemSinhVien.addActionListener(this);
		mnuXoaSuaSinhVien.addActionListener(this);
		mnuXemThongTinSinhVien.addActionListener(this);

		mnuInDSSV.addActionListener(this);

		mnuExit.addActionListener(this);
	}

	public static DKF_Menu getAddFormXoaSuaMH() {
		DKF_XoaSuaMonHoc2 XoaSuaMonHoc2 = new DKF_XoaSuaMonHoc2();
		XoaSuaMonHoc2.setVisible(true);
		DesktopPane.add(XoaSuaMonHoc2);
		return null;
	}

	public static DKF_Menu getAddFormXemTTMH() {
		DKF_XemThongTinMonHoc2 XemThongTinMonHoc2 = new DKF_XemThongTinMonHoc2();
		XemThongTinMonHoc2.setVisible(true);
		DesktopPane.add(XemThongTinMonHoc2);
		return null;
	}

	public static DKF_Menu getAddFormCapNhatDiemMH() {
		DKF_CapNhatDiemMonHoc2 CapNhatDiemMHc2 = new DKF_CapNhatDiemMonHoc2();
		CapNhatDiemMHc2.setVisible(true);
		DesktopPane.add(CapNhatDiemMHc2);
		return null;
	}

	public static DKF_Menu getAddFormXoaSuaSV() {
		DKF_XoaSuaSinhVien2 XoaSuaSinhVien2 = new DKF_XoaSuaSinhVien2();
		XoaSuaSinhVien2.setVisible(true);
		DesktopPane.add(XoaSuaSinhVien2);
		return null;
	}

	public static DKF_Menu getAddFormXemTTSV() {
		DKF_XemThongTinSinhVien2 XemThongTinSinhVien2 = new DKF_XemThongTinSinhVien2();
		XemThongTinSinhVien2.setVisible(true);
		DesktopPane.add(XemThongTinSinhVien2);
		return null;
	}

	public static DKF_Menu getAddFormInDSSV() {
		DKF_InDSSV2 InDSSV2 = new DKF_InDSSV2();
		InDSSV2.setVisible(true);
		DesktopPane.add(InDSSV2);
		return null;
	}

	// public void createMenuItem(String menuItemName, JMenu parentMenu){
	// JMenuItem item = new JMenuItem(menuItemName);
	// item.setActionCommand(menuItemName);
	// parentMenu.add(item);
	// }

	// createMenuItem("Liet ke mon hoc" , mnQLMH);

	public void actionPerformed(ActionEvent e) {

		if (e.getActionCommand().equals("Liet Ke Mon Hoc")) {
			JInternalFrame LietKeMonHoc = DKF_LietKeMonHoc.getInstance();
			LietKeMonHoc.setVisible(true);
			DesktopPane.remove(LietKeMonHoc);
			DesktopPane.add(LietKeMonHoc);
		}

		if (e.getActionCommand().equals("Them Mon Hoc")) {
			JInternalFrame ThemMonHoc = DKF_ThemMonHoc.getInstance();
			ThemMonHoc.setVisible(true);
			DesktopPane.remove(ThemMonHoc);
			DesktopPane.add(ThemMonHoc);
		}

		if (e.getActionCommand().equals("Xoa Sua Mon Hoc")) {
			JInternalFrame XoaSuaMonHoc = DKF_XoaSuaMonHoc.getInstance();
			XoaSuaMonHoc.setVisible(true);
			DesktopPane.remove(XoaSuaMonHoc);
			DesktopPane.add(XoaSuaMonHoc);
		}

		if (e.getActionCommand().equals("Xem Thong Tin Mon Hoc")) {
			JInternalFrame XemThongTinMonHoc = DKF_XemThongTinMonHoc
					.getInstance();
			XemThongTinMonHoc.setVisible(true);
			DesktopPane.remove(XemThongTinMonHoc);
			DesktopPane.add(XemThongTinMonHoc);
		}

		if (e.getActionCommand().equals("Cap Nhat Diem")) {
			JInternalFrame CapNhatDiemMonHoc = DKF_CapNhatDiemMonHoc
					.getInstance();
			CapNhatDiemMonHoc.setVisible(true);
			DesktopPane.remove(CapNhatDiemMonHoc);
			DesktopPane.add(CapNhatDiemMonHoc);
		}

		if (e.getActionCommand().equals("Liet Ke Sinh Vien")) {
			JInternalFrame LietKeSinhVien = DKF_LietKeSinhVien.getInstance();
			LietKeSinhVien.setVisible(true);
			DesktopPane.remove(LietKeSinhVien);
			DesktopPane.add(LietKeSinhVien);
		}

		if (e.getActionCommand().equals("Them Sinh Vien")) {
			JInternalFrame ThemSinhVien = DKF_ThemSinhVien.getInstance();
			ThemSinhVien.setVisible(true);
			DesktopPane.remove(ThemSinhVien);
			DesktopPane.add(ThemSinhVien);
		}

		if (e.getActionCommand().equals("Xoa Sua Sinh Vien")) {
			JInternalFrame XoaSuaSinhVien = DKF_XoaSuaSinhVien.getInstance();
			XoaSuaSinhVien.setVisible(true);
			DesktopPane.remove(XoaSuaSinhVien);
			DesktopPane.add(XoaSuaSinhVien);
		}

		if (e.getActionCommand().equals("Xem Thong Tin Sinh Vien")) {
			JInternalFrame XemThongTinSinhVien = DKF_XemThongTinSinhVien
					.getInstance();
			XemThongTinSinhVien.setVisible(true);
			DesktopPane.remove(XemThongTinSinhVien);
			DesktopPane.add(XemThongTinSinhVien);
		}

		if (e.getActionCommand().equals("In Danh Sach Sinh Vien")) {
			JInternalFrame InDSSV = DKF_InDSSV.getInstance();
			InDSSV.setVisible(true);
			DesktopPane.remove(InDSSV);
			DesktopPane.add(InDSSV);
		}

		if (e.getActionCommand().equals("Thoat")) {
			System.exit(0);
		}
	}

}
