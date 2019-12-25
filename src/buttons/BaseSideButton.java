package buttons;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.io.File;

import javax.swing.JButton;

public class BaseSideButton extends JButton{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected Font customFont;
	protected File is;
	
			//use the font
			public BaseSideButton() {
				
			is = new File("Fonts/PressStart2P.ttf");	
				
			this.setFont(customFont);
			this.setSize(100, 35);
			this.setFocusPainted(false);
			this.setBackground(Color.DARK_GRAY);
			
			
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
			this.setVisible(false);
		}
	}
