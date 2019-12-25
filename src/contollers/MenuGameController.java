package contollers;

import java.util.Random;

import contollers.menuContollers.DownMenuController;
import contollers.menuContollers.LeftMenuController;
import contollers.menuContollers.RightMenuController;
import contollers.menuContollers.UpMenuController;
import panels.MenuPanel;

public class MenuGameController extends GameController{
	
	public MenuGameController(MenuPanel panel,int intervall,int frequency,int difference) {
		super();
		stop = false;
		r = new Random();
		this.difference=difference;
		this.intervall=intervall;
		this.frequency=frequency;
		this.panel = panel;
	}
	
	@Override
	public void run() {
		while(true){	
			switch((r.nextInt(4))) {
			case 0:
				new UpMenuController(panel,null,this,intervall,difference).start();
				break;
			case 1:
				new RightMenuController(panel,null,this,intervall,difference).start();
				break;
			case 2:
				new DownMenuController(panel,null,this,intervall,difference).start();
				break;
			case 3:
				new LeftMenuController(panel,null,this,intervall,difference).start();
				break;
			}
			try {
				Thread.sleep(this.frequency); // >= 100
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
