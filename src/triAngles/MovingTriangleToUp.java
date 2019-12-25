package triAngles;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class MovingTriangleToUp extends MovingTriangle {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public MovingTriangleToUp(int gears, int difference) {
		super(gears,difference);
		state = 2;
		try {
			img = ImageIO.read(new File("UpWard/"+(r.nextInt(10)+1)+".png"));
			this.setIcon(new ImageIcon(img.getScaledInstance(100,100, Image.SCALE_SMOOTH)));
		} catch (IOException e) {
			System.out.println("Hiba a kep olvasasnal! ");
		}
	}
	
	@Override
	public void move() {
		this.setLocation(this.getX(), this.getY()-velocity);
	}

}
