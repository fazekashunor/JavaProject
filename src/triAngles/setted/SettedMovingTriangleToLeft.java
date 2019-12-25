package triAngles.setted;

import javax.swing.JPanel;

import triAngles.MovingTriangleToLeft;

public class SettedMovingTriangleToLeft extends MovingTriangleToLeft {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public SettedMovingTriangleToLeft(JPanel panel, int difference) {
		super(difference);
		panel.add(this);
		this.setLocation(panel.getWidth(),panel.getHeight()/2-this.getHeight()/2);
	}

}


