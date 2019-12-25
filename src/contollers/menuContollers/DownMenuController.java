package contollers.menuContollers;

import javax.swing.JPanel;

import contollers.Controller;
import contollers.GameController;
import triAngles.MiddleTriangle;
import triAngles.MovingTriangle;
import triAngles.random.RandomMovingTriangleToUp;

public class DownMenuController extends Controller {
	
	public DownMenuController(JPanel panel,MiddleTriangle middle,GameController mainC,int intervall,int difference) {
		super(panel,middle,mainC,intervall);
		triangle = new RandomMovingTriangleToUp(panel,difference);
	}
	
	@Override
	protected Boolean collide() {
		if(triangle.getY() < 0 - triangle.getHeight())
			return true;
		return false;
	}
	
	@Override
	protected Boolean endState(MiddleTriangle middle, MovingTriangle triangle) {
		return false;
	}

}
