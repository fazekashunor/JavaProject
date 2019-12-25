package contollers.gameContollers;

import javax.swing.JPanel;

import contollers.Controller;
import contollers.MainGameController;
import triAngles.MiddleTriangle;
import triAngles.setted.SettedMovingTriangleToLeft;

public class RightGameController extends Controller {
	
	public RightGameController(JPanel panel,MiddleTriangle middle,MainGameController mainC,int intervall,int difference) {
		super(panel,middle,mainC,intervall);
		triangle = new SettedMovingTriangleToLeft(panel,difference);
	}
	
	@Override
	protected Boolean collide() {
		if(triangle.getX() <  middle.getX()+middle.getWidth())
			return true;
		return false;
	}

}