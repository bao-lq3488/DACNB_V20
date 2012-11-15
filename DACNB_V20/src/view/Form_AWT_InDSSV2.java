package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Form_AWT_InDSSV2 extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Container contentPane;
	JPanel panel1;
	JPanel panel2;
	JButton print;
	JButton exit;
	JButton back;
	JTextField t1;
	JLabel l1;

	public Form_AWT_InDSSV2() {
		setSize(320, 230);
		setTitle("DanhSachSinhVien");
		setResizable(false);

		contentPane = getContentPane();
		panel1 = new JPanel();
		panel2 = new JPanel();
		
		
		print = new JButton("In");
		back = new JButton("Quay Lại");
		exit = new JButton("Thoát");
		t1 = new JTextField(25);
		t1.setText("DanhSachSinhVien");
		l1 = new JLabel("In Danh Sách Sinh Viên");

		exit.addActionListener(this);
	
		contentPane.add(panel1, "North");
		contentPane.add(panel2, "Center");

		panel1.add(l1);
		panel2.add(t1);
		panel2.add(print);
		panel2.add(back);
		panel2.add(exit);


	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == exit) {
			System.exit(0);
		}

	}

}
