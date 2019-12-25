package contollers.gameContollers;

import contollers.Controller;
import contollers.MainGameController;
import panels.GamePanel;
import triAngles.MiddleTriangle;
import triAngles.setted.SettedMovingTriangleToDown;

public class UpGameController extends Controller {
	
	public UpGameController(GamePanel panel,MiddleTriangle middle,MainGameController mainC,int gears,int difference) {
		super(panel,middle,mainC);
		triangle = new SettedMovingTriangleToDown(panel,gears,difference);
	}
	
	@Override
	protected Boolean collide() {
		if((triangle.getY()+triangle.getHeight() )> middle.getY())
			return true;
		return false;
	}

}
