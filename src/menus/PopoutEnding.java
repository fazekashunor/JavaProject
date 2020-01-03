package menus;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

import panels.EndingPanel;

public class PopoutEnding extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private EndingPanel panel;
	
	@SuppressWarnings("deprecation")
	public PopoutEnding(BaseFrame frame){
		frame.disable();
		this.panel = new EndingPanel(this,frame);  
		this.add(panel);
		
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
	
	

}
