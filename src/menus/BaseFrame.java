package menus;

import javax.swing.JFrame;


public class BaseFrame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected int intervall;
	protected int frequency;
	protected int difference;
	
	public BaseFrame(int intervall,int frequency, int difference) {
		this.intervall=intervall;
		this.frequency=frequency;
		this.difference=difference;
	}
	
	public void createGame() {
	}
	
}
