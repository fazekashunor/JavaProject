package menus;

import contollers.TimedGameController;
import panels.TimedGamePanel;

public class ComboGameMenu extends BaseFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private TimedGamePanel panel;
	
	public ComboGameMenu(int intervall,int frequency, int difference){
		super(intervall,frequency,difference);
		this.panel = new TimedGamePanel();  
		this.add(panel);
		
	    this.setResizable(false);
	    this.setName("TRIANGLE");
	    this.setTitle("TRIANGLE");
		this.setBounds(100, 0, 707, 730);
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		this.setVisible(true);
		
		this.createGame();
		
	}
	
	@Override
	public void createGame() {
		new TimedGameController(panel.getKozepGomb(),panel,intervall,frequency,difference,this,panel.getTimerLabel(),
				panel.getPointCounterLabel(),panel.getComboCounterLabel()).start();
	}

}
