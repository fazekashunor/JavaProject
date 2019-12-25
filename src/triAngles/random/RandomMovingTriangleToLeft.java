package triAngles.random;

import javax.swing.JPanel;
import triAngles.MovingTriangleToLeft;

public class RandomMovingTriangleToLeft extends MovingTriangleToLeft {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public RandomMovingTriangleToLeft(JPanel panel) {
		super();
		panel.add(this);
		this.setLocation(panel.getWidth(),r.nextInt(panel.getHeight()-this.getHeight()));
	}

}


