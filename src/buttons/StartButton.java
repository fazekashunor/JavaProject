package buttons;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.IOException;

public class StartButton  extends BaseButton{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public StartButton() {
		super();
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
		this.setText("Start");
	}

}
