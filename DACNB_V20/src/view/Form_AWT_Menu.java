package view;

import java.awt.event.*;

import javax.swing.*;

public class Form_AWT_Menu extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JMenuBar mnBar;
	JMenu mnQLMH;
	JMenu mnQLSV;
	JMenu mnInAn;
	JMenu Exit;

	public Form_AWT_Menu() {

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
		JMenuItem mnuXemThongTinSinhVien = new JMenuItem("Xem Thong Tin Sinh Vien");
		mnQLSV.add(mnuXemThongTinSinhVien);
		
		JMenuItem mnuInDSSV = new JMenuItem("In Danh Sach Sinh Vien");
		mnInAn.add(mnuInDSSV);
		
		JMenuItem mnuExit = new JMenuItem("Thoat");
		Exit.add(mnuExit);
		

		

		mnQLMH.addActionListener(this);
		mnQLSV.addActionListener(this);
		mnInAn.addActionListener(this);
		Exit.addActionListener(this);
		
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


		setTitle("Menu");
		setSize(400, 400);
		setVisible(true);

	}

//	public void createMenuItem(String menuItemName, JMenu parentMenu){
//		JMenuItem item = new JMenuItem(menuItemName);
//		item.setActionCommand(menuItemName);
//		parentMenu.add(item);
//	}
	
//	createMenuItem("Liet ke mon hoc" , mnQLMH);
	
	public void actionPerformed(ActionEvent e) {

		if (e.getActionCommand().equals("Liet Ke Mon Hoc")) {
			JFrame f = new Form_AWT_LietKeMonHoc();
			f.setVisible(true);
			this.setVisible(false);
		}
		
		if (e.getActionCommand().equals("Them Mon Hoc")) {
			JFrame f = new Form_AWT_ThemMonHoc();
			f.setVisible(true);
			this.setVisible(false);
		}
		
		if (e.getActionCommand().equals("Xoa Sua Mon Hoc")) {
			JFrame f = new Form_AWT_XoaSuaMonHoc();
			f.setVisible(true);
			this.setVisible(false);
		}
		
		if (e.getActionCommand().equals("Xem Thong Tin Mon Hoc")) {
			JFrame f = new Form_AWT_XemThongTinMonHoc();
			f.setVisible(true);
			this.setVisible(false);
		}
		
		if (e.getActionCommand().equals("Cap Nhat Diem")) {
			JFrame f = new Form_AWT_CapNhatDiemMonHoc();
			f.setVisible(true);
			this.setVisible(false);
		}
		
		if (e.getActionCommand().equals("Liet Ke Sinh Vien")) {
			JFrame f = new Form_AWT_LietKeSinhVien();
			f.setVisible(true);
			this.setVisible(false);
		}
		
		if (e.getActionCommand().equals("Them Sinh Vien")) {
			JFrame f = new Form_AWT_ThemSinhVien();
			f.setVisible(true);
			this.setVisible(false);
		}
		
		if (e.getActionCommand().equals("Xoa Sua Sinh Vien")) {
			JFrame f = new Form_AWT_XoaSuaSinhVien();
			f.setVisible(true);
			this.setVisible(false);
		}
		
		if (e.getActionCommand().equals("Xem Thong Tin Sinh Vien")) {
			JFrame f = new Form_AWT_XemThongTinSinhVien();
			f.setVisible(true);
			this.setVisible(false);
		}
		
		if (e.getActionCommand().equals("In Danh Sach Sinh Vien")) {
			JFrame f = new Form_AWT_InDSSV();
			f.setVisible(true);
			this.setVisible(false);
		}
		
		if (e.getActionCommand().equals("Thoat")) {
			System.exit(0);
		}
	}

}
