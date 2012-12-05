package view;

import javax.swing.SwingUtilities;

public class DKF_Main {


	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				DKF_Login login = new DKF_Login();
				login.setVisible(true);
			}
		});
	}
}