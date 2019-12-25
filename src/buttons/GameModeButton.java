package buttons;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.event.MouseEvent;
import java.io.IOException;

import panels.MenuPanel;

public class GameModeButton  extends BaseButton{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private HardButton hard;
	private MediumButton medium;
	private EasyButton easy;
	
	private StartButton start;
	
	private TimedButton timed;
	private SurvivalButton survival;
	
	private MenuPanel panel;
	
	public GameModeButton() {
		super();
		try {
			customFont = Font.createFont(Font.TRUETYPE_FONT, is).deriveFont(14f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			//register the font
			ge.registerFont(customFont);
		} catch (FontFormatException | IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		this.setFont(customFont);
		this.setText("GameMode");
		
		this.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	setBackground(Color.GRAY);
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
				setBackground(Color.DARK_GRAY);
		    }
		    
		    public void mousePressed(MouseEvent e) {
		    	setBackground(Color.GRAY);
		    	switchShow();
		    	disableDifficulties();
		    }
		});
	}
	
	public void link(EasyButton easy,MediumButton medium,HardButton hard,StartButton start,
			TimedButton timed, SurvivalButton survival,MenuPanel panel) {
		this.easy=easy;
		this.medium=medium;
		this.hard=hard;
		this.start=start;
		this.timed=timed;
		this.survival=survival;
		this.panel=panel;
	}
	
	private void switchShow(){
		survival.setVisible(!survival.isVisible());
		timed.setVisible(!timed.isVisible());
	}
	
	private void disableDifficulties() {
		easy.setVisible(false);
		medium.setVisible(false);
		hard.setVisible(false);
	}

}
