package triAngles.setted;

import panels.GamePanel;
import triAngles.MovingTriangleToRight;

public class SettedMovingTriangleToRight extends MovingTriangleToRight {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public SettedMovingTriangleToRight(GamePanel panel,int gears, int difference) {
		super(gears,difference);
		panel.add(this);
		this.setLocation(-this.getWidth(),panel.getHeight()/2-this.getHeight()/2);
	}

}


