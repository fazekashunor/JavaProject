package triAngles;

import javax.swing.ImageIcon;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class MiddleTriangle extends Triangle{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private BufferedImage img=null;
	private int state;
	
	public int getState() {
		return state;
	}
	
	public MiddleTriangle(){
		super();	
		//this.setBorderPainted(true);
		try {
			img = ImageIO.read(new File("MiddleTri/MiddleUp.png"));
			state = 0;
			this.setIcon(new ImageIcon(img.getScaledInstance(100,100, Image.SCALE_SMOOTH)));
		} catch (IOException e) {
			System.out.println("Hiba a kep olvasasnal! ");
		}
		//-----------------------------------------------------------------
		this.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				int keyCode = e.getKeyCode();
			    switch( keyCode ) { 
			    	case KeyEvent.VK_W:
			        case KeyEvent.VK_UP:
			            // handle up 
			        	try {
			    			state = 0;
			    			img = ImageIO.read(new File("MiddleTri/MiddleUp.png"));
			    			ikonCsere(img);
			    		} catch (IOException d) {
			    			System.out.println("Hiba a kep olvasasnal! ");
			    			}
			            break;			        
			        case KeyEvent.VK_S:
			        case KeyEvent.VK_DOWN:
			        	try {
			    			state = 2;
			    			img = ImageIO.read(new File("MiddleTri/MiddleDown.png"));
			    			ikonCsere(img);
			    		} catch (IOException d) {
			    			System.out.println("Hiba a kep olvasasnal! ");
			    			}
			            break;
			        case KeyEvent.VK_A:
			        case KeyEvent.VK_LEFT:
			        	try {
			    			state = 3;
			    			img = ImageIO.read(new File("MiddleTri/MiddleLeft.png"));
			    			ikonCsere(img);
			    		} catch (IOException d) {
			    			System.out.println("Hiba a kep olvasasnal! ");
			    			}
			            break;
			        case KeyEvent.VK_D:
			        case KeyEvent.VK_RIGHT :
			        	try {
			    			state = 1;
			    			img = ImageIO.read(new File("MiddleTri/MiddleRight.png"));
			    			ikonCsere(img);
			    		} catch (IOException d) {
			    			System.out.println("Hiba a kep olvasasnal! ");
			    			}
			            break;
			     }
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub				
			}
		});
	}
	void ikonCsere(BufferedImage img) {
		this.setIcon(new ImageIcon(img.getScaledInstance(100,100, Image.SCALE_SMOOTH)));
		this.repaint();
	}

}

