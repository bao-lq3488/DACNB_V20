package view;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class DKF_LietKeSinhVien extends JInternalFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Container contentPane;
	JPanel panel1;
	JPanel panel2;
	
	JLabel lbTenSV;
	JLabel lbMSSV;
	JLabel lbNgayThangNamSinh;
	JLabel lbDiaChi;
	JLabel lbNganh;
	JLabel lbLop;
	JLabel lbKhoaHoc;
	
	JLabel lb2TenSV;
	JLabel lb2MSSV;
	JLabel lb2NgayThangNamSinh;
	JLabel lb2DiaChi;
	JLabel lb2Nganh;
	JLabel lb2Lop;
	JLabel lb2KhoaHoc;
	
	private static DKF_LietKeSinhVien instance = null;

	public static DKF_LietKeSinhVien getInstance() {
		if (instance == null) {
			instance = new DKF_LietKeSinhVien();
		}
		return instance;
	}

	private DKF_LietKeSinhVien() {
		setSize(1000, 420);
		setTitle("LietKeSinhVien");
		setResizable(true);
		setMaximizable(true);
		setClosable(true);
		setIconifiable(true);

		contentPane = getContentPane();
		panel1 = new JPanel();
		panel2 = new JPanel();
		
		lb2TenSV = new JLabel();
		lb2MSSV = new JLabel();
		lb2NgayThangNamSinh = new JLabel();
		lb2DiaChi = new JLabel();
		lb2Nganh = new JLabel();
		lb2Lop = new JLabel();
		lb2KhoaHoc = new JLabel();
		lbTenSV = new JLabel("Ten Sinh Vien");
		lbMSSV = new JLabel("Ma So Sinh Vien");
		lbNgayThangNamSinh = new JLabel("Ngay Thang Nam Sinh");
		lbDiaChi = new JLabel("Dia Chi");
		lbNganh = new JLabel("Nganh");
		lbLop = new JLabel("Lop");
		lbKhoaHoc = new JLabel("Khoa Hoc");


		contentPane.add(panel2);

		panel2.setLayout(new GridLayout(2, 5));

		panel2.add(lbTenSV);
		panel2.add(lbMSSV);
		panel2.add(lbNgayThangNamSinh);
		panel2.add(lbDiaChi);
		panel2.add(lbNganh);
		panel2.add(lbLop);
		panel2.add(lbKhoaHoc);
		
		panel2.add(lb2TenSV);
		panel2.add(lb2MSSV);
		panel2.add(lb2NgayThangNamSinh);
		panel2.add(lb2DiaChi);
		panel2.add(lb2Nganh);
		panel2.add(lb2Lop);
		panel2.add(lb2KhoaHoc);
		
	}

	public void actionPerformed(ActionEvent e) {

	}
}