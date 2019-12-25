package buttons;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.event.MouseEvent;
import java.io.IOException;

import menus.GameMenu;

public class StartButton  extends BaseButton{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int intervall;
	private int velocity;
	private int frequency;
	
	private String mode;

	public StartButton() {
		super();
		mode = new String();
		//Medium
		intervall=20;
		velocity=3;
		frequency=630;
		//Survival
		mode = "Survival";
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
		this.setForeground(Color.ORANGE);
		this.setText("Start");
		
		this.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	setBackground(Color.GRAY);
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
				setBackground(Color.DARK_GRAY);
		    }
		    
		    public void mousePressed(MouseEvent e) {
		    	setBackground(Color.GRAY);
		    	//new GameMenu(intervall,frequency,velocity);
		    	
		    }
		});
	}
	
	public void setIntervall(int intervall) {
		this.intervall = intervall;
	}

	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}
	
	public void setMode(String szveg) {
		this.mode = szveg;
	}
	
	

}
