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
		shell.setLocation(10, 10);
		
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
		gl.verticalSpacing = 10;
		gl.marginLeft = 10;
		gl.marginRight = 10;
		gl.marginTop = 5;
		shell.setLayout(gl);
		
		Button btn = new Button(shell, SWT.PUSH);
        btn.setText("1");
        GridData gd = new GridData(SWT.FILL, SWT.FILL, false, false);
        btn.setLayoutData(gd);
        
        Button btn2 = new Button(shell, SWT.PUSH);
        btn2.setText("2");
        btn2.setLayoutData(gd);
        
        Button btn3 = new Button(shell, SWT.PUSH);
        btn3.setText("3");
        btn3.setLayoutData(gd);
        
        Label lb = new Label(shell, SWT.CENTER);
        lb.setLayoutData(gd);
        lb.setText("Why button 2 is too small?\n Nut 2 sao nho vay! Sua ko dc");
        
        Text text = new Text(shell, SWT.BORDER);
        GridData gd2 = new GridData(SWT.FILL, SWT.FILL, false, false);
        gd2.horizontalSpan = 4;
        text.setLayoutData(gd2);
        text.setText("Cai nay no chiem het hang do  g5.horizontalSpan = 4");
        
        Text text2 = new Text(shell, SWT.BORDER);
        GridData gd3 = new GridData(SWT.FILL, SWT.FILL, false, false);
        gd3.horizontalSpan = 2;
        text2.setLayoutData(gd3);
        text2.setText("Cai nay no chiem nua hang do  g6.horizontalSpan = 2");
        		
	}

	public static void main(String args[]) {
		Display display = new Display();
		
		new FormCha(display);
		display.dispose();
	}
	
}
