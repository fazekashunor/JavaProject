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
public class MainGameController {
	
	private Boolean stop;
	private MiddleTriangle middle;
	private GamePanel panel;
	private Random r;
	
	//Getters und Setters
	public Boolean getStop() {
		return stop;
	}

	public void setStop(Boolean stop) {
		this.stop = stop;
	}
	//-------------------------------------------------

	public MainGameController(MiddleTriangle middle,GamePanel panel) {
		this.middle = middle;
		this.panel = panel;
		stop = false;
		r = new Random();
	}
	
	public void run() {
		while(!stop){
			
			switch((r.nextInt(4))) {
			case 0:
				new UpGameController(panel,middle,this).start();
				break;
			case 1:
				new RightGameController(panel,middle,this).start();
				break;
			case 2:
				new DownGameController(panel,middle,this).start();
				break;
			case 3:
				new LeftGameController(panel,middle,this).start();
				break;
			}
			try {
				//Thread.sleep(630); // >= 100
				Thread.sleep(630); // >= 100
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
