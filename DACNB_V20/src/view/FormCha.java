package view;


import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class FormCha {
	public Shell shell;
	public Display display;

	public FormCha(){
		
		//Lam theo form dang nay cho ro rang truoc 
		//roi button click 1,2 ngay nua Bao them vao sau
		//chu viet kieu cu roi wa
		display = new Display();
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
		display.dispose();
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
        btn.addListener(SWT.Selection, new Listener() {
			
			@Override
			public void handleEvent(Event arg0) {
				// TODO Auto-generated method stub
				new FormCon(display);
			}
		});
        
        Button btn2 = new Button(shell, SWT.PUSH);
        btn2.setText("2");
        btn2.setLayoutData(gd);
        
        Button btn3 = new Button(shell, SWT.PUSH);
        btn3.setText("3");
        btn3.setLayoutData(gd);
        
        Label lb = new Label(shell, SWT.CENTER);
        lb.setLayoutData(gd);
        lb.setText("Co the lam hung nay trong bang cach\n them label vao nhung khong settext\n hoac settext bang null ");
        
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
		new FormCha();
	}
	
}
