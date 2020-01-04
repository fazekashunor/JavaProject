package menus;

import javax.swing.JFrame;

import panels.ScoresPanel;

public class HighScoresMenu extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ScoresPanel panel;

	public HighScoresMenu() {
		this.setResizable(false);
	    this.setName("TRIANGLE");
	    this.setTitle("TRIANGLE");
		this.setBounds(400, 0, 616, 270);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		panel = new ScoresPanel();
		this.add(panel);
		
		
		this.setVisible(true);
	}

}
