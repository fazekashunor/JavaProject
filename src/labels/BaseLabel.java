package labels;

import java.awt.Color;

import javax.swing.JLabel;

public class BaseLabel extends JLabel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public BaseLabel() {
		this.setSize(100, 50);
		this.setBackground(Color.BLACK);
		this.setForeground(Color.BLACK);
	}

}
