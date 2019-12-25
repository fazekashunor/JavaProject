package menus;

import javax.swing.JFrame;

import contollers.MainGameController;
import panels.GamePanel;

public class GameMenu extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private GamePanel panel;
	
	private int gears;
	private int frequency;
	private int difference;
	
	public GameMenu(int gears,int frequency, int difference) {	  
		
		this.gears=gears;
		this.frequency=frequency;
		this.difference=difference;
		
		this.panel = new GamePanel();  
		this.add(panel);
		
	    this.setResizable(false);
	    this.setName("TRIANGLE");
	    this.setTitle("TRIANGLE");
		this.setBounds(100, 0, 707, 730);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
		this.createGame();
		
	}
	
	public void createGame() {
		new MainGameController(panel.getKozepGomb(),panel,gears,frequency,difference).run();
	}
}
	

