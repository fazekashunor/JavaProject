package contollers;

import java.util.Random;

import contollers.timedGameContollers.DownTimedController;
import contollers.timedGameContollers.LeftTimedController;
import contollers.timedGameContollers.RightTimedController;
import contollers.timedGameContollers.UpTimedController;
import distinctClasses.ComboCounter;
import labels.ComboCounterLabel;
import labels.PointCounterLabel;
import labels.TimerLabel;
import menus.BaseFrame;
import menus.PopoutEnding;
import panels.GamePanel;
import timers.TimerBackward;
import triAngles.MiddleTriangle;

public class TimedGameController extends GameController{
	
	private ComboCounter combo;
	
	private PointCounterLabel pointCounterLabel;
	private TimerLabel timerLabel;
	private ComboCounterLabel comboCounterLabel;
	
	private TimerBackward timer;
	
	public TimedGameController(MiddleTriangle middle,GamePanel panel,int intervall,int frequency,int difference,BaseFrame frame,
			TimerLabel timerLabel,PointCounterLabel pointCounterLabel,ComboCounterLabel comboCounterLabel) {
		super(panel,intervall,frequency,difference);
		this.frame = frame;
		this.middle = middle;
		
		this.pointCounterLabel=pointCounterLabel;
		this.timerLabel=timerLabel;
		this.comboCounterLabel=comboCounterLabel;
		
		timer = new TimerBackward(timerLabel,0,30,0);
		
		combo = new ComboCounter();
		
		r = new Random();
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public void run() {
		timer.start();
		while(!timerLabel.getText().contentEquals("0:0:0")){
			switch((r.nextInt(4))) {
			case 0:
				new UpTimedController(panel,middle,this,intervall,difference,pointCounterLabel,comboCounterLabel,combo).start();
				break;
			case 1:
				new RightTimedController(panel,middle,this,intervall,difference,pointCounterLabel,comboCounterLabel,combo).start();
				break;
			case 2:
				new DownTimedController(panel,middle,this,intervall,difference,pointCounterLabel,comboCounterLabel,combo).start();
				break;
			case 3:
				new LeftTimedController(panel,middle,this,intervall,difference,pointCounterLabel,comboCounterLabel,combo).start();
				break;
			}
			try {
				Thread.sleep(frequency);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		timer.stop();
		new PopoutEnding(frame);
	}
	
	public Boolean getStop() {
		return timerLabel.getText().contentEquals("0:0:0");
	}
	
}
