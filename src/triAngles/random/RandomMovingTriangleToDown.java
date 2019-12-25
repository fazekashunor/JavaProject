package triAngles.random;

import javax.swing.JPanel;

import triAngles.MovingTriangleToDown;

public class RandomMovingTriangleToDown extends MovingTriangleToDown {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public RandomMovingTriangleToDown(JPanel panel, int difference) {
		super(difference);
		panel.add(this);
		this.setLocation(r.nextInt(panel.getWidth()-this.getWidth()),-this.getHeight());
	}
}

