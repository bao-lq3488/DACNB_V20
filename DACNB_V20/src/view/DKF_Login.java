package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DKF_Login extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2423475278285601971L;
	Container contentPane;
	JPanel panel1;
	JPanel panel2;
	JButton btnLogin;
	JButton btnCancel;
	JTextField tefUsername;
	JTextField tefPassword;
	JLabel lbWelcome;
	JLabel lbUsername;
	JLabel lbPassword;

	public DKF_Login() {
		setSize(320, 230);
		setTitle("Login Form");
		setResizable(false);

		contentPane = getContentPane();
		panel1 = new JPanel();
		panel2 = new JPanel();

		btnLogin = new JButton("Login");
		btnCancel = new JButton("Cancel");

		tefUsername = new JTextField(20);
		tefPassword = new JPasswordField(20);
		lbWelcome = new JLabel("Welcome");
		lbUsername = new JLabel("Username : ");
		lbPassword = new JLabel("Password : ");

		btnLogin.addActionListener(this);
		btnCancel.addActionListener(this);

		contentPane.add(panel1, "North");
		contentPane.add(panel2, "Center");

		panel1.add(lbWelcome);
		panel2.add(lbUsername);
		panel2.add(tefUsername);
		panel2.add(lbPassword);
		panel2.add(tefPassword);
		panel2.add(btnLogin);
		panel2.add(btnCancel);

	}

	public void actionPerformed(ActionEvent e) {
		String Login = tefUsername.getText();
		String Pass = tefPassword.getText();

		if (e.getActionCommand().equals("Login")) {
			if (e.getSource() == btnLogin) {
				if (Login.equals("") || Pass.equals("")) {
					JOptionPane.showMessageDialog(null,
							"Nhap Ten Dang Nhap Va Mat Khau", "Error",
							JOptionPane.ERROR_MESSAGE);
				}

				else {
					JFrame f = new DKF_Menu();
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
