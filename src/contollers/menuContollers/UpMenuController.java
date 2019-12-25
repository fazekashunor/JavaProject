package contollers.menuContollers;

import javax.swing.JPanel;

import contollers.Controller;
import contollers.MainGameController;
import contollers.MenuGameController;
import triAngles.MiddleTriangle;
import triAngles.MovingTriangle;
import triAngles.random.RandomMovingTriangleToDown;

public class UpMenuController extends Controller {
	
	public UpMenuController(JPanel panel,MenuGameController menuGameController) {
		super(panel,null,menuGameController);
		triangle = new RandomMovingTriangleToDown(panel);
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
