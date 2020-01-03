package contollers.timedGameContollers;

import javax.swing.JPanel;

import contollers.GameController;
import contollers.TimerController;
import distinctClasses.ComboCounter;
import labels.ComboCounterLabel;
import labels.PointCounterLabel;
import triAngles.MiddleTriangle;
import triAngles.setted.SettedMovingTriangleToRight;

public class LeftTimedController extends TimerController {
	
	public LeftTimedController(JPanel panel,MiddleTriangle middle,GameController mainC,int intervall,int difference
			,PointCounterLabel pointCounterLabel,ComboCounterLabel comboCounterLabel,ComboCounter combo) {
		super(panel,middle,mainC,intervall,pointCounterLabel,comboCounterLabel,combo);
		triangle = new SettedMovingTriangleToRight(panel,difference);
	}
	
	@Override
	protected Boolean collide() {
		if(triangle.getX() + triangle.getWidth() > middle.getX())
			return true;
		return false;
	}

}

