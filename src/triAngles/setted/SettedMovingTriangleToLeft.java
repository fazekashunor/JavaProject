package triAngles.setted;

import panels.GamePanel;
import triAngles.MovingTriangleToLeft;

public class SettedMovingTriangleToLeft extends MovingTriangleToLeft {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public SettedMovingTriangleToLeft(GamePanel panel,int gears, int difference) {
		super(gears,difference);
		panel.add(this);
		this.setLocation(panel.getWidth(),panel.getHeight()/2-this.getHeight()/2);
	}

}


