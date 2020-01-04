package labels;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.IOException;

import javax.swing.SwingConstants;

import distinctClasses.IntegerStringPairs;

public class ScoresLabel extends BaseLabel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ScoresLabel(IntegerStringPairs text,int place) {
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
		this.setSize(200, 100);
		this.setHorizontalAlignment(SwingConstants.CENTER);
		this.setVerticalAlignment(SwingConstants.CENTER);
		this.setText("<html><div style='text-align: center;'>"+place+"#"+"<br>"+text.getName()+"<br>"+text.getScore()+"</div></html>");
		this.setFont(customFont);
		this.setOpaque(true);
		this.setBackground(Color.DARK_GRAY);
		this.setForeground(Color.CYAN);
	}
	
}
