package contollers.gameContollers;

import javax.swing.JPanel;

import contollers.Controller;
import contollers.GameController;
import triAngles.MiddleTriangle;
import triAngles.setted.SettedMovingTriangleToUp;

public class DownGameController extends Controller {
	
	public DownGameController(JPanel panel,MiddleTriangle middle,GameController mainC,int intervall,int difference) {
		super(panel,middle,mainC,intervall);
		triangle = new SettedMovingTriangleToUp(panel,difference);
	}
	
	@Override
	protected Boolean collide() {
		if(triangle.getY() < (middle.getY()+middle.getHeight()))
			return true;
		return false;
	}

}
