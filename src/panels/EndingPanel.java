package panels;

import java.awt.Color;

import javax.swing.JPanel;

import buttons.ResetButton;
import buttons.SaveAndExitButton;
import menus.BaseFrame;
import menus.PopoutEnding;

public class EndingPanel extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ResetButton reset;
	private SaveAndExitButton save;

	public EndingPanel(PopoutEnding baseFrame,BaseFrame frame) {
		this.setBackground(Color.WHITE);
		this.setLayout(null);
		
		reset = new ResetButton(baseFrame,frame);
		this.add(reset);
		reset.setLocation(20, 190);
		
		save = new SaveAndExitButton();
		this.add(save);
		save.setLocation(reset.getX()+reset.getWidth()+100,reset.getY());
	}

}
