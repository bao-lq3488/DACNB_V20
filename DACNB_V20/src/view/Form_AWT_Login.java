package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Form_AWT_Login extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2423475278285601971L;
	Container contentPane;
	JPanel panel1;
	JPanel panel2;
	JButton btnLogin;
	JButton btnCancel;
	JTextField t1;
	JTextField t2;
	JLabel l1;
	JLabel l2;
	JLabel l3;

	public Form_AWT_Login() {
		setSize(320, 230);
		setTitle("Login Form");
		setResizable(false);

		contentPane = getContentPane();
		panel1 = new JPanel();
		panel2 = new JPanel();

		btnLogin = new JButton("Login");
		btnCancel = new JButton("Cancel");

		t1 = new JTextField(20);
		t2 = new JPasswordField(20);
		l1 = new JLabel("Welcome");
		l2 = new JLabel("Username : ");
		l3 = new JLabel("Password : ");

		btnLogin.addActionListener(this);
		btnCancel.addActionListener(this);

		contentPane.add(panel1, "North");
		contentPane.add(panel2, "Center");

		panel1.add(l1);
		panel2.add(l2);
		panel2.add(t1);
		panel2.add(l3);
		panel2.add(t2);
		panel2.add(btnLogin);
		panel2.add(btnCancel);

	}

	public void actionPerformed(ActionEvent e) {
		String Login = t1.getText();
		String Pass = t2.getText();

		if (e.getActionCommand().equals("Login")) {
			if (e.getSource() == btnLogin) {
				if (Login.equals("") && Pass.equals("")) {
					JOptionPane.showMessageDialog(null,
							"Nhap Ten Dang Nhap Va Mat Khau", "Error",
							JOptionPane.ERROR_MESSAGE);
				}

				else {
					JFrame f = new Form_AWT_Main();
					f.setVisible(true);
					this.setVisible(false);
				}
			}
		}

		if (e.getActionCommand().equals("Cancel")) {
			System.exit(0);
		}
	}
}
