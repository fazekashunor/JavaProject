package menus;

import contollers.MainGameController;
import panels.SurvivalGamePanel;

public class SurvivalGameMenu extends BaseFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private SurvivalGamePanel panel;
	
	public SurvivalGameMenu(int intervall,int frequency, int difference) {	  
		super(intervall,frequency,difference);
		
		this.panel = new SurvivalGamePanel();  
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
		new MainGameController(panel.getKozepGomb(),panel,intervall,frequency,difference,this,panel.getTimerLabel()).start();
	}
}
	

