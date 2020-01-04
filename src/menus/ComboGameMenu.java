package menus;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import contollers.TimedGameController;
import panels.TimedGamePanel;

public class ComboGameMenu extends BaseFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private TimedGamePanel panel;
	private TimedGameController controller;
	
	public ComboGameMenu(int intervall,int frequency, int difference){
		super(intervall,frequency,difference);
		this.panel = new TimedGamePanel();  
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
		controller = new TimedGameController(panel.getKozepGomb(),panel,intervall,frequency,difference,this,panel.getTimerLabel(),
				panel.getPointCounterLabel(),panel.getComboCounterLabel());
		controller.start();
	}

}
