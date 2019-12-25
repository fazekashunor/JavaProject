package triAngles.setted;

import javax.swing.JPanel;

import triAngles.MovingTriangleToDown;

public class SettedMovingTriangleToDown extends MovingTriangleToDown {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public SettedMovingTriangleToDown(JPanel panel, int difference) {
		super(difference);
		panel.add(this);
		this.setLocation(panel.getWidth()/2-this.getWidth()/2,-this.getHeight());
	}
}

