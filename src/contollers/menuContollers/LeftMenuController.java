package contollers.menuContollers;

import javax.swing.JPanel;

import contollers.Controller;
import contollers.GameController;
import triAngles.MiddleTriangle;
import triAngles.MovingTriangle;
import triAngles.random.RandomMovingTriangleToRight;

public class LeftMenuController extends Controller {
	
	public LeftMenuController(JPanel panel,MiddleTriangle middle,GameController mainC,int intervall,int difference) {
		super(panel,middle,mainC,intervall);
		triangle = new RandomMovingTriangleToRight(panel,difference);
	}
	
	@Override
	protected Boolean collide() {
		if(triangle.getX() > panel.getWidth())
			return true;
		return false;
	}
	
	@Override
	protected Boolean endState(MiddleTriangle middle, MovingTriangle triangle) {
		return false;
	}

}

