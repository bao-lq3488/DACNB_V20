package view;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class DKF_ThemSinhVien extends JInternalFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Container contentPane;
	JPanel panel1;
	JPanel panel2;
	JButton btnAdd;
	JButton btnClear;

	JTextField tefTenSV;
	JTextField tefMSSV;
	JTextField tefNgayThangNamSinh;
	JTextField tefDiaChi;
	JTextField tefNganh;
	JTextField tefLop;
	JTextField tefKhoaHoc;

	JLabel lbTenSV;
	JLabel lbMSSV;
	JLabel lbNgayThangNamSinh;
	JLabel lbDiaChi;
	JLabel lbNganh;
	JLabel lbLop;
	JLabel lbKhoaHoc;
	
	private static DKF_ThemSinhVien instance = null;

	public static DKF_ThemSinhVien getInstance() {
		if (instance == null) {
			instance = new DKF_ThemSinhVien();
		}
		return instance;
	}

	private DKF_ThemSinhVien() {
		setSize(400, 420);
		setTitle("ThemSinhVien");
		setResizable(true);
		setMaximizable(true);
		setClosable(true);
		setIconifiable(true);

		contentPane = getContentPane();
		panel1 = new JPanel();
		panel2 = new JPanel();
		btnAdd = new JButton("Them");
		btnClear = new JButton("Clear");

		tefTenSV = new JTextField(20);
		tefMSSV = new JTextField(20);
		tefNgayThangNamSinh = new JTextField(20);
		tefDiaChi = new JTextField(20);
		tefNganh = new JTextField(20);
		tefLop = new JTextField(20);
		tefKhoaHoc = new JTextField(20);

		lbTenSV = new JLabel("Ten Sinh Vien");
		lbMSSV = new JLabel("Ma So Sinh Vien");
		lbNgayThangNamSinh = new JLabel("Ngay Thang Nam Sinh");
		lbDiaChi = new JLabel("Dia Chi");
		lbNganh = new JLabel("Nganh");
		lbLop = new JLabel("Lop");
		lbKhoaHoc = new JLabel("Khoa Hoc");

		btnAdd.addActionListener(this);
		btnClear.addActionListener(this);

		contentPane.add(panel2);

		panel2.setLayout(new GridLayout(8, 2));

		panel2.add(lbTenSV);
		panel2.add(tefTenSV);
		panel2.add(lbMSSV);
		panel2.add(tefMSSV);
		panel2.add(lbNgayThangNamSinh);
		panel2.add(tefNgayThangNamSinh);
		panel2.add(lbDiaChi);
		panel2.add(tefDiaChi);
		panel2.add(lbNganh);
		panel2.add(tefNganh);
		panel2.add(lbLop);
		panel2.add(tefLop);
		panel2.add(lbKhoaHoc);
		panel2.add(tefKhoaHoc);
		panel2.add(btnAdd);
		panel2.add(btnClear);
	}

	public void actionPerformed(ActionEvent e) {
		String add1 = tefTenSV.getText();
		String add2 = tefMSSV.getText();
		String add3 = tefNgayThangNamSinh.getText();
		String add4 = tefDiaChi.getText();
		String add5 = tefNganh.getText();
		String add6 = tefLop.getText();
		String add7 = tefKhoaHoc.getText();

		if (e.getActionCommand().equals("Them")) {
			if (e.getSource() == btnAdd) {
				if (add1.equals("") || add2.equals("") || add3.equals("")
						|| add4.equals("") || add5.equals("")
						|| add6.equals("") || add7.equals("")) {
					JOptionPane.showMessageDialog(null,
							"Dien Day Du Thong Tin Sinh Vien", "Error",
							JOptionPane.ERROR_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null,
							"Da Them Sinh Vien Thanh Cong");
				}
			}
		}

		if (e.getActionCommand().equals("Clear")) {
			tefTenSV.setText("");
			tefMSSV.setText("");
			tefNgayThangNamSinh.setText("");
			tefDiaChi.setText("");
			tefNganh.setText("");
			tefLop.setText("");
			tefKhoaHoc.setText("");
		}
	}
}