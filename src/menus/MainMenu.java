package menus;


import javax.swing.JFrame;
import contollers.MenuGameController;
import panels.MenuPanel;


public class MainMenu extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private MenuPanel panel;
	
	private int intervall;
	private int frequency;
	private int difference;
	
	public MainMenu(int intervall,int frequency, int difference) {
		
		this.intervall=intervall;
		this.frequency=frequency;
		this.difference=difference;
		
		this.panel = new MenuPanel();  
		this.add(panel);
		
	    this.setResizable(false);
	    this.setName("TRIANGLE");
	    this.setTitle("TRIANGLE");
		this.setBounds(100, 0, 707, 730);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
		this.createBackGround();
		
	}
	
	public void createBackGround() {
		new MenuGameController(panel,intervall,frequency,difference).start();
	}
	

}
