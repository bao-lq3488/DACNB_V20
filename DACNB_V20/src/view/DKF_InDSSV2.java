package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DKF_InDSSV2 extends JInternalFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Container contentPane;
	JPanel panel1;
	JPanel panel2;
	JButton btnPrint;
	JTextField t1;
	JLabel l1;

	public DKF_InDSSV2() {
		setSize(320, 230);
		setTitle("DanhSachSinhVien");
		setResizable(true);
		setMaximizable(true);
		setClosable(true);
		setIconifiable(true);

		contentPane = getContentPane();
		panel1 = new JPanel();
		panel2 = new JPanel();

		btnPrint = new JButton("In");

		t1 = new JTextField(25);
		t1.setText("DanhSachSinhVien");
		l1 = new JLabel("In Danh Sach Sinh Vien");

		btnPrint.addActionListener(this);

		contentPane.add(panel1, "North");
		contentPane.add(panel2, "Center");

		panel1.add(l1);
		panel2.add(t1);
		panel2.add(btnPrint);

	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnPrint) {
			JOptionPane.showMessageDialog(this, "Da In Thanh Cong", "Complete",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
