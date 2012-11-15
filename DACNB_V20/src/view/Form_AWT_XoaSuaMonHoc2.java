package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Form_AWT_XoaSuaMonHoc2 extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Container contentPane;
	JPanel panel1;
	JPanel panel2;
	JButton del;
	JButton edit;
	JButton back;
	JButton cancel;
	JTextField t1;
	JLabel l1;

	public Form_AWT_XoaSuaMonHoc2() {
		setSize(320, 230);
		setTitle("XoaSuaMonHoc");
		setResizable(false);

		contentPane = getContentPane();
		panel1 = new JPanel();
		panel2 = new JPanel();

		del = new JButton("Xóa");
		edit = new JButton("Sửa");
		cancel = new JButton("Thoát");
		back = new JButton("Quay Lại");
		t1 = new JTextField(25);
		t1.setText("InThongTinMonHoc");
		l1 = new JLabel("Xóa Sửa Môn Học");

		del.addActionListener(this);
		edit.addActionListener(this);
		cancel.addActionListener(this);

		contentPane.add(panel1, "North");
		contentPane.add(panel2, "Center");

		panel1.add(l1);
		panel2.add(t1);
		panel2.add(del);
		panel2.add(edit);
		panel2.add(back);
		panel2.add(cancel);

	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == del) {
			JOptionPane.showMessageDialog(this, "Are You Sure", "ChuY",
					JOptionPane.QUESTION_MESSAGE);
		}

		if (e.getSource() == edit) {
			JOptionPane.showMessageDialog(this, "Are You Sure", "ChuY",
					JOptionPane.QUESTION_MESSAGE);
		}

		if (e.getSource() == cancel) {
			System.exit(0);
		}

	}

}
