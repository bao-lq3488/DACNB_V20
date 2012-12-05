package view;


import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class DKF_XemThongTinSinhVien2 extends JInternalFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Container contentPane;
	JPanel panel1;
	JPanel panel2;
	JTextField t1;
	JLabel l1;

	public DKF_XemThongTinSinhVien2() {
		setSize(320, 230);
		setTitle("XemThongTinSinhVien");
		setResizable(true);
		setMaximizable(true);
		setClosable(true);
		setIconifiable(true);

		contentPane = getContentPane();
		panel1 = new JPanel();
		panel2 = new JPanel();
		
		t1 = new JTextField(25);
		t1.setText("InThongTinSinhVien");
		l1 = new JLabel("Xem Thong Tin Sinh Vien");

		contentPane.add(panel1, "North");
		contentPane.add(panel2, "Center");

		panel1.add(l1);
		panel2.add(t1);

	}

	public void actionPerformed(ActionEvent e) {

	}

}
