package contollers.menuContollers;

import contollers.Controller;
import contollers.MainGameController;
import panels.GamePanel;
import triAngles.random.RandomMovingTriangleToUp;

public class DownMenuController extends Controller {
	
	public DownMenuController(GamePanel panel,MainGameController mainC) {
		super(panel,null,mainC);
		triangle = new RandomMovingTriangleToUp(panel);
	}
	
	@Override
	protected Boolean collide() {
		if(triangle.getY() < 0)
			return true;
		return false;
	}

}
