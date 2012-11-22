package view;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Form_AWT_XemThongTinSinhVien extends JFrame implements
		ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Container contentPane;
	JPanel panel1;
	JPanel panel2;
	JButton btnOK;
	JButton btnBack;
	JButton btnCancel;
	JTextField t1;
	JLabel l1;
	JLabel l2;

	public Form_AWT_XemThongTinSinhVien() {
		setSize(320, 230);
		setTitle("XemThongTinSinhVien");
		setResizable(false);

		contentPane = getContentPane();
		panel1 = new JPanel();
		panel2 = new JPanel();

		btnOK = new JButton("Dong Y");
		btnCancel = new JButton("Thoat");
		btnBack = new JButton("Quay Lai");
		t1 = new JTextField(25);
		l1 = new JLabel("Xem Thong Tin Sinh Vien");
		l2 = new JLabel("Nhap Ten Sinh Vien Can Xem: ");

		btnOK.addActionListener(this);
		btnBack.addActionListener(this);
		btnCancel.addActionListener(this);

		contentPane.add(panel1, "North");
		contentPane.add(panel2, "Center");

		panel1.add(l1);
		panel2.add(l2);
		panel2.add(t1);
		panel2.add(btnOK);
		panel2.add(btnBack);
		panel2.add(btnCancel);

	}

	public void actionPerformed(ActionEvent e) {

		String Ok = t1.getText();

		if (e.getActionCommand().equals("Dong Y")) {
			if (e.getSource() == btnOK) {
				if (Ok.equals("")) {
					JOptionPane.showMessageDialog(null, "Dien Ten Sinh Vien",
							"Error", JOptionPane.ERROR_MESSAGE);
				} else {
					JFrame f = new Form_AWT_XemThongTinSinhVien2();
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
		if (e.getActionCommand().equals("Thoat")) {
			System.exit(0);
		}

	}

}
