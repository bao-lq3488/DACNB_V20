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
	JTextField t2;
	JTextField t1;
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
		if (e.getActionCommand().equals("Login")) {
			JFrame f = new Form_AWT_ThemMonHoc();
			f.setVisible(true);
		} else {
			JOptionPane.showMessageDialog(this, "Cancel");
		}
		// String Username = t1.getText();
		// String Password = t2.getText();
		//
		// if (e.getSource() == login) {
		// if (Username.equals("") && Password.equals("")) {
		// JOptionPane.showMessageDialog(null,
		// "Enter Username or Password", "Error",
		// JOptionPane.ERROR_MESSAGE);
		// }
		// if (Password.equals("")) {
		// JOptionPane.showMessageDialog(null, "Enter Your Password",
		// "Error", JOptionPane.ERROR_MESSAGE);
		// }
		// }
		// if (e.getSource() == cancel) {
		// JOptionPane.showMessageDialog(this, "Thanks");
		// System.exit(0);
		// }

	}

}
