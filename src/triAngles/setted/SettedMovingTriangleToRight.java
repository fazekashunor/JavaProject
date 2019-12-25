package triAngles.setted;

import javax.swing.JPanel;

import triAngles.MovingTriangleToRight;

public class SettedMovingTriangleToRight extends MovingTriangleToRight {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public SettedMovingTriangleToRight(JPanel panel, int difference) {
		super(difference);
		panel.add(this);
		this.setLocation(-this.getWidth(),panel.getHeight()/2-this.getHeight()/2);
	}

}


