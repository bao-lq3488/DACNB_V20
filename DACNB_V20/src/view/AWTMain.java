package view;

import javax.swing.SwingUtilities;

public class AWTMain {


	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Form_AWT_Login login = new Form_AWT_Login();
				login.setVisible(true);
			}
		});
	}
}
