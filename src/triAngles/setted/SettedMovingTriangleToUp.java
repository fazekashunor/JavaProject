package triAngles.setted;

import javax.swing.JPanel;

import triAngles.MovingTriangleToUp;

public class SettedMovingTriangleToUp extends MovingTriangleToUp {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public SettedMovingTriangleToUp(JPanel panel,int difference) {
		super(difference);
		panel.add(this);
		this.setLocation(panel.getWidth()/2-this.getWidth()/2,panel.getHeight());
	}

}
