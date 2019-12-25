package triAngles.random;

import javax.swing.JPanel;
import triAngles.MovingTriangleToRight;

public class RandomMovingTriangleToRight extends MovingTriangleToRight {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public RandomMovingTriangleToRight(JPanel panel, int difference) {
		super(difference);
		panel.add(this);
		this.setLocation(-this.getWidth(),r.nextInt(panel.getHeight()-this.getHeight()));
	}

}


