package view;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Form_AWT_Main {
	public static void main(String[] args) {
		JFrame frame = new MainFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MainFrame extends JFrame implements ActionListener {
	Container contentPane;
	JPanel panel1;
	JPanel panel2;
	JButton lietkemh;
	JButton themmh;
	JButton xoasuamh;
	JButton xemttmh;
	JButton capnhatdiemmh;
	JButton lietkesv;
	JButton themsv;
	JButton xoasuasv;
	JButton xemttsv;
	JButton indssv;
	JButton cancel;
	

	public MainFrame() {
		setSize(400, 420);
		setTitle("Main");
		setResizable(false);

		contentPane = getContentPane();
		panel1 = new JPanel();
		panel2 = new JPanel();
		lietkemh = new JButton("Liệt Kê Môn Học");
		themmh = new JButton("Thêm Môn Học");
		xoasuamh = new JButton("Xóa Sửa Môn Học");
		xemttmh = new JButton("Xem Thông Tin Môn Học");
		capnhatdiemmh = new JButton("Cập Nhật Điểm");
		lietkesv = new JButton("Liệt Kê Sinh Viên");
		themsv = new JButton("Thêm Sinh Viên");
		xoasuasv = new JButton("Xóa Sửa Sinh Viên");
		xemttsv = new JButton("Xem Thông Tin Sinh Viên");
		indssv = new JButton("In Danh Sách Sinh Viên");
		cancel = new JButton("Thoát");
	

		lietkemh.addActionListener(this);
		themmh.addActionListener(this);
		xoasuamh.addActionListener(this);
		xemttmh.addActionListener(this);
		capnhatdiemmh.addActionListener(this);
		lietkesv.addActionListener(this);
		themsv.addActionListener(this);
		xoasuasv.addActionListener(this);
		xemttsv.addActionListener(this);
		indssv.addActionListener(this);
		cancel.addActionListener(this);

		contentPane.add(panel2);
		
		panel2.setLayout(new GridLayout(6, 2));
		

		panel2.add(lietkemh);
		panel2.add(themmh);
		panel2.add(xoasuamh);
		panel2.add(xemttmh);
		panel2.add(capnhatdiemmh);
		panel2.add(lietkesv);
		panel2.add(themsv);
		panel2.add(xoasuasv);
		panel2.add(xemttsv);
		panel2.add(indssv);
		panel2.add(cancel);
	}

	public void actionPerformed(ActionEvent e) {
	

		if (e.getSource() == cancel)
			System.exit(0);
	}

}