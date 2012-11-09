package view;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Form_AWT_LietKeSinhVien {
	public static void main(String[] args) {
		JFrame frame = new LietKeSVFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class LietKeSVFrame extends JFrame implements ActionListener {
	Container contentPane;
	JPanel panel1;
	JPanel panel2;
	JButton exit;
	JButton back;
	JLabel l1;
	JLabel l2;
	JLabel l3;
	JLabel l4;
	JLabel l5;
	JLabel l6;
	JLabel l7;
	JLabel l8;
	JLabel l9;
	JLabel l10;
	JLabel l11;
	JLabel l12;
	JLabel l13;
	JLabel l14;
	
	public LietKeSVFrame() {
		setSize(1000, 420);
		setTitle("LietKeSinhVien");
		setResizable(false);

		contentPane = getContentPane();
		panel1 = new JPanel();
		panel2 = new JPanel();
		exit = new JButton("Thoát");
		back = new JButton("Quay Lại");
		l8 = new JLabel();
		l9 = new JLabel();
		l10 = new JLabel();
		l11 = new JLabel();
		l12 = new JLabel();
		l13 = new JLabel();
		l14 = new JLabel();
		l1 = new JLabel("Tên Sinh Viên");
		l2 = new JLabel("Mã Số Sinh Viên");
		l3 = new JLabel("Ngày Tháng Năm Sinh");
		l4 = new JLabel("Địa Chỉ");
		l5 = new JLabel("Ngành");
		l6 = new JLabel("Lớp");
		l7 = new JLabel("Khóa Học");


		exit.addActionListener(this);

		contentPane.add(panel2);
		
		panel2.setLayout(new GridLayout(2,5));
		
		panel2.add(l1);
		panel2.add(l2);
		panel2.add(l3);
		panel2.add(l4);
		panel2.add(l5);
		panel2.add(l6);
		panel2.add(l7);
		panel2.add(exit);
		panel2.add(l8);
		panel2.add(l9);
		panel2.add(l10);
		panel2.add(l11);
		panel2.add(l12);
		panel2.add(l13);
		panel2.add(l14);
		panel2.add(back);
		
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == exit)
			System.exit(0);
	}

}