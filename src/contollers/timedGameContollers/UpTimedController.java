package contollers.timedGameContollers;

import javax.swing.JPanel;

import contollers.GameController;
import contollers.TimerController;
import distinctClasses.ComboCounter;
import labels.ComboCounterLabel;
import labels.PointCounterLabel;
import triAngles.MiddleTriangle;
import triAngles.setted.SettedMovingTriangleToDown;

public class UpTimedController extends TimerController {
	
	public UpTimedController(JPanel panel,MiddleTriangle middle,GameController mainC, int intervall,int difference
			,PointCounterLabel pointCounterLabel,ComboCounterLabel comboCounterLabel,ComboCounter combo) {
		super(panel,middle,mainC,intervall,pointCounterLabel,comboCounterLabel,combo);
		triangle = new SettedMovingTriangleToDown(panel,difference);
	}
	
	@Override
	protected Boolean collide() {
		if((triangle.getY()+triangle.getHeight() )> middle.getY())
			return true;
		return false;
	}

}
