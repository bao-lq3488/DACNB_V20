package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DKF_InDSSV extends JInternalFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Container contentPane;
	JPanel panel1;
	JPanel panel2;
	JButton btnOK;
	JButton btnClear;
	JTextField tefNhapTenMH;
	JLabel l1;
	JLabel l2;

	private static DKF_InDSSV instance = null;

	public static DKF_InDSSV getInstance() {
		if (instance == null) {
			instance = new DKF_InDSSV();
		}
		return instance;
	}

	private DKF_InDSSV() {
		setSize(320, 230);
		setTitle("InDanhSachSinhVien");
		setResizable(true);
		setMaximizable(true);
		setClosable(true);
		setIconifiable(true);

		contentPane = getContentPane();
		panel1 = new JPanel();
		panel2 = new JPanel();

		btnOK = new JButton("Dong Y");
		btnClear = new JButton("Clear");
		
		tefNhapTenMH = new JTextField(25);
		l1 = new JLabel("In Danh Sach Sinh Vien");
		l2 = new JLabel("Nhap Ten Mon Hoc: ");

		btnOK.addActionListener(this);
		btnClear.addActionListener(this);
		
		contentPane.add(panel1, "North");
		contentPane.add(panel2, "Center");

		panel1.add(l1);
		panel2.add(l2);
		panel2.add(tefNhapTenMH);
		panel2.add(btnOK);
		panel2.add(btnClear);

	}

	public void actionPerformed(ActionEvent e) {

		String Ok = tefNhapTenMH.getText();

		if (e.getActionCommand().equals("Dong Y")) {
			if (e.getSource() == btnOK) {
				if (Ok.equals("")) {
					JOptionPane.showMessageDialog(null,
							"Chua Nhap Ten Mon Hoc", "Error",
							JOptionPane.ERROR_MESSAGE);
				} else {
					DKF_Menu.getAddFormInDSSV();
					this.setVisible(false);
				}
			}
		}
		
		if (e.getActionCommand().equals("Clear")) {
			tefNhapTenMH.setText("");
		}
	}
}
