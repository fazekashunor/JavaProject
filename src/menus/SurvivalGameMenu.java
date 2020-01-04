package menus;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import contollers.MainGameController;
import panels.SurvivalGamePanel;

public class SurvivalGameMenu extends BaseFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private SurvivalGamePanel panel;
	private MainGameController controller;
	
	public SurvivalGameMenu(int intervall,int frequency, int difference) {	  
		super(intervall,frequency,difference);
		
		this.panel = new SurvivalGamePanel();  
		this.add(panel);
		
	    this.setResizable(false);
	    this.setName("TRIANGLE");
	    this.setTitle("TRIANGLE");
		this.setBounds(100, 0, 707, 730);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setVisible(true);
		
		this.createGame();
		
		this.addWindowListener((WindowListener) new WindowAdapter() {

		    @SuppressWarnings("deprecation")
			@Override
		    public void windowClosing(WindowEvent e) {
		        controller.stop();
		        dispose();
		    }
		});
		
	}
	
	@Override
	public void createGame() {
		controller = new MainGameController(panel.getKozepGomb(),panel,intervall,frequency,difference,this,panel.getTimerLabel());
		controller.start();
	}
}
	

