package labels;

import java.awt.Color;
import java.awt.Font;
import java.io.File;

import javax.swing.JLabel;

public class BaseLabel extends JLabel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected Font customFont;
	protected File is;
	
	public BaseLabel() {
		is = new File("Fonts/PressStart2P.ttf");
		this.setFont(customFont);
		this.setSize(110, 50);
		this.setBackground(Color.BLACK);
		this.setForeground(Color.BLACK);
	}

}
