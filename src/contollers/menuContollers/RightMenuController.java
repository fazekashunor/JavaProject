package contollers.menuContollers;

import javax.swing.JPanel;

import contollers.Controller;
import contollers.GameController;
import triAngles.MiddleTriangle;
import triAngles.MovingTriangle;
import triAngles.random.RandomMovingTriangleToLeft;

public class RightMenuController extends Controller {
	
	public RightMenuController(JPanel panel,MiddleTriangle middle,GameController mainC,int intervall,int difference) {
		super(panel,middle,mainC,intervall);
		triangle = new RandomMovingTriangleToLeft(panel,difference);
	}
	
	@Override
	protected Boolean collide() {
		if(triangle.getX() <  0 - triangle.getWidth())
			return true;
		return false;
	}
	
	@Override
	protected Boolean endState(MiddleTriangle middle, MovingTriangle triangle) {
		return false;
	}

}