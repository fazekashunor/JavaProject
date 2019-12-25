package contollers.gameContollers;

import javax.swing.JPanel;

import contollers.Controller;
import contollers.MainGameController;
import triAngles.MiddleTriangle;
import triAngles.setted.SettedMovingTriangleToRight;

public class LeftGameController extends Controller {
	
	public LeftGameController(JPanel panel,MiddleTriangle middle,MainGameController mainC,int intervall,int difference) {
		super(panel,middle,mainC,intervall);
		triangle = new SettedMovingTriangleToRight(panel,difference);
	}
	
	@Override
	protected Boolean collide() {
		if(triangle.getX() + triangle.getWidth() > middle.getX())
			return true;
		return false;
	}

}

