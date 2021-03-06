package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DKF_CapNhatDiemMonHoc2 extends JInternalFrame implements
		ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Container contentPane;
	JPanel panel1;
	JPanel panel2;
	JButton btnUpdate;
	JTextField t1;
	JLabel l1;

	public DKF_CapNhatDiemMonHoc2() {
		setSize(320, 230);
		setTitle("CapNhatDiemMonHoc");
		setResizable(true);
		setMaximizable(true);
		setClosable(true);
		setIconifiable(true);

		contentPane = getContentPane();
		panel1 = new JPanel();
		panel2 = new JPanel();

		btnUpdate = new JButton("Cap Nhat");
		t1 = new JTextField(25);
		t1.setText("InDanhSachSinhVienMonHoc");
		l1 = new JLabel("Cap Nhat Diem Mon Hoc");

		btnUpdate.addActionListener(this);
	
		contentPane.add(panel1, "North");
		contentPane.add(panel2, "Center");

		panel1.add(l1);
		panel2.add(t1);
		panel2.add(btnUpdate);
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnUpdate) {
			JOptionPane.showMessageDialog(this, "Da Cap Nhat Thanh Cong",
					"Complete", JOptionPane.INFORMATION_MESSAGE);
		}

	}

}
