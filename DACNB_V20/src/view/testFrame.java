package view;

import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class testFrame extends JFrame {

	public testFrame() {
		MenuBar menuBar = new MenuBar();
		
		
		Menu menuFile = new Menu("File");
MenuItem open = new MenuItem("Open");
menuFile.add(open);		
		
		menuBar.add(menuFile);

		setTitle("Simple example");
		setSize(300, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setMenuBar(menuBar);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				testFrame ex = new testFrame();
				ex.setVisible(true);
			}
		});
	}
}
