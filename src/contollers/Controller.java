package contollers;

import javax.swing.JPanel;

import contollers.MainGameController;
import triAngles.MiddleTriangle;
import triAngles.MovingTriangle;

public class Controller extends Thread {
	
	protected Boolean collided;
	protected MiddleTriangle middle;
	protected JPanel panel;
	protected MainGameController mainC;
	protected MovingTriangle triangle;
	
	// volatilation
	// syncronized
	// Thread syncronization
	public Controller(JPanel panel,MiddleTriangle middle,MainGameController mainC) {
		this.panel = panel;
		this.middle = middle;
		this.mainC = mainC;
		collided = false;
	}
	
	@Override
	public void run()
	{
		while (!collided && !mainC.getStop()) {
			try {
				Thread.sleep(20);
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
