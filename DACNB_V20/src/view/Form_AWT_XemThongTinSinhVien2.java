package view;


import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Form_AWT_XemThongTinSinhVien2 extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Container contentPane;
	JPanel panel1;
	JPanel panel2;
	JButton btnExit;
	JButton btnBack;
	JTextField t1;
	JLabel l1;

	public Form_AWT_XemThongTinSinhVien2() {
		setSize(320, 230);
		setTitle("XemThongTinSinhVien");
		setResizable(false);

		contentPane = getContentPane();
		panel1 = new JPanel();
		panel2 = new JPanel();

		btnExit = new JButton("Thoat");
		btnBack = new JButton("Quay Lai");
		t1 = new JTextField(25);
		t1.setText("InThongTinSinhVien");
		l1 = new JLabel("Xem Thong Tin Sinh Vien");

		btnBack.addActionListener(this);
		btnExit.addActionListener(this);
	
		contentPane.add(panel1, "North");
		contentPane.add(panel2, "Center");

		panel1.add(l1);
		panel2.add(t1);
		panel2.add(btnBack);
		panel2.add(btnExit);


	}

	public void actionPerformed(ActionEvent e) {

		if (e.getActionCommand().equals("Quay Lai")) {
			JFrame f = new Form_AWT_XemThongTinSinhVien();
			f.setVisible(true);
			this.setVisible(false);
		}
		if (e.getActionCommand().equals("Thoat")) {
			System.exit(0);
		}

	}

}
