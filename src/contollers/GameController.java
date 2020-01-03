package contollers;

import java.util.Random;

import javax.swing.JPanel;

import menus.BaseFrame;
import triAngles.MiddleTriangle;

public class GameController extends Thread{
	
	protected Boolean stop;
	protected MiddleTriangle middle;
	protected JPanel panel;
	protected Random r;
	protected BaseFrame frame;
	
	
	protected int intervall;
	protected int frequency;
	protected int difference;
	
	public  GameController(JPanel panel,int intervall,int frequency,int difference) {
		this.intervall=intervall;
		this.frequency=frequency;
		this.difference=difference;	
		this.panel = panel;
		stop = false;	
	}
	
	//Getters und Setters
	public Boolean getStop() {
		return stop;
	}

	public void setStop(Boolean stop) {
		this.stop = stop;
	}

}
