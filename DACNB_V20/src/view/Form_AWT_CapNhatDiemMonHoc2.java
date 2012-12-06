package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Form_AWT_CapNhatDiemMonHoc2 extends JFrame implements
		ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Container contentPane;
	JPanel panel1;
	JPanel panel2;
	JButton btnUpdate;
	JButton btnBack;
	JButton btnCancel;
	JTextField t1;
	JLabel l1;

	public Form_AWT_CapNhatDiemMonHoc2() {
		setSize(320, 230);
		setTitle("CapNhatDiemMonHoc");
		setResizable(false);

		contentPane = getContentPane();
		panel1 = new JPanel();
		panel2 = new JPanel();

		btnUpdate = new JButton("Cap Nhat");
		btnCancel = new JButton("Thoat");
		btnBack = new JButton("Quay Lai");
		t1 = new JTextField(25);
		t1.setText("InDanhSachSinhVienMonHoc");
		l1 = new JLabel("Cap Nhat Diem Mon Hoc");

		btnUpdate.addActionListener(this);
		btnCancel.addActionListener(this);
		btnBack.addActionListener(this);

		contentPane.add(panel1, "North");
		contentPane.add(panel2, "Center");

		panel1.add(l1);
		panel2.add(t1);
		panel2.add(btnUpdate);
		panel2.add(btnBack);
		panel2.add(btnCancel);

	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnUpdate) {
			JOptionPane.showMessageDialog(this, "Da Cap Nhat Thanh Cong",
					"Complete", JOptionPane.INFORMATION_MESSAGE);
			JFrame f = new Form_AWT_CapNhatDiemMonHoc();
			f.setVisible(true);
			this.setVisible(false);
		}

		if (e.getActionCommand().equals("Quay Lai")) {
			JFrame f = new Form_AWT_CapNhatDiemMonHoc();
			f.setVisible(true);
			this.setVisible(false);
		}
		if (e.getActionCommand().equals("Thoat")) {
			System.exit(0);
		}

	}

}
