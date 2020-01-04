package buttons;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.event.MouseEvent;
import java.io.IOException;

import labels.ScoresLabel;

public class SwitchButton extends BaseButton{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@SuppressWarnings("unused")
	private ScoresLabel thirdTimed;
	@SuppressWarnings("unused")
	private ScoresLabel secondTimed;
	@SuppressWarnings("unused")
	private ScoresLabel firstTimed;
	
	@SuppressWarnings("unused")
	private ScoresLabel thirdSurvival;
	@SuppressWarnings("unused")
	private ScoresLabel secondSurvival;
	@SuppressWarnings("unused")
	private ScoresLabel firstSurvival;
	
	public SwitchButton(ScoresLabel thirdTimed, ScoresLabel secondTimed, ScoresLabel firstTimed,	
					    ScoresLabel thirdSurvival, ScoresLabel secondSurvival, ScoresLabel firstSurvival){
		super();
		this.thirdTimed=thirdTimed;
		this.secondTimed=secondTimed;
		this.firstTimed=firstTimed;
		
		this.thirdSurvival=thirdSurvival;
		this.secondSurvival=secondSurvival;
		this.firstSurvival=firstSurvival;
		try {
			customFont = Font.createFont(Font.TRUETYPE_FONT, is).deriveFont(19f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			//register the font
			ge.registerFont(customFont);
		} catch (FontFormatException | IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		this.setForeground(Color.MAGENTA);
		this.setFont(customFont);
		this.setText("Switch");
		
		this.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	setBackground(Color.GRAY);
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	setBackground(Color.DARK_GRAY);
		    }
		    
		    public void mousePressed(MouseEvent e) {
		    	setBackground(Color.GRAY);
		    	//TIMED
		    	thirdTimed.setVisible(!thirdTimed.isVisible());
		    	secondTimed.setVisible(!secondTimed.isVisible());
		    	firstTimed.setVisible(!firstTimed.isVisible());
		    	//SURVIVAL
		    	thirdSurvival.setVisible(!thirdSurvival.isVisible());
		    	secondSurvival.setVisible(!secondSurvival.isVisible());
		    	firstSurvival.setVisible(!firstSurvival.isVisible());
		    	if(firstSurvival.isVisible())
		    		setForeground(Color.CYAN);
		    	else
		    		setForeground(Color.MAGENTA);
		    }
		    
		    public void mouseReleased(MouseEvent e) {
		    	setBackground(Color.DARK_GRAY);
		    }
		});
		
	}

}
