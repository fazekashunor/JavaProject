package contollers;

import java.util.Random;

import contollers.gameContollers.DownGameController;
import contollers.gameContollers.LeftGameController;
import contollers.gameContollers.RightGameController;
import contollers.gameContollers.UpGameController;
import labels.TimerLabel;
import menus.BaseFrame;
import menus.PopoutEnding;
import panels.GamePanel;
import timers.TimerForward;
import triAngles.MiddleTriangle;

// Main Controller szerepe hogy:
//		*hozzon letre uj 3-szogeket random;
// 		*ha valamelyik rosszul utkozott allitsa le az osszes thread-et;
public class MainGameController extends GameController{
	
	private TimerForward timer;
	private TimerLabel timerLabel;
	
	
	public MainGameController(MiddleTriangle middle,GamePanel panel,int intervall,int frequency,int difference,BaseFrame frame,TimerLabel timerLabel) {
		super(panel,intervall,frequency,difference);
		this.middle = middle;
		r = new Random();	
		this.frame = frame;
		
		this.timerLabel=timerLabel;
		timer = new TimerForward(timerLabel);
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public void run() {
		timer.start();
		while(!stop){
			switch((r.nextInt(4))) {
			case 0:
				new UpGameController(panel,middle,this,intervall,difference).start();
				break;
			case 1:
				new RightGameController(panel,middle,this,intervall,difference).start();
				break;
			case 2:
				new DownGameController(panel,middle,this,intervall,difference).start();
				break;
			case 3:
				new LeftGameController(panel,middle,this,intervall,difference).start();
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
}
