package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Form_AWT_CapNhatDiemMonHoc {
	public static void main(String[] args) {
		JFrame frame = new CapNhatDiemMonHocFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class CapNhatDiemMonHocFrame extends JFrame implements ActionListener {
	Container contentPane;
	JPanel panel1;
	JPanel panel2;
	JButton ok;
	JButton cancel;
	JTextField t1;
	JLabel l1;
	JLabel l2;

	public CapNhatDiemMonHocFrame() {
		setSize(320, 230);
		setTitle("CapNhatDiemMonHoc");
		setResizable(false);

		contentPane = getContentPane();
		panel1 = new JPanel();
		panel2 = new JPanel();

		ok = new JButton("Đồng Ý");
		cancel = new JButton("Hủy Bỏ");
		t1 = new JTextField(25);
		l1 = new JLabel("Cập Nhật Điểm Môn Học");
		l2 = new JLabel("Nhập Tên Môn Học Cần Nhập Điểm: ");

		ok.addActionListener(this);
		cancel.addActionListener(this);

		contentPane.add(panel1, "North");
		contentPane.add(panel2, "Center");

		panel1.add(l1);
		panel2.add(l2);
		panel2.add(t1);
		panel2.add(ok);
		panel2.add(cancel);

	}

	public void actionPerformed(ActionEvent e) {

		String Ok = t1.getText();

		if (e.getSource() == ok) {
			if (Ok.equals("")) {
				JOptionPane.showMessageDialog(null,
						"Chưa Nhập Tên Môn Học", "Error",
						JOptionPane.ERROR_MESSAGE);
			}
		}
		if (e.getSource() == cancel) {
			System.exit(0);
		}

	}

}
