package view;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class DKF_XemThongTinSinhVien extends JInternalFrame implements
		ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Container contentPane;
	JPanel panel1;
	JPanel panel2;
	JButton btnOK;
	JButton btnClear;
	JTextField tefNhapTenSV;
	JLabel l1;
	JLabel l2;

	private static DKF_XemThongTinSinhVien instance = null;

	public static DKF_XemThongTinSinhVien getInstance() {
		if (instance == null) {
			instance = new DKF_XemThongTinSinhVien();
		}
		return instance;
	}

	private DKF_XemThongTinSinhVien() {
		setSize(320, 230);
		setTitle("XemThongTinSinhVien");
		setResizable(true);
		setMaximizable(true);
		setClosable(true);
		setIconifiable(true);

		contentPane = getContentPane();
		panel1 = new JPanel();
		panel2 = new JPanel();

		btnOK = new JButton("Dong Y");
		btnClear = new JButton("Clear");
		
		tefNhapTenSV = new JTextField(25);
		l1 = new JLabel("Xem Thong Tin Sinh Vien");
		l2 = new JLabel("Nhap Ten Sinh Vien Can Xem: ");

		btnOK.addActionListener(this);
		btnClear.addActionListener(this);

		contentPane.add(panel1, "North");
		contentPane.add(panel2, "Center");

		panel1.add(l1);
		panel2.add(l2);
		panel2.add(tefNhapTenSV);
		panel2.add(btnOK);
		panel2.add(btnClear);

	}

	public void actionPerformed(ActionEvent e) {

		String Ok = tefNhapTenSV.getText();

		if (e.getActionCommand().equals("Dong Y")) {
			if (e.getSource() == btnOK) {
				if (Ok.equals("")) {
					JOptionPane.showMessageDialog(null, "Dien Ten Sinh Vien",
							"Error", JOptionPane.ERROR_MESSAGE);
				} else {
					DKF_Menu.getAddFormXemTTSV();
					this.setVisible(false);
				}
			}
		}
		
		if (e.getActionCommand().equals("Clear")) {
			tefNhapTenSV.setText("");
		}
	}
}
