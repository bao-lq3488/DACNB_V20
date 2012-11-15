package view;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Form_AWT_Main extends JFrame implements ActionListener {
		/**
	 * 
	 */
		private static final long serialVersionUID = 1L;
		Container contentPane;
		JPanel panel1;
		JPanel panel2;
		JButton btnLietKeMH;
		JButton btnThemMH;
		JButton btnXoaSuaMH;
		JButton btnXemTTMH;
		JButton btnCapNhatDiemMH;
		JButton btnLietKeSV;
		JButton btnThemSV;
		JButton btnXoaSuaSV;
		JButton btnXemTTSV;
		JButton btnInDSSV;
		JButton btnCancel;

		public Form_AWT_Main() {
			setSize(400, 420);
			setTitle("Main");
			setResizable(false);

			contentPane = getContentPane();
			panel1 = new JPanel();
			panel2 = new JPanel();
			btnLietKeMH = new JButton("Liet Ke Mon Hoc");
			btnThemMH = new JButton("Them Mon Hoc");
			btnXoaSuaMH = new JButton("Xoa Sua Mon Hoc");
			btnXemTTMH = new JButton("Xem Thong Tin Mon Hoc");
			btnCapNhatDiemMH = new JButton("Cap Nhat Diem");
			btnLietKeSV = new JButton("Liet Ke Sinh Vien");
			btnThemSV = new JButton("Them Sinh Vien");
			btnXoaSuaSV = new JButton("Xoa Sua Sinh Vien");
			btnXemTTSV = new JButton("Xem Thong Tin Sinh Vien");
			btnInDSSV = new JButton("In Danh Sach Sinh Vien");
			btnCancel = new JButton("Thoat");

			btnLietKeMH.addActionListener(this);
			btnThemMH.addActionListener(this);
			btnXoaSuaMH.addActionListener(this);
			btnXemTTMH.addActionListener(this);
			btnCapNhatDiemMH.addActionListener(this);
			btnLietKeSV.addActionListener(this);
			btnThemSV.addActionListener(this);
			btnXoaSuaSV.addActionListener(this);
			btnXemTTSV.addActionListener(this);
			btnInDSSV.addActionListener(this);
			btnCancel.addActionListener(this);

			contentPane.add(panel2);

			panel2.setLayout(new GridLayout(6, 2));

			panel2.add(btnLietKeMH);
			panel2.add(btnThemMH);
			panel2.add(btnXoaSuaMH);
			panel2.add(btnXemTTMH);
			panel2.add(btnCapNhatDiemMH);
			panel2.add(btnLietKeSV);
			panel2.add(btnThemSV);
			panel2.add(btnXoaSuaSV);
			panel2.add(btnXemTTSV);
			panel2.add(btnInDSSV);
			panel2.add(btnCancel);
		}

		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == btnCancel)
				System.exit(0);
		}

	}