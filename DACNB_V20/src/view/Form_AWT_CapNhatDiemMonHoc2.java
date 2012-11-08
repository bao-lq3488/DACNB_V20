package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Form_AWT_CapNhatDiemMonHoc2 {
	public static void main(String[] args) {
		JFrame frame = new CapNhatDiemMonHoc2Frame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class CapNhatDiemMonHoc2Frame extends JFrame implements ActionListener {
	Container contentPane;
	JPanel panel1;
	JPanel panel2;
	JButton update;
	JButton cancel;
	JTextField t1;
	JLabel l1;

	public CapNhatDiemMonHoc2Frame() {
		setSize(320, 230);
		setTitle("CapNhatDiemMonHoc");
		setResizable(false);

		contentPane = getContentPane();
		panel1 = new JPanel();
		panel2 = new JPanel();

		update = new JButton("Cập Nhật");
		cancel = new JButton("Hủy Bỏ");
		t1 = new JTextField(25);
		t1.setText("InDanhSachSinhVienMonHoc");
		l1 = new JLabel("Cập Nhật Điểm Môn Học");

		update.addActionListener(this);
		cancel.addActionListener(this);

		contentPane.add(panel1, "North");
		contentPane.add(panel2, "Center");

		panel1.add(l1);
		panel2.add(t1);
		panel2.add(update);
		panel2.add(cancel);

	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == update) {
			JOptionPane.showMessageDialog(this, "Đã Cập Nhật Thành Công", "Complete",
					JOptionPane.INFORMATION_MESSAGE);
		}

		if (e.getSource() == cancel) {
			System.exit(0);
		}

	}

}
