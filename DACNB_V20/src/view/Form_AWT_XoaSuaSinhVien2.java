package view;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Form_AWT_XoaSuaSinhVien2 extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Container contentPane;
	JPanel panel1;
	JPanel panel2;
	JButton btnDel;
	JButton btnEdit;
	JButton btnBack;
	JButton btnCancel;
	JTextField t1;
	JLabel l1;

	public Form_AWT_XoaSuaSinhVien2() {
		setSize(320, 230);
		setTitle("XoaSuaSinhVien");
		setResizable(false);

		contentPane = getContentPane();
		panel1 = new JPanel();
		panel2 = new JPanel();

		btnDel = new JButton("Xoa");
		btnEdit = new JButton("Sua");
		btnCancel = new JButton("Thoat");
		btnBack = new JButton("Quay Lai");
		t1 = new JTextField(25);
		t1.setText("InThongTinSinhVien");
		l1 = new JLabel("Xoa Sua Sinh Vien");

		btnDel.addActionListener(this);
		btnEdit.addActionListener(this);
		btnBack.addActionListener(this);
		btnCancel.addActionListener(this);

		contentPane.add(panel1, "North");
		contentPane.add(panel2, "Center");

		panel1.add(l1);
		panel2.add(t1);
		panel2.add(btnDel);
		panel2.add(btnEdit);
		panel2.add(btnBack);
		panel2.add(btnCancel);

	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnDel) {
			int del = JOptionPane.showConfirmDialog(null,
					"Ban Co Chac Chan Muon Xoa Khong", "Xoa Sinh Vien",
					JOptionPane.YES_NO_OPTION);
			if (del == JOptionPane.YES_OPTION) {
				JOptionPane.showMessageDialog(null,
						"Da Xoa Sinh Vien Thanh Cong");
			} else {
				JOptionPane.showMessageDialog(null, "Khong Xoa Thi Thoi!!!");
			}
		}

		if (e.getSource() == btnEdit) {
			int edit = JOptionPane.showConfirmDialog(null,
					"Ban Co Chac Chan Muon Sua Khong", "Sua Sinh Vien",
					JOptionPane.YES_NO_OPTION);
			if (edit == JOptionPane.YES_OPTION) {
				JOptionPane.showMessageDialog(null,
						"Da Sua Sinh Vien Thanh Cong");
			} else {
				JOptionPane.showMessageDialog(null, "Khong Sua Thi Thoi!!!");
			}
		}

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
