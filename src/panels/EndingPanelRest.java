package panels;

import java.awt.Color;

import javax.swing.JPanel;

import buttons.ResetButton;
import labels.SowwyLabel;
import menus.BaseFrame;
import menus.PopoutEnding;

public class EndingPanelRest extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ResetButton reset;
	private SowwyLabel label;

	public EndingPanelRest(PopoutEnding baseFrame,BaseFrame frame) {
		this.setBackground(Color.WHITE);
		this.setLayout(null);
		
		reset = new ResetButton(baseFrame,frame);
		this.add(reset);
		reset.setLocation(180, 190);
		
		label = new SowwyLabel();
		this.add(label);
		label.setLocation(10,90);
	}

}
