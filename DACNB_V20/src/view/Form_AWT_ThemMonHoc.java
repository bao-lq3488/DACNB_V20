package view;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Form_AWT_ThemMonHoc {
	public static void main(String[] args) {
		JFrame frame = new THEMMHFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class THEMMHFrame extends JFrame implements ActionListener {
	Container contentPane;
	JPanel panel1;
	JPanel panel2;
	JButton add;
	JButton cancel;
	JTextField t1;
	JTextField t2;
	JTextField t3;
	JTextField t4;
	JTextField t5;
	JTextField t6;
	JTextField t7;
	JLabel l1;
	JLabel l2;
	JLabel l3;
	JLabel l4;
	JLabel l5;
	JLabel l6;
	JLabel l7;

	public THEMMHFrame() {
		setSize(400, 420);
		setTitle("ThemMonHoc");
		setResizable(false);

		contentPane = getContentPane();
		panel1 = new JPanel();
		panel2 = new JPanel();
		add = new JButton("Them");
		cancel = new JButton("Cancel");
		t1 = new JTextField(20);
		t2 = new JTextField(20);
		t3 = new JTextField(20);
		t4 = new JTextField(20);
		t5 = new JTextField(20);
		t6 = new JTextField(20);
		t7 = new JTextField(20);
		l1 = new JLabel("ThemMonHoc");
		l2 = new JLabel("TenMH");
		l3 = new JLabel("KyHieuMonHoc");
		l4 = new JLabel("SoTC");
		l5 = new JLabel("TongSoTiet");
		l6 = new JLabel("Nganh");
		l7 = new JLabel("KhoaHoc");

		add.addActionListener(this);
		cancel.addActionListener(this);

		contentPane.add(panel1, "North");
		contentPane.add(panel2, "Center");

		panel1.add(l1);
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
		panel2.add(cancel);
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
				JOptionPane.showMessageDialog(null, "Enter Full Information",
						"Error", JOptionPane.ERROR_MESSAGE);
			}
		}

		if (e.getSource() == cancel)
			System.exit(0);
	}

}