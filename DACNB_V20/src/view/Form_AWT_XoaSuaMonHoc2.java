package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Form_AWT_XoaSuaMonHoc2 extends JInternalFrame implements ActionListener {
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
	JTextField t1;
	JLabel l1;

	public Form_AWT_XoaSuaMonHoc2() {
		setSize(320, 230);
		setTitle("XoaSuaMonHoc");
		setResizable(true);
		setMaximizable(true);
		setClosable(true);
		setIconifiable(true);


		contentPane = getContentPane();
		panel1 = new JPanel();
		panel2 = new JPanel();

		btnDel = new JButton("Xoa");
		btnEdit = new JButton("Sua");
		btnBack = new JButton("Quay Lai");
		t1 = new JTextField(25);
		t1.setText("InThongTinMonHoc");
		l1 = new JLabel("Xoa Sua Mon Hoc");

		btnDel.addActionListener(this);
		btnEdit.addActionListener(this);
		btnBack.addActionListener(this);
		contentPane.add(panel1, "North");
		contentPane.add(panel2, "Center");

		panel1.add(l1);
		panel2.add(t1);
		panel2.add(btnDel);
		panel2.add(btnEdit);
		panel2.add(btnBack);

	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnDel) {
			int del = JOptionPane.showConfirmDialog(null,
					"Ban Co Chac Chan Muon Xoa Khong", "Xoa Mon Hoc",
					JOptionPane.YES_NO_OPTION);
			if (del == JOptionPane.YES_OPTION) {
				JOptionPane
						.showMessageDialog(null, "Da Xoa Mon Hoc Thanh Cong");
			} else {
				JOptionPane.showMessageDialog(null, "Khong Xoa Thi Thoi!!!");
			}
		}

		if (e.getSource() == btnEdit) {
			int edit = JOptionPane.showConfirmDialog(null,
					"Ban Co Chac Chan Muon Sua Khong", "Sua Mon Hoc",
					JOptionPane.YES_NO_OPTION);
			if (edit == JOptionPane.YES_OPTION) {
				JOptionPane
						.showMessageDialog(null, "Da Sua Mon Hoc Thanh Cong");
			} else {
				JOptionPane.showMessageDialog(null, "Khong Sua Thi Thoi!!!");
			}
		}

//		if (e.getActionCommand().equals("Quay Lai")) {
//			JInternalFrame XoaSuaMonHoc = new Form_AWT_XoaSuaMonHoc();
//			XoaSuaMonHoc.setVisible(true);
//			this.setVisible(false);
//		}

	}

}
