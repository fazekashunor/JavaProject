package triAngles.setted;

import panels.GamePanel;
import triAngles.MovingTriangleToUp;

public class SettedMovingTriangleToUp extends MovingTriangleToUp {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public SettedMovingTriangleToUp(GamePanel panel,int gears, int difference) {
		super(gears,difference);
		panel.add(this);
		this.setLocation(panel.getWidth()/2-this.getWidth()/2,panel.getHeight());
	}

}
