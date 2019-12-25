package buttons;

import java.awt.Color;
import java.awt.Font;
import java.io.File;

import javax.swing.JButton;


public class BaseButton extends JButton{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected Font customFont;
	protected File is;
	
	
	public BaseButton() {
		
		//create the font to use. Specify the size!
		is = new File("Fonts/PressStart2P.ttf");
		//use the font
		this.setSize(150, 70);
		this.setFocusPainted(false);
		this.setForeground(Color.LIGHT_GRAY);
		this.setBackground(Color.DARK_GRAY);
		
		
	}

}
