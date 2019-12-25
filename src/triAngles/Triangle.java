package triAngles;

import javax.swing.JButton;
import java.awt.image.BufferedImage;

public class Triangle extends JButton{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected BufferedImage img=null;
	
	public Triangle(){
		
		setSize(100,100);
		//--Default_Gomb_Letrehozasa
		this.setBorderPainted(false);
		this.setFocusPainted(false);
		this.setContentAreaFilled(false);
	}

}
