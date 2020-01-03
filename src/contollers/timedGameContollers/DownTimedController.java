package contollers.timedGameContollers;

import javax.swing.JPanel;
import contollers.GameController;
import contollers.TimerController;
import distinctClasses.ComboCounter;
import labels.ComboCounterLabel;
import labels.PointCounterLabel;
import triAngles.MiddleTriangle;
import triAngles.setted.SettedMovingTriangleToUp;

public class DownTimedController extends TimerController {
	
	public DownTimedController(JPanel panel,MiddleTriangle middle,GameController mainC,int intervall,int difference
			,PointCounterLabel pointCounterLabel,ComboCounterLabel comboCounterLabel,ComboCounter combo) {
		super(panel,middle,mainC,intervall,pointCounterLabel,comboCounterLabel,combo);
		triangle = new SettedMovingTriangleToUp(panel,difference);
	}
	
	@Override
	protected Boolean collide() {
		if(triangle.getY() < (middle.getY()+middle.getHeight()))
			return true;
		return false;
	}

}
