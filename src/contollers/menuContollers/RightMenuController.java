package contollers.menuContollers;

import contollers.Controller;
import contollers.MainGameController;
import panels.GamePanel;
import triAngles.random.RandomMovingTriangleToLeft;

public class RightMenuController extends Controller {
	
	public RightMenuController(GamePanel panel,MainGameController mainC) {
		super(panel,null,mainC);
		triangle = new RandomMovingTriangleToLeft(panel);
	}
	
	@Override
	protected Boolean collide() {
		if(triangle.getX() <  0)
			return true;
		return false;
	}

}