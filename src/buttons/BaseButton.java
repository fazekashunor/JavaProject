package buttons;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
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
		this.setFont(customFont);
		this.setSize(150, 70);
		this.setFocusPainted(false);
		this.setForeground(Color.GREEN);
		this.setBackground(Color.DARK_GRAY);
		//this.set
		
		
		this.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	setBackground(Color.GRAY);
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
				setBackground(Color.DARK_GRAY);
		    }
		    
		    public void mousePressed(MouseEvent e) {
		    	setBackground(Color.GRAY);
		    }
		});
		
	}

}
