package view;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class DKF_XoaSuaSinhVien2 extends JInternalFrame implements
		ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Container contentPane;
	JPanel panel1;
	JPanel panel2;
	JButton btnDel;
	JButton btnEdit;
	JTextField t1;
	JLabel l1;

	public DKF_XoaSuaSinhVien2() {
		setSize(320, 230);
		setTitle("XoaSuaSinhVien");
		setResizable(true);
		setMaximizable(true);
		setClosable(true);
		setIconifiable(true);

		contentPane = getContentPane();
		panel1 = new JPanel();
		panel2 = new JPanel();

		btnDel = new JButton("Xoa");
		btnEdit = new JButton("Sua");

		t1 = new JTextField(25);
		t1.setText("InThongTinSinhVien");
		l1 = new JLabel("Xoa Sua Sinh Vien");

		btnDel.addActionListener(this);
		btnEdit.addActionListener(this);

		contentPane.add(panel1, "North");
		contentPane.add(panel2, "Center");

		panel1.add(l1);
		panel2.add(t1);
		panel2.add(btnDel);
		panel2.add(btnEdit);
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

	}

}
