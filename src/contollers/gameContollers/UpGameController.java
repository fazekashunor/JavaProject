package contollers.gameContollers;

import javax.swing.JPanel;

import contollers.Controller;
import contollers.MainGameController;
import triAngles.MiddleTriangle;
import triAngles.setted.SettedMovingTriangleToDown;

public class UpGameController extends Controller {
	
	public UpGameController(JPanel panel,MiddleTriangle middle,MainGameController mainC, int intervall,int difference) {
		super(panel,middle,mainC,intervall);
		triangle = new SettedMovingTriangleToDown(panel,difference);
	}
	
	@Override
	protected Boolean collide() {
		if((triangle.getY()+triangle.getHeight() )> middle.getY())
			return true;
		return false;
	}

}
