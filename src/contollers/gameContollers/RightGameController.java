package contollers.gameContollers;

import contollers.Controller;
import contollers.MainGameController;
import panels.GamePanel;
import triAngles.MiddleTriangle;
import triAngles.setted.SettedMovingTriangleToLeft;

public class RightGameController extends Controller {
	
	public RightGameController(GamePanel panel,MiddleTriangle middle,MainGameController mainC,int gears,int difference) {
		super(panel,middle,mainC);
		triangle = new SettedMovingTriangleToLeft(panel,gears,difference);
	}
	
	@Override
	protected Boolean collide() {
		if(triangle.getX() <  middle.getX()+middle.getWidth())
			return true;
		return false;
	}

}