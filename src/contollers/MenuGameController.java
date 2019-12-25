package contollers;

import java.util.Random;

import javax.swing.JPanel;

import contollers.gameContollers.DownGameController;
import contollers.gameContollers.LeftGameController;
import contollers.gameContollers.RightGameController;
import contollers.gameContollers.UpGameController;
import contollers.menuContollers.DownMenuController;
import contollers.menuContollers.LeftMenuController;
import contollers.menuContollers.RightMenuController;
import contollers.menuContollers.UpMenuController;
import panels.MenuPanel;

public class MenuGameController extends Thread{
	
	private Random r;
	private JPanel panel;
	
	private int gears;
	private int difference;
	
	public MenuGameController(MenuPanel panel,int gears,int difference) {
		r = new Random();
		this.difference=difference;
		this.gears=gears;
		this.panel = panel;
	}
	
	@Override
	public void run() {
		while(true){	
			switch((r.nextInt(4))) {
			case 0:
				new UpMenuController(panel,this).start();
				break;
			case 1:
				new RightMenuController(panel,this,gears,difference).start();
				break;
			case 2:
				new DownMenuController(panel,this,gears,difference).start();
				break;
			case 3:
				new LeftMenuController(panel,this,gears,difference).start();
				break;
			}
			try {
				Thread.sleep(630); // >= 100
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
