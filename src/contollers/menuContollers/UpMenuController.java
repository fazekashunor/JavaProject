package contollers.menuContollers;

import javax.swing.JPanel;

import contollers.Controller;
import contollers.GameController;
import triAngles.MiddleTriangle;
import triAngles.MovingTriangle;
import triAngles.random.RandomMovingTriangleToDown;

public class UpMenuController extends Controller {
	
	public UpMenuController(JPanel panel,MiddleTriangle middle,GameController menuGameController,int intervall,int difference) {
		super(panel,middle,menuGameController,intervall);
		triangle = new RandomMovingTriangleToDown(panel,difference);
	}
	
	@Override
	protected Boolean collide() {
		if((triangle.getY())> panel.getHeight())
			return true;
		return false;
	}
	
	@Override
	protected Boolean endState(MiddleTriangle middle, MovingTriangle triangle) {
		return false;
	}

}
