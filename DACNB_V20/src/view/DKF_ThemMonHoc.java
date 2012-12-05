package view;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class DKF_ThemMonHoc extends JInternalFrame implements
		ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8054095306133526836L;
	Container contentPane;
	JPanel panel1;
	JButton btnAdd;
	JButton btnClear;
	JTextField tefTenMH;
	JTextField tefKyHieuMH;
	JTextField tefSoTinChi;
	JTextField tefSoTiet;
	JTextField tefNganh;
	JTextField tefKhoaHoc;
	JLabel lbTenMH;
	JLabel lbKyHieuMH;
	JLabel lbSoTinChi;
	JLabel lbSoTiet;
	JLabel lbNganh;
	JLabel lbKhoaHoc;

	private static DKF_ThemMonHoc instance = null;

	public static DKF_ThemMonHoc getInstance() {
		if (instance == null) {
			instance = new DKF_ThemMonHoc();
		}
		return instance;
	}

	private DKF_ThemMonHoc() {
		setSize(400, 420);
		setTitle("ThemMonHoc");
		setResizable(true);
		setMaximizable(true);
		setClosable(true);
		setIconifiable(true);

		contentPane = getContentPane();

		panel1 = new JPanel();

		btnAdd = new JButton("Them");
		btnClear = new JButton("Clear");

		tefTenMH = new JTextField(20);
		tefKyHieuMH = new JTextField(20);
		tefSoTinChi = new JTextField(20);
		tefSoTiet = new JTextField(20);
		tefNganh = new JTextField(20);
		tefKhoaHoc = new JTextField(20);

		lbTenMH = new JLabel("Ten Mon Hoc");
		lbKyHieuMH = new JLabel("Ky Hieu Mon Hoc");
		lbSoTinChi = new JLabel("So Tin Chi");
		lbSoTiet = new JLabel("Tong So Tiet");
		lbNganh = new JLabel("Nganh");
		lbKhoaHoc = new JLabel("Khoa Hoc");

		btnAdd.addActionListener(this);
		btnClear.addActionListener(this);

		contentPane.add(panel1);

		panel1.setLayout(new GridLayout(7, 2));

		panel1.add(lbTenMH);
		panel1.add(tefTenMH);
		panel1.add(lbKyHieuMH);
		panel1.add(tefKyHieuMH);
		panel1.add(lbSoTinChi);
		panel1.add(tefSoTinChi);
		panel1.add(lbSoTiet);
		panel1.add(tefSoTiet);
		panel1.add(lbNganh);
		panel1.add(tefNganh);
		panel1.add(lbKhoaHoc);
		panel1.add(tefKhoaHoc);
		panel1.add(btnAdd);
		panel1.add(btnClear);
	}

	public void actionPerformed(ActionEvent e) {
		String add1 = tefTenMH.getText();
		String add2 = tefKyHieuMH.getText();
		String add3 = tefSoTinChi.getText();
		String add4 = tefSoTiet.getText();
		String add5 = tefNganh.getText();
		String add6 = tefKhoaHoc.getText();

		if (e.getActionCommand().equals("Them")) {
			if (e.getSource() == btnAdd) {
				if (add1.equals("") || add2.equals("") || add3.equals("")
						|| add4.equals("") || add5.equals("")
						|| add6.equals("")) {
					JOptionPane.showMessageDialog(null,
							"Dien Day Du Thong Tin Mon Hoc", "Error",
							JOptionPane.ERROR_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null,
							"Da Them Sinh Vien Thanh Cong");
				}
			}
		}

		if (e.getActionCommand().equals("Clear")) {
			tefTenMH.setText("");
			tefKyHieuMH.setText("");
			tefSoTinChi.setText("");
			tefSoTiet.setText("");
			tefNganh.setText("");
			tefKhoaHoc.setText("");
		}
	}
}