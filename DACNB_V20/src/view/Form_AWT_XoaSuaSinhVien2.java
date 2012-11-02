package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Form_AWT_XoaSuaSinhVien2 {
	public static void main(String[] args) {
		JFrame frame = new XoaSuaSinhVien2Frame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class XoaSuaSinhVien2Frame extends JFrame implements ActionListener {
	Container contentPane;
	JPanel panel1;
	JPanel panel2;
	JButton del;
	JButton edit;
	JButton cancel;
	JTextField t1;
	JLabel l1;

	public XoaSuaSinhVien2Frame() {
		setSize(320, 230);
		setTitle("XoaSuaSinhVien");
		setResizable(false);

		contentPane = getContentPane();
		panel1 = new JPanel();
		panel2 = new JPanel();

		del = new JButton("Delete");
		edit = new JButton("Edit");
		cancel = new JButton("Cancel");
		t1 = new JTextField(25);
		t1.setText("InThongTinSinhVien");
		l1 = new JLabel("XoaSuaSinhVien");

		del.addActionListener(this);
		edit.addActionListener(this);
		cancel.addActionListener(this);

		contentPane.add(panel1, "North");
		contentPane.add(panel2, "Center");

		panel1.add(l1);
		panel2.add(t1);
		panel2.add(del);
		panel2.add(edit);
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
