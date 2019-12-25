package triAngles.random;

import javax.swing.JPanel;
import triAngles.MovingTriangleToUp;

public class RandomMovingTriangleToUp extends MovingTriangleToUp {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public RandomMovingTriangleToUp(JPanel panel, int difference) {
		super(difference);
		panel.add(this);
		this.setLocation(r.nextInt(panel.getWidth()-this.getWidth()),panel.getHeight());
	}
}
