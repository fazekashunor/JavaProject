package menus;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

import panels.EndingPanelHard;
import panels.EndingPanelRest;

public class PopoutEnding extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private EndingPanelHard panelHard;
	private EndingPanelRest panelRest;
	
	String score;
	
	@SuppressWarnings("deprecation")
	public PopoutEnding(BaseFrame frame,String score,int velocity){
		frame.disable();
		this.score = score;
		
		decideWichPanelToOpen(frame,velocity);
		
	    this.setResizable(false);
	    this.setName("END_OF_THE_LIME");
	    this.setTitle("END_OF_THE_LIME");
		this.setBounds(100, 100, 507, 300);
		
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		
		this.addWindowListener((WindowListener) new WindowAdapter() {

		    @Override
		    public void windowClosing(WindowEvent e) {
		        dispose();
		        frame.dispose();
		    }
		});	
		this.setVisible(true);
	}
	
	private void decideWichPanelToOpen(BaseFrame frame,int velocity) {
		if(velocity==4) {
			this.panelHard = new EndingPanelHard(this,frame,score);  
			this.add(panelHard);
		}
		else {
			this.panelRest = new EndingPanelRest(this,frame);  
			this.add(panelRest);
		}
	}
	
	

}
