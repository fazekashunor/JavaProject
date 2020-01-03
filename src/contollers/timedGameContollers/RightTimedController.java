package contollers.timedGameContollers;

import javax.swing.JPanel;

import contollers.GameController;
import contollers.TimerController;
import distinctClasses.ComboCounter;
import labels.ComboCounterLabel;
import labels.PointCounterLabel;
import triAngles.MiddleTriangle;
import triAngles.setted.SettedMovingTriangleToLeft;

public class RightTimedController extends TimerController {
	
	public RightTimedController(JPanel panel,MiddleTriangle middle,GameController mainC,int intervall,int difference
			,PointCounterLabel pointCounterLabel,ComboCounterLabel comboCounterLabel,ComboCounter combo) {
		super(panel,middle,mainC,intervall,pointCounterLabel,comboCounterLabel,combo);
		triangle = new SettedMovingTriangleToLeft(panel,difference);
	}
	
	@Override
	protected Boolean collide() {
		if(triangle.getX() <  middle.getX()+middle.getWidth())
			return true;
		return false;
	}

}