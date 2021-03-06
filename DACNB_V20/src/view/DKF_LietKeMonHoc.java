package view;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class DKF_LietKeMonHoc extends JInternalFrame implements
		ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Container contentPane;
	JPanel panel1;

	JLabel lbTenMH;
	JLabel lbKyHieuMH;
	JLabel lbSoTinChi;
	JLabel lbSoTiet;
	JLabel lbNganh;
	JLabel lbKhoaHoc;

	JLabel lb2TenMH;
	JLabel lb2KyHieuMH;
	JLabel lb2SoTinChi;
	JLabel lb2SoTiet;
	JLabel lb2Nganh;
	JLabel lb2KhoaHoc;

	private static DKF_LietKeMonHoc instance = null;

	public static DKF_LietKeMonHoc getInstance() {
		if (instance == null) {
			instance = new DKF_LietKeMonHoc();
		}
		return instance;
	}

	private DKF_LietKeMonHoc() {

		setSize(800, 420);
		setTitle("LietKeMonHoc");
		setResizable(true);
		setMaximizable(true);
		setClosable(true);
		setIconifiable(true);

		contentPane = getContentPane();
		panel1 = new JPanel();

		lb2TenMH = new JLabel();
		lb2KyHieuMH = new JLabel();
		lb2SoTinChi = new JLabel();
		lb2SoTiet = new JLabel();
		lb2Nganh = new JLabel();
		lb2KhoaHoc = new JLabel();

		lbTenMH = new JLabel("Ten Mon Hoc");
		lbKyHieuMH = new JLabel("Ky Hieu Mon Hoc");
		lbSoTinChi = new JLabel("So Tin Chi");
		lbSoTiet = new JLabel("Tong So Tiet");
		lbNganh = new JLabel("Nganh");
		lbKhoaHoc = new JLabel("Khoa Hoc");

		contentPane.add(panel1);

		panel1.setLayout(new GridLayout(2, 5));

		panel1.add(lbTenMH);
		panel1.add(lbKyHieuMH);
		panel1.add(lbSoTinChi);
		panel1.add(lbSoTiet);
		panel1.add(lbNganh);
		panel1.add(lbKhoaHoc);
		panel1.add(lb2TenMH);
		panel1.add(lb2KyHieuMH);
		panel1.add(lb2SoTinChi);
		panel1.add(lb2SoTiet);
		panel1.add(lb2KhoaHoc);

	}

	public void actionPerformed(ActionEvent e) {

	}
}