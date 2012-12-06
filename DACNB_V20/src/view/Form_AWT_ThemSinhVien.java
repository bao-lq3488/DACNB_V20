package view;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Form_AWT_ThemSinhVien extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Container contentPane;
	JPanel panel1;
	JPanel panel2;
	JButton btnAdd;
	JButton btnBack;
	JTextField t1;
	JTextField t2;
	JTextField t3;
	JTextField t4;
	JTextField t5;
	JTextField t6;
	JTextField t7;
	JTextField t8;
	JLabel l1;
	JLabel l2;
	JLabel l3;
	JLabel l4;
	JLabel l5;
	JLabel l6;
	JLabel l7;

	public Form_AWT_ThemSinhVien() {
		setSize(400, 420);
		setTitle("ThemSinhVien");
		setResizable(false);

		contentPane = getContentPane();
		panel1 = new JPanel();
		panel2 = new JPanel();
		btnAdd = new JButton("Them");
		btnBack = new JButton("Quay Lai");
		t1 = new JTextField(20);
		t2 = new JTextField(20);
		t3 = new JTextField(20);
		t4 = new JTextField(20);
		t5 = new JTextField(20);
		t6 = new JTextField(20);
		t7 = new JTextField(20);
		t8 = new JTextField(20);
		l1 = new JLabel("Ten Sinh Vien");
		l2 = new JLabel("Ma So Sinh Vien");
		l3 = new JLabel("Ngay Thang Nam Sinh");
		l4 = new JLabel("Dia Chi");
		l5 = new JLabel("Nganh");
		l6 = new JLabel("Lop");
		l7 = new JLabel("Khoa Hoc");

		btnAdd.addActionListener(this);
		btnBack.addActionListener(this);

		contentPane.add(panel2);

		panel2.setLayout(new GridLayout(8, 2));

		panel2.add(l1);
		panel2.add(t1);
		panel2.add(l2);
		panel2.add(t2);
		panel2.add(l3);
		panel2.add(t3);
		panel2.add(l4);
		panel2.add(t4);
		panel2.add(l5);
		panel2.add(t5);
		panel2.add(l6);
		panel2.add(t6);
		panel2.add(l7);
		panel2.add(t7);
		panel2.add(btnAdd);
		panel2.add(btnBack);
	}

	public void actionPerformed(ActionEvent e) {
		String add1 = t1.getText();
		String add2 = t2.getText();
		String add3 = t3.getText();
		String add4 = t4.getText();
		String add5 = t5.getText();
		String add6 = t6.getText();
		String add7 = t7.getText();

		if (e.getActionCommand().equals("Them")) {
			if (e.getSource() == btnAdd) {
				if (add1.equals("") || add2.equals("") || add3.equals("")
						|| add4.equals("") || add5.equals("")
						|| add6.equals("") || add7.equals("")) {
					JOptionPane.showMessageDialog(null,
							"Dien Day Du Thong Tin Sinh Vien", "Error",
							JOptionPane.ERROR_MESSAGE);
				} else {
					JFrame f = new Form_AWT_LietKeSinhVien();
					f.setVisible(true);
					this.setVisible(false);
				}
			}
		}

		if (e.getActionCommand().equals("Quay Lai")) {
			JFrame f = new Form_AWT_Menu();
			f.setVisible(true);
			this.setVisible(false);
		}
	}
}