package contollers.gameContollers;

import contollers.Controller;
import contollers.MainGameController;
import panels.GamePanel;
import triAngles.MiddleTriangle;
import triAngles.setted.SettedMovingTriangleToUp;

public class DownGameController extends Controller {
	
	public DownGameController(GamePanel panel,MiddleTriangle middle,MainGameController mainC,int gears,int difference) {
		super(panel,middle,mainC);
		triangle = new SettedMovingTriangleToUp(panel,gears,difference);
	}
	
	@Override
	protected Boolean collide() {
		if(triangle.getY() < (middle.getY()+middle.getHeight()))
			return true;
		return false;
	}

}
