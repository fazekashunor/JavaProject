package buttons;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.event.MouseEvent;
import java.io.IOException;

public class MediumButton extends BaseSideButton{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private StartButton start;
	
	public MediumButton(StartButton start) {
		super();
		this.start=start;
		try {
			customFont = Font.createFont(Font.TRUETYPE_FONT, is).deriveFont(11f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			//register the font
			ge.registerFont(customFont);
		} catch (FontFormatException | IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		this.setFont(customFont);
		this.setForeground(Color.ORANGE);
		this.setText("Medium");
		
		this.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	setBackground(Color.ORANGE);
		    	
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
				setBackground(Color.DARK_GRAY);
		    }
		    
		    public void mousePressed(MouseEvent e) {
		    	setBackground(Color.ORANGE);
		    	getStartButton().setForeground(Color.ORANGE);
		    	//-- Setting Difficulty
		    	getStartButton().setIntervall(20);
		    	getStartButton().setFrequency(630);
		    	getStartButton().setVelocity(3);
		    }
		});
	}
	
	
	private StartButton getStartButton() {
		return this.start;
	}

}
