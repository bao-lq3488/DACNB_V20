package view;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Form_AWT_XemThongTinSinhVien2 {
	public static void main(String[] args) {
		JFrame frame = new XemThongTinSinhVien2Frame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class XemThongTinSinhVien2Frame extends JFrame implements ActionListener {
	Container contentPane;
	JPanel panel1;
	JPanel panel2;
	JButton exit;
	JButton back;
	JTextField t1;
	JLabel l1;

	public XemThongTinSinhVien2Frame() {
		setSize(320, 230);
		setTitle("XemThongTinSinhVien");
		setResizable(false);

		contentPane = getContentPane();
		panel1 = new JPanel();
		panel2 = new JPanel();

		exit = new JButton("Thoát");
		back = new JButton("Quay Lại");
		t1 = new JTextField(25);
		t1.setText("InThongTinSinhVien");
		l1 = new JLabel("Xem Thông Tin Sinh Viên");

		exit.addActionListener(this);
	
		contentPane.add(panel1, "North");
		contentPane.add(panel2, "Center");

		panel1.add(l1);
		panel2.add(t1);
		panel2.add(back);
		panel2.add(exit);


	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == exit) {
			System.exit(0);
		}

	}

}
