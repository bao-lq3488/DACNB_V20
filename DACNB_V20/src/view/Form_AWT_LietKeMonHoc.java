package view;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Form_AWT_LietKeMonHoc extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Container contentPane;
	JPanel panel1;
	JPanel panel2;
	JButton exit;
	JButton back;
	JLabel l2;
	JLabel l3;
	JLabel l4;
	JLabel l5;
	JLabel l6;
	JLabel l7;
	JLabel l8;
	JLabel l9;
	JLabel l10;
	JLabel l11;
	JLabel l12;
	JLabel l13;
	
	public Form_AWT_LietKeMonHoc() {
		setSize(800, 420);
		setTitle("LietKeMonHoc");
		setResizable(false);

		contentPane = getContentPane();
		panel1 = new JPanel();
		panel2 = new JPanel();
		exit = new JButton("Thoát");
		back = new JButton("Quay Lại");
		l8 = new JLabel();
		l9 = new JLabel();
		l10 = new JLabel();
		l11 = new JLabel();
		l12 = new JLabel();
		l13 = new JLabel();
		l2 = new JLabel("Tên Môn Học");
		l3 = new JLabel("Ký Hiệu Môn Học");
		l4 = new JLabel("Số Tín Chỉ");
		l5 = new JLabel("Tổng Số Tiết");
		l6 = new JLabel("Ngành");
		l7 = new JLabel("Khóa Học");

		exit.addActionListener(this);

		contentPane.add(panel2);
		
		panel2.setLayout(new GridLayout(2,5));
		
		panel2.add(l2);
		panel2.add(l3);
		panel2.add(l4);
		panel2.add(l5);
		panel2.add(l6);
		panel2.add(l7);
		panel2.add(exit);
		panel2.add(l8);
		panel2.add(l9);
		panel2.add(l10);
		panel2.add(l11);
		panel2.add(l12);
		panel2.add(l13);
		panel2.add(back);
		
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == exit)
			System.exit(0);
	}

}