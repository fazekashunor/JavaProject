package panels;

import java.awt.Color;

import javax.swing.JPanel;

import buttons.ResetButton;
import buttons.SaveAndExitButton;
import labels.YourScoreLabel;
import menus.BaseFrame;
import menus.PopoutEnding;
import textField.NameTextField;

public class EndingPanelHard extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private NameTextField name;
	private ResetButton reset;
	private SaveAndExitButton save;
	private YourScoreLabel achivement;

	public EndingPanelHard(PopoutEnding baseFrame,BaseFrame frame,String score) {
		this.setBackground(Color.WHITE);
		this.setLayout(null);
		
		reset = new ResetButton(baseFrame,frame);
		this.add(reset);
		reset.setLocation(20, 190);
		
		achivement = new YourScoreLabel(score);
		this.add(achivement);
		achivement.setLocation(130,100);
		
		name = new NameTextField();
		this.add(name);
		name.setLocation(110,40);
		
		save = new SaveAndExitButton(score,name,baseFrame,frame);
		this.add(save);
		save.setLocation(reset.getX()+reset.getWidth()+100,reset.getY());
	}

}
