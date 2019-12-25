package contollers.gameContollers;

import contollers.Controller;
import contollers.MainGameController;
import panels.GamePanel;
import triAngles.MiddleTriangle;
import triAngles.setted.SettedMovingTriangleToRight;

public class LeftGameController extends Controller {
	
	public LeftGameController(GamePanel panel,MiddleTriangle middle,MainGameController mainC) {
		super(panel,middle,mainC);
		triangle = new SettedMovingTriangleToRight(panel);
	}
	
	@Override
	protected Boolean collide() {
		if(triangle.getX() + triangle.getWidth() > middle.getX())
			return true;
		return false;
	}

}

