package labels;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.IOException;

public class YourScoreLabel extends BaseLabel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public YourScoreLabel(String score){
		super();
		this.setSize(300, 90);
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
		this.setText("<html><div style='text-align: center;'>Your Score<br>"+score+"</html>");
	}

}
