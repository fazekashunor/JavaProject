package buttons;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.io.IOException;

import menus.BaseFrame;
import menus.PopoutEnding;

public class ResetButton extends BaseButton{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@SuppressWarnings("unused")
	private BaseFrame frame;
	@SuppressWarnings("unused")
	private PopoutEnding baseFrame;
	
	public ResetButton(PopoutEnding baseFrame,BaseFrame frame) {
		super();
		
		this.frame=frame;
		this.baseFrame=baseFrame;
		
		this.setText("Restart");
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
		
		this.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	setBackground(Color.GRAY);
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
				setBackground(Color.DARK_GRAY);
		    }
		    
		    @SuppressWarnings("deprecation")
			public void mousePressed(MouseEvent e) {
		    	setBackground(Color.GRAY);
		    	frame.enable();
		    	baseFrame.dispose();
		    	frame.createGame();
		    }
		});
		
		this.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@SuppressWarnings("deprecation")
			@Override
			public void keyPressed(KeyEvent e) {
			    if (e.getKeyCode()==KeyEvent.VK_ENTER){
			    	frame.enable();
			    	baseFrame.dispose();
			    	frame.createGame();
			    }

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
	}

}
