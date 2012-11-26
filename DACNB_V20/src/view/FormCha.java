package view;

import java.awt.Menu;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class FormCha {
	public Shell shell;

	public FormCha(Display display){
		
		//Lam theo form dang nay cho ro rang truoc 
		//roi button click 1,2 ngay nua Bao them vao sau
		//chu viet kieu cu roi wa
		
		shell = new Shell(display);
		shell.setText("MainForm");
		
		createUI();
		
		shell.pack();
		shell.setLocation(25,25);
		
		shell.open();
		
		while(!shell.isDisposed())
		{
			if(!display.readAndDispatch())
			{
					display.sleep();
			}
		}
	}
	
	private void createUI() {
		// TODO Auto-generated method stub
		GridLayout gl = new GridLayout(4,true);
		gl.horizontalSpacing = 4; 
		gl.marginLeft = 5;
		gl.marginTop = 10;
		
		Button btn = new Button(shell, SWT.PUSH);
        btn.setText("1");
        GridData gd = new GridData(SWT.FILL, SWT.FILL, false, false);
        gd.heightHint = 50;
        gd.widthHint = 30;
        btn.setLayoutData(gd);
        
        Button btn2 = new Button(shell, SWT.PUSH);
        btn2.setText("2");
        GridData gd2 = new GridData(SWT.FILL, SWT.FILL, false, false);
        gd2.heightHint = 50;
        gd2.widthHint = 30;
        btn.setLayoutData(gd);
        
        Button btn3 = new Button(shell, SWT.PUSH);
        btn3.setText("3");
        GridData gd3 = new GridData(SWT.FILL, SWT.FILL, false, false);
        gd3.heightHint = 40;
        gd3.widthHint = 30;
        btn3.setLayoutData(gd);
        
        Label lb = new Label(shell, SWT.CENTER);
        GridData gd4 = new GridData(SWT.FILL, SWT.FILL, false, false);
        lb.setLayoutData(gd4);
        
        Text text = new Text(shell, SWT.BORDER);
        GridData gd5 = new GridData(SWT.FILL, SWT.FILL, false, false);
        gd5.horizontalSpan = 4;
        text.setLayoutData(gd5);
        		
	}

	public static void main(String args[]) {
		Display display = new Display();
		
		new FormCha(display);
		display.dispose();
	}
	
}
