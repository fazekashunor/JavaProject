package labels;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.IOException;

public class SowwyLabel extends BaseLabel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public SowwyLabel(){
		super();
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
		this.setSize(600, 50);
		this.setText("<html>Sorry but you can't save Easy/Medium modes.<br><br>Good practise though.</html>");
	}

}
