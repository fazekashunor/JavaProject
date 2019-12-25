package contollers;

import javax.swing.JPanel;

import contollers.GameController;
import triAngles.MiddleTriangle;
import triAngles.MovingTriangle;

public class Controller extends Thread {
	
	protected Boolean collided;
	protected MiddleTriangle middle;
	protected JPanel panel;
	protected GameController mainC;
	protected MovingTriangle triangle;
	
	protected int intervall;
	
	public Controller(JPanel panel,MiddleTriangle middle,GameController mainC,int intervall) {
		this.panel = panel;
		this.middle = middle;
		this.mainC = mainC;
		this.intervall=intervall;
		collided = false;
	}
	
	@Override
	public void run()
	{
		while (!collided && !mainC.getStop()) {
			try {
				Thread.sleep(intervall);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			triangle.move();
			collided = collide();
			panel.repaint();
		}
		if(endState(this.middle,this.triangle)){
			mainC.setStop(true);
		}
		panel.remove(triangle);
	}
	
	protected Boolean endState(MiddleTriangle middle, MovingTriangle triangle) {
		return middle.getState() != triangle.getState();
	}
	
	protected Boolean collide() {
		return true;
	}
}
