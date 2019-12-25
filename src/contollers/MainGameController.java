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
	
	
	private int gears;
	private int frequency;
	private int difference;
	
	//Getters und Setters
	public Boolean getStop() {
		return stop;
	}

	public void setStop(Boolean stop) {
		this.stop = stop;
	}
	//-------------------------------------------------

	public MainGameController(MiddleTriangle middle,GamePanel panel,int gears,int frequency,int difference) {
		this.middle = middle;
		this.panel = panel;
		stop = false;
		r = new Random();
		this.gears=gears;
		this.frequency=frequency;
		this.difference=difference;
	}
	
	public void run() {
		while(!stop){
			switch((r.nextInt(4))) {
			case 0:
				new UpGameController(panel,middle,this,gears,difference).start();
				break;
			case 1:
				new RightGameController(panel,middle,this,gears,difference).start();
				break;
			case 2:
				new DownGameController(panel,middle,this,gears,difference).start();
				break;
			case 3:
				new LeftGameController(panel,middle,this,gears,difference).start();
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
