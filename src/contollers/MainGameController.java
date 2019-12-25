package contollers;

import java.util.Random;

import contollers.gameContollers.DownGameController;
import contollers.gameContollers.LeftGameController;
import contollers.gameContollers.RightGameController;
import contollers.gameContollers.UpGameController;
import panels.GamePanel;
import triAngles.MiddleTriangle;

// Main Controller szerepe hogy:
//		*hozzon letre uj 3-szogeket random;
// 		*ha valamelyik rosszul utkozott allitsa le az osszes thread-et;
// CHAR LAYOUT
public class MainGameController extends GameController{
	

	public MainGameController(MiddleTriangle middle,GamePanel panel,int intervall,int frequency,int difference) {
		super();
		this.middle = middle;
		this.panel = panel;
		stop = false;
		r = new Random();
		this.intervall=intervall;
		this.frequency=frequency;
		this.difference=difference;
	}
	
	@Override
	public void run() {
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
	}
}
