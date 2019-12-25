package buttons;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.event.MouseEvent;
import java.io.IOException;

public class HardButton extends BaseSideButton{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private StartButton start;
	
	public HardButton(StartButton start) {
		super();
		this.start=start;
		this.setText("Hard");
		try {
			customFont = Font.createFont(Font.TRUETYPE_FONT, is).deriveFont(16f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			//register the font
			ge.registerFont(customFont);
		} catch (FontFormatException | IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		this.setFont(customFont);
		this.setForeground(Color.RED);
		
		this.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	setBackground(Color.RED);
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
				setBackground(Color.DARK_GRAY);
		    }
		    
		    public void mousePressed(MouseEvent e) {
		    	setBackground(Color.RED);
		    	getStartButton().setForeground(Color.RED);
		    }
		});
	}
	
	private StartButton getStartButton() {
		return this.start;
	}

}
