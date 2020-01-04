package textField;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;

import javax.swing.JTextField;

public class NameTextField extends JTextField{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Font customFont;
	private File is;
	
	public NameTextField() {
		is = new File("Fonts/PressStart2P.ttf");
		try {
			customFont = Font.createFont(Font.TRUETYPE_FONT, is).deriveFont(20f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			//register the font
			ge.registerFont(customFont);
		} catch (FontFormatException | IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		this.setFont(customFont);
		this.setSize(250,50);
		this.setAlignmentY(CENTER);
		this.setAlignmentX(CENTER);
	}

}
