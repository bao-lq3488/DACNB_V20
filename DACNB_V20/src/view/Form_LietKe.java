package view;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

import model.ConnectionJDBC;
import model.SinhVien;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;

public class Form_LietKe {

	Shell shell;
	public SinhVien sinhVien = new SinhVien();

	public Form_LietKe(Shell mainShell) throws SQLException {

		shell = new Shell(mainShell, SWT.APPLICATION_MODAL | SWT.CLOSE);

		createUI(shell);

		shell.open();
	}

	private void createUI(Composite composite) throws SQLException {

		// shell.setSize(300, 180);
		// shell.setText("Liet Ke");
		// shell.setLocation(10, 10);
		//
		// Label lblTenMH = new Label(shell, SWT.CENTER | SWT.BORDER);
		// lblTenMH.setText("Ten Mon Hoc");
		// lblTenMH.setSize(85, 20);
		// lblTenMH.setLocation(5, 10);
		//
		// Label lblKeDoc1 = new Label(shell, SWT.SEPARATOR | SWT.VERTICAL);
		// lblKeDoc1.setLocation(90, 0);
		// lblKeDoc1.setSize(30, 200);
		//
		// Label lblKiHieu = new Label(shell, SWT.CENTER | SWT.BORDER);
		// lblKiHieu.setText("Ki Hieu");
		// lblKiHieu.setSize(45, 20);
		// lblKiHieu.setLocation(120, 10);
		//
		// Label lblKeDoc2 = new Label(shell, SWT.SEPARATOR | SWT.VERTICAL);
		// lblKeDoc2.setLocation(160, 0);
		// lblKeDoc2.setSize(30, 200);
		//
		// Label lblTC = new Label(shell, SWT.CENTER | SWT.BORDER);
		// lblTC.setText("So Tin Chi");
		// lblTC.setSize(70, 20);
		// lblTC.setLocation(190, 10);
		//
		// Label lblKeNgang = new Label(shell, SWT.SEPARATOR | SWT.HORIZONTAL
		// | SWT.SHADOW_OUT);
		// lblKeNgang.setLocation(0, 20);
		// lblKeNgang.setSize(300, 30);
		//composite.setLayout(new FillLayout());
		final Table table = new Table(shell , SWT.BORDER);

		shell.setText("A Table Shell Example");
		shell.setLayout(new FillLayout());

		table.setHeaderVisible(true);
		table.setLinesVisible(true);

		TableColumn[] column = new TableColumn[8];
		column[0] = new TableColumn(table, SWT.NONE);
		column[0].setText("Ma Sinh Vien");

		column[1] = new TableColumn(table, SWT.NONE);
		column[1].setText("Ten Sinh Vien");

		column[2] = new TableColumn(table, SWT.NONE);
		column[2].setText("Ngay Sinh");
		
		column[3] = new TableColumn(table, SWT.NONE);
		column[3].setText("Dia Chi");
		
		column[4] = new TableColumn(table, SWT.NONE);
		column[4].setText("Status");
		
		column[5] = new TableColumn(table, SWT.NONE);
		column[5].setText("ID LOP");
		
		column[6] = new TableColumn(table, SWT.NONE);
		column[6].setText("Nam nhap hoc");
		
		column[7] = new TableColumn(table, SWT.NONE);
		column[7].setText("Nam ket thuc");

		fillTable(table);
		for (int i = 0, n = column.length; i < n; i++) {
			column[i].pack();
		}
		shell.pack();
	}

	private void fillTable(Table table) throws SQLException {
		table.setRedraw(false);
		
		
		for(Iterator<SinhVien> iterator = sinhVien.getAllSinhvien().iterator();iterator.hasNext();)
		{		
			sinhVien = (SinhVien) iterator.next();
			TableItem item = new TableItem(table, SWT.NONE);
			int c = 0;
			item.setText(c++, sinhVien.getIDSINHVIEN());
			item.setText(c++, sinhVien.getTENSinhVien());
			item.setText(c++, sinhVien.getNGAYSINH());
			item.setText(c++, sinhVien.getDIACHI());
			item.setText(c++, sinhVien.getStatus());
			item.setText(c++, sinhVien.getIdLOP());
			item.setText(c++, sinhVien.getDatejoin());
			item.setText(c++, sinhVien.getDateend());
		}
		
		table.setRedraw(true);
	}
}
