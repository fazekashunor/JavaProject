package panels;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import labels.TimerLabel;

public class SurvivalGamePanel extends GamePanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private TimerLabel timerLabel;
	
	public SurvivalGamePanel() {
		super();
		
		timerLabel = new TimerLabel();
		this.add(timerLabel);
		
		this.addComponentListener((ComponentListener) new ComponentAdapter() {
			public void componentResized(ComponentEvent e) {
				pheight = SizeH();
				pwidth = SizeW();
				kozepGomb.setLocation((pwidth / 2) - kozepGomb.getWidth() / 2,
						(pheight / 2) - kozepGomb.getHeight() / 2);
				timerLabel.setLocation(20,20);
				
			}
		});
	}
	
	public TimerLabel getTimerLabel() {
		return timerLabel;
	}

}
