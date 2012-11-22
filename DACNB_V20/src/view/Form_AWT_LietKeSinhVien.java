package view;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Form_AWT_LietKeSinhVien extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Container contentPane;
	JPanel panel1;
	JPanel panel2;
	JButton btnExit;
	JButton btnBack;
	JLabel l1;
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
	JLabel l14;

	public Form_AWT_LietKeSinhVien() {
		setSize(1000, 420);
		setTitle("LietKeSinhVien");
		setResizable(false);

		contentPane = getContentPane();
		panel1 = new JPanel();
		panel2 = new JPanel();
		btnExit = new JButton("Thoat");
		btnBack = new JButton("Quay Lai");
		l8 = new JLabel();
		l9 = new JLabel();
		l10 = new JLabel();
		l11 = new JLabel();
		l12 = new JLabel();
		l13 = new JLabel();
		l14 = new JLabel();
		l1 = new JLabel("Ten Sinh Vien");
		l2 = new JLabel("Ma So Sinh Vien");
		l3 = new JLabel("Ngay Thang Nam Sinh");
		l4 = new JLabel("Dia Chi");
		l5 = new JLabel("Nganh");
		l6 = new JLabel("Lop");
		l7 = new JLabel("Khoa Hoc");

		btnBack.addActionListener(this);
		btnExit.addActionListener(this);

		contentPane.add(panel2);

		panel2.setLayout(new GridLayout(2, 5));

		panel2.add(l1);
		panel2.add(l2);
		panel2.add(l3);
		panel2.add(l4);
		panel2.add(l5);
		panel2.add(l6);
		panel2.add(l7);
		panel2.add(btnExit);
		panel2.add(l8);
		panel2.add(l9);
		panel2.add(l10);
		panel2.add(l11);
		panel2.add(l12);
		panel2.add(l13);
		panel2.add(l14);
		panel2.add(btnBack);

	}

	public void actionPerformed(ActionEvent e) {

		if (e.getActionCommand().equals("Quay Lai")) {
			JFrame f = new Form_AWT_Menu();
			f.setVisible(true);
			this.setVisible(false);
		}
		if (e.getActionCommand().equals("Thoat")) {
			System.exit(0);
		}
	}
}