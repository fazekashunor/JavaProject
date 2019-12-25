package triAngles.setted;

import panels.GamePanel;
import triAngles.MovingTriangleToDown;

public class SettedMovingTriangleToDown extends MovingTriangleToDown {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public SettedMovingTriangleToDown(GamePanel panel,int gears, int difference) {
		super(gears,difference);
		panel.add(this);
		this.setLocation(panel.getWidth()/2-this.getWidth()/2,-this.getHeight());
	}
}

