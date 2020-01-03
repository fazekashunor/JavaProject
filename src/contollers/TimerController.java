package contollers;

import java.awt.Color;

import javax.swing.JPanel;

import contollers.GameController;
import distinctClasses.ComboCounter;
import labels.ComboCounterLabel;
import labels.PointCounterLabel;
import triAngles.MiddleTriangle;
import triAngles.MovingTriangle;

public class TimerController extends Thread {
	
	protected Boolean collided;
	protected MiddleTriangle middle;
	protected JPanel panel;
	protected GameController mainC;
	protected MovingTriangle triangle;
	
	protected int intervall;
	
	protected PointCounterLabel pointCounterLabel;
	protected ComboCounterLabel comboCounterLabel;
	
	protected ComboCounter combo;
	protected int temporalValue;
	protected int temporalMultiplyer;
	
	public TimerController(JPanel panel,MiddleTriangle middle,GameController mainC,int intervall
			,PointCounterLabel pointCounterLabel,ComboCounterLabel comboCounterLabel,ComboCounter combo) {
		this.panel = panel;
		this.middle = middle;
		this.mainC = mainC;
		this.intervall=intervall;
		this.comboCounterLabel=comboCounterLabel;
		this.pointCounterLabel=pointCounterLabel;
		this.combo=combo;
		temporalMultiplyer=1;
		temporalValue=0;
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
			combo.setCombo(0);
			//mainC.setStop(true);
		}
		else {
			doSomeStuff();
			doMoreStuff();
			combo.setCombo(combo.getCombo()+1);
		}
		panel.remove(triangle);
	}
	
	protected Boolean endState(MiddleTriangle middle, MovingTriangle triangle) {
		return middle.getState() != triangle.getState();
	}
	
	protected Boolean collide() {
		return true;
	}
	
	protected void doSomeStuff() {
		temporalValue = combo.getCombo();
		if(temporalValue<5) {
				temporalMultiplyer=1;
				comboCounterLabel.setForeground(Color.GREEN);
		}
		else if(temporalValue <15) {
			temporalMultiplyer=2;
			comboCounterLabel.setForeground(Color.YELLOW);
		}
		else if(temporalValue <30) {
			temporalMultiplyer=4;
			comboCounterLabel.setForeground(Color.ORANGE);
		}
		else {
			temporalMultiplyer=8;
			comboCounterLabel.setForeground(Color.RED);
		}
		comboCounterLabel.setText(temporalMultiplyer+"X");
	}
	
	protected void doMoreStuff() {
		temporalValue = Integer.parseInt(this.pointCounterLabel.getText());
		temporalValue = temporalValue + 125*temporalMultiplyer;
		this.pointCounterLabel.setText(Integer.toString(temporalValue));
	}
}
