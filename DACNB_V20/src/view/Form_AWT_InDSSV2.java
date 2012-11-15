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
	JButton btnPrint;
	JButton btnExit;
	JButton btnBack;
	JTextField t1;
	JLabel l1;

	public Form_AWT_InDSSV2() {
		setSize(320, 230);
		setTitle("DanhSachSinhVien");
		setResizable(false);

		contentPane = getContentPane();
		panel1 = new JPanel();
		panel2 = new JPanel();

		btnPrint = new JButton("In");
		btnBack = new JButton("Quay Lai");
		btnExit = new JButton("Thoat");
		t1 = new JTextField(25);
		t1.setText("DanhSachSinhVien");
		l1 = new JLabel("In Danh Sach Sinh Vien");
		
		btnPrint.addActionListener(this);
		btnBack.addActionListener(this);
		btnExit.addActionListener(this);

		contentPane.add(panel1, "North");
		contentPane.add(panel2, "Center");

		panel1.add(l1);
		panel2.add(t1);
		panel2.add(btnPrint);
		panel2.add(btnBack);
		panel2.add(btnExit);

	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnPrint) {
			JOptionPane.showMessageDialog(this, "Da In Thanh Cong", "Complete",
					JOptionPane.INFORMATION_MESSAGE);
			JFrame f = new Form_AWT_InDSSV();
			f.setVisible(true);
			this.setVisible(false);
		}
		
		if (e.getActionCommand().equals("Quay Lai")) {
			JFrame f = new Form_AWT_InDSSV();
			f.setVisible(true);
			this.setVisible(false);
		}
		
		if (e.getActionCommand().equals("Thoat")) {
			System.exit(0);
		}

	}

}
