package view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;

public class FormCon {

	public Shell shell;
	protected Display display;

	public FormCon(Display display) {

		shell = new Shell(display);
		shell.setText("FormCon");

		creatUI();

		shell.pack();
		shell.open();

		keepShell(display);

	}

	public void keepShell(Display display) {
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	private void creatUI() {
		// TODO Auto-generated method stub

		Menu menuBar = new Menu(shell, SWT.BAR);
		shell.setMenuBar(menuBar);

		MenuItem cascadeFileMenu = new MenuItem(menuBar, SWT.CASCADE);
		cascadeFileMenu.setText("&File");

		Menu fileMenu = new Menu(shell, SWT.DROP_DOWN);
		cascadeFileMenu.setMenu(fileMenu);

		MenuItem newItem = new MenuItem(fileMenu, SWT.PUSH);
		newItem.setText("&New");

		MenuItem openItem = new MenuItem(fileMenu, SWT.PUSH);
		openItem.setText("&Open");

		MenuItem saveItem = new MenuItem(fileMenu, SWT.PUSH);
		saveItem.setText("&Save");

		MenuItem exitItem = new MenuItem(fileMenu, SWT.PUSH);
		exitItem.setText("&Exit");
		exitItem.addListener(SWT.Selection, new Listener() {

			@Override
			public void handleEvent(Event arg0) {
				// TODO Auto-generated method stub
				shell.close();
			}
		});

		MenuItem cascadeToolMenu = new MenuItem(menuBar, SWT.CASCADE);
		cascadeToolMenu.setText("&Tool");

		Menu viewMenu = new Menu(shell, SWT.DROP_DOWN);
		cascadeToolMenu.setMenu(viewMenu);

		MenuItem showItem = new MenuItem(viewMenu, SWT.PUSH);
		showItem.setText("&Show");
		showItem.addListener(SWT.Selection, new Listener() {

			@Override
			public void handleEvent(Event arg0) {
				new FormCon2(display);
			}
		});

		MenuItem editItem = new MenuItem(viewMenu, SWT.PUSH);
		editItem.setText("&Edit");

		MenuItem deleteItem = new MenuItem(viewMenu, SWT.PUSH);
		deleteItem.setText("&Delete");
	}
}
