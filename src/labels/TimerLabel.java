package labels;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.IOException;

public class TimerLabel extends BaseLabel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TimerLabel(){
		super();
		try {
			customFont = Font.createFont(Font.TRUETYPE_FONT, is).deriveFont(13f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			//register the font
			ge.registerFont(customFont);
		} catch (FontFormatException | IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		this.setFont(customFont);
		this.setText("0:0:0");
	}

}
