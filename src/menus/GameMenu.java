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
    int pheight;
    int pwidth;
	
	public GameMenu() {	
		panel = new GamePanel();   
	    this.setResizable(false);
	    this.setName("TRIANGLE");
	    this.setTitle("TRIANGLE");
		this.setBounds(100, 0, 707, 730);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.add(panel);			
		this.setVisible(true);
		
		new MainGameController(panel.getKozepGomb(),panel).run();
		
	}
}
	

