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

		mnQLMH.add(new JMenuItem("Liet Ke Mon Hoc"));
		mnQLMH.add(new JMenuItem("Them Mon Hoc"));
		mnQLMH.add(new JMenuItem("Xem Thong Tin Mon Hoc"));
		mnQLMH.add(new JMenuItem("Xem Thong Tin Mon Hoc"));
		mnQLMH.add(new JMenuItem("Cap Nhat Diem"));

		mnQLSV.add(new JMenuItem("Liet Ke Sinh Vien"));
		mnQLSV.add(new JMenuItem("Them Sinh Vien"));
		mnQLSV.add(new JMenuItem("Xoa Sua Sinh Vien"));
		mnQLSV.add(new JMenuItem("Xem Thong Tin Sinh Vien"));

		mnInAn.add(new JMenuItem("In Danh Sach Sinh Vien"));

		Exit.add(new JMenuItem("Thoat"));

		mnQLMH.addActionListener(this);
		mnQLSV.addActionListener(this);
		mnInAn.addActionListener(this);
		Exit.addActionListener(this);


		setTitle("Menu");
		setSize(400, 400);
		setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {

		if (e.getActionCommand().equals("Liet Ke Mon Hoc")) {
			JFrame f = new Form_AWT_LietKeMonHoc();
			f.setVisible(true);
			this.setVisible(false);
		}
		
		if (e.getActionCommand().equals("Thoat")) {
			System.exit(0);
		}
	}

}
