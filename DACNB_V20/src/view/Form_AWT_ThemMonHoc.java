package view;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Form_AWT_ThemMonHoc extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8054095306133526836L;
	Container contentPane;
	JPanel panel1;
	JPanel panel2;
	JButton add;
	JButton back;
	JTextField t1;
	JTextField t2;
	JTextField t3;
	JTextField t4;
	JTextField t5;
	JTextField t6;
	JTextField t7;
	JLabel l2;
	JLabel l3;
	JLabel l4;
	JLabel l5;
	JLabel l6;
	JLabel l7;

	public Form_AWT_ThemMonHoc() {
		setSize(400, 420);
		setTitle("ThemMonHoc");
		setResizable(false);

		contentPane = getContentPane();
		panel1 = new JPanel();
		panel2 = new JPanel();
		add = new JButton("Thêm");
		back = new JButton("Quay Lại");
		t1 = new JTextField(20);
		t2 = new JTextField(20);
		t3 = new JTextField(20);
		t4 = new JTextField(20);
		t5 = new JTextField(20);
		t6 = new JTextField(20);
		t7 = new JTextField(20);
		l2 = new JLabel("Tên Môn Học");
		l3 = new JLabel("Ký Hiệu Môn Học");
		l4 = new JLabel("Số Tín Chỉ");
		l5 = new JLabel("Tổng Số Tiết");
		l6 = new JLabel("Ngành");
		l7 = new JLabel("Khóa Học");

		add.addActionListener(this);
		back.addActionListener(this);

		contentPane.add(panel2);

		panel2.setLayout(new GridLayout(7, 2));

		panel2.add(l2);
		panel2.add(t1);
		panel2.add(l3);
		panel2.add(t3);
		panel2.add(l4);
		panel2.add(t4);
		panel2.add(l5);
		panel2.add(t5);
		panel2.add(l6);
		panel2.add(t6);
		panel2.add(l7);
		panel2.add(t7);
		panel2.add(add);
		panel2.add(back);
	}

	public void actionPerformed(ActionEvent e) {
		String add1 = t1.getText();
		String add2 = t2.getText();
		String add3 = t3.getText();
		String add4 = t4.getText();
		String add5 = t5.getText();
		String add6 = t6.getText();
		String add7 = t7.getText();

		if (e.getSource() == add) {
			if (add1.equals("") && add2.equals("") && add3.equals("")
					&& add4.equals("") && add5.equals("") && add6.equals("")
					&& add7.equals("")) {
				JOptionPane.showMessageDialog(null,
						"Điền Đầy Đủ Thông Tin Môn Học", "Error",
						JOptionPane.ERROR_MESSAGE);
			}
		}
	}

}
