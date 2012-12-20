package view;



import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;

public class SimpleTableExample {
	private java.util.List players;

	  public SimpleTableExample() {
	  players = new ArrayList<Player>();
	  players.add(new Player("Roger Federer", "Switzerland", 1));
	  players.add(new Player("Rafael Nadal", "Spain", 2));
	  players.add(new Player("Andy Roddick", "USA", 3));
	  players.add(new Player("Lleyton Hewitt", "Australia", 4));
	  players.add(new Player("Nikolay Davydenko", "Russia", 5));
	  players.add(new Player("David Nalbandian", "ARG", 6));
	  players.add(new Player("Andre Agassi", "USA", 7));
	  players.add(new Player("Guillermo Coria", "ARG", 8));
	  }

	  public void run() {
	  Display display = new Display();
	  Shell shell = new Shell(display);
	  shell.setText("Tennis players");
	  createContents(shell);
	  shell.pack();
	  shell.open();
	  while (!shell.isDisposed()) {
	  if (!display.readAndDispatch()) {
	  display.sleep();
	  }
	  }
	  display.dispose();
	  }
	  private void createContents(Composite composite) {
	  composite.setLayout(new FillLayout());
	  final Table table = new Table(composite, SWT.NONE);
	  table.setHeaderVisible(true);
	  table.setLinesVisible(true);
	  TableColumn[] column = new TableColumn[3];
	  column[0] = new TableColumn(table, SWT.NONE);
	  column[0].setText("Name");
	  
	  column[1] = new TableColumn(table, SWT.NONE);
	  column[1].setText("Country");
	  
	  column[2] = new TableColumn(table, SWT.RIGHT);
	  column[2].setText("Ranking");
	  
	  fillTable(table);
	  for (int i = 0, n = column.length; i < n; i++) {
	  column[i].pack();
	  }
	  }
	  private void fillTable(Table table) {
	  table.setRedraw(false);
	 
	  for(Iterator<Player> iterator = players.iterator();iterator.hasNext();){
	  Player player = iterator.next();
	  TableItem item = new TableItem(table, SWT.NONE);
	  int c = 0;
	  item.setText(c++, player.getName());
	  item.setText(c++, player.getCountry());
	  item.setText(c++, String.valueOf(player.getRanking()));
	  }
	  table.setRedraw(true);
	  }
	  public static void main(String[] args) {
	  new SimpleTableExample().run();
	  }
	}
	 class Player {
	  private String name;
	  private String country;
	  private int ranking;

	  public Player(String name, String country, int ranking) {
	  this.name = name;
	  this.country = country;
	  this.ranking = ranking;
	  }
	  public int getRanking() {
	  return ranking;
	  }
	  public String getName() {
	  return name;
	  }
	  public String getCountry() {
	  return country;
	  }
	

}
