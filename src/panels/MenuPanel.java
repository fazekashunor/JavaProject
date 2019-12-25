package panels;

import java.awt.Color;

import javax.swing.JPanel;

import buttons.DifficultyButton;
import buttons.GameModeButton;
import buttons.ScoreButton;
import buttons.StartButton;

public class MenuPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private StartButton start;
	private DifficultyButton difficulty;
	private GameModeButton gameMode;
	private ScoreButton score;
	
	
	public MenuPanel() {
		this.setBackground(Color.WHITE);
		this.setLayout(null);
		
		// START GOMB
		start = new StartButton();	
		this.add(start);
		start.setLocation(30, 40);
		

		// DIFFICULTY GOMB
		difficulty = new DifficultyButton();	
		this.add(difficulty);
		difficulty.setLocation(30, start.getHeight()+start.getY()+60);
		

		// GAMEMODE GOMB
		gameMode = new GameModeButton();	
		this.add(gameMode);
		gameMode.setLocation(30, difficulty.getHeight()+difficulty.getY()+60);
		

		// SCORE GOMB
		score = new ScoreButton();	
		this.add(score);
		score.setLocation(30, gameMode.getHeight()+gameMode.getY()+60);
	}
	

}
