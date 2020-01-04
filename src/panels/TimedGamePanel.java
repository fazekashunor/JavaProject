package panels;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import labels.ComboCounterLabel;
import labels.PointCounterLabel;
import labels.TimerLabel;

public class TimedGamePanel extends GamePanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private PointCounterLabel pointsLabel;
	private TimerLabel timerLabel;
	private ComboCounterLabel comboCounterLabel;
	
	public TimedGamePanel() {
		super();
		pointsLabel =new PointCounterLabel();
		this.add(pointsLabel);
		//pointsLabel.setLocation(this.getWidth()-pointsLabel.getWidth(),0);
		
		timerLabel = new TimerLabel();
		this.add(timerLabel);
		//timerLabel.setLocation(0,0);
		
		comboCounterLabel =new ComboCounterLabel();
		this.add(comboCounterLabel);
		//comboCounterLabel.setLocation(this.getWidth()-comboCounterLabel.getWidth(),this.getHeight()-comboCounterLabel.getHeight());
		
		this.addComponentListener((ComponentListener) new ComponentAdapter() {
			public void componentResized(ComponentEvent e) {
				pheight = SizeH();
				pwidth = SizeW();
				kozepGomb.setLocation((pwidth / 2) - kozepGomb.getWidth() / 2,
						(pheight / 2) - kozepGomb.getHeight() / 2);
				pointsLabel.setLocation(pwidth-pointsLabel.getWidth(),20);
				timerLabel.setLocation(20,20);
				comboCounterLabel.setLocation(pwidth-comboCounterLabel.getWidth(),pheight-comboCounterLabel.getHeight());
				
			}
		});
	}
	
	public TimerLabel getTimerLabel() {
		return timerLabel;
	}
	
	public PointCounterLabel getPointCounterLabel() {
		return pointsLabel;
	}
	
	public ComboCounterLabel getComboCounterLabel() {
		return comboCounterLabel;
	}

}
