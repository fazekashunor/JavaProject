package contollers;

import java.util.Random;

import javax.swing.JPanel;

import triAngles.MiddleTriangle;

public class GameController extends Thread{
	
	protected Boolean stop;
	protected MiddleTriangle middle;
	protected JPanel panel;
	protected Random r;
	
	
	protected int intervall;
	protected int frequency;
	protected int difference;
	
	//Getters und Setters
	public Boolean getStop() {
		return stop;
	}

	public void setStop(Boolean stop) {
		this.stop = stop;
	}

}
