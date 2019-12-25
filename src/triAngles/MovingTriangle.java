package triAngles;

import java.util.Random;

public class MovingTriangle extends Triangle {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected Random r;
	protected int velocity;
	protected int state;
	
	public MovingTriangle(int gears,int difference) {
		super();
		this.setFocusable(false);
		r = new Random();
		state = -1;
		velocity = (r.nextInt(gears)+1)*difference;
	}
	
	public void move() {
	}
	
	public int getState() {
		return state;
	}

}
