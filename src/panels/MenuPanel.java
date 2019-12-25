package panels;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import buttons.DifficultyButton;
import buttons.EasyButton;
import buttons.GameModeButton;
import buttons.HardButton;
import buttons.MediumButton;
import buttons.ScoreButton;
import buttons.StartButton;
import buttons.SurvivalButton;
import buttons.TimedButton;

public class MenuPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private StartButton start;
	private DifficultyButton difficulty;
	private GameModeButton gameMode;
	private ScoreButton score;
	
	private HardButton hard;
	private MediumButton medium;
	private EasyButton easy;
	
	private SurvivalButton survival;
	private TimedButton timed;
	
	
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
		
		createDifficulties();
		
		// GAMEMODE GOMB
		gameMode = new GameModeButton();	
		this.add(gameMode);
		gameMode.setLocation(30, difficulty.getHeight()+difficulty.getY()+60);
		
		createGameModes();
		

		// SCORE GOMB
		score = new ScoreButton();	
		this.add(score);
		score.setLocation(30, gameMode.getHeight()+gameMode.getY()+60);
		
		difficulty.link(easy, medium, hard,start,timed,survival,this);
		gameMode.link(easy, medium, hard,start,timed,survival,this);
	}
	
	//--------------------------------------------------------------------- Creating Side button For Difficulties
	private void createDifficulties() {
		easy = new EasyButton(start);
		this.add(easy);
		easy.setLocation(difficulty.getX()+difficulty.getWidth()+60, difficulty.getY()-easy.getHeight());
		
		medium = new MediumButton(start);
		this.add(medium);
		medium.setLocation(easy.getX(), easy.getY()+easy.getHeight()+10);
		
		hard = new HardButton(start);
		this.add(hard);
		hard.setLocation(medium.getX(), medium.getY()+medium.getHeight()+10);
		}
	
	private void createGameModes() {
		survival = new SurvivalButton();
		this.add(survival);
		survival.setLocation(gameMode.getX()+gameMode.getWidth()+60, gameMode.getY()-survival.getHeight()+20);
		
		timed = new TimedButton();
		this.add(timed);
		timed.setLocation(survival.getX(), survival.getY()+survival.getHeight()+20);
	}
	//---------------------------------------------------------------------
	
	public void paint(Graphics g){
		   super.paint(g);
		   g.drawLine(0, 0, 100, 100);
		   g.clearRect(0, 0, 1000,1000);
		   super.paint(g);
		}
	

}
