package menus;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import triAngles.Triangle;

public class MainMenu extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private JPanel kozep;
	
	public MainMenu() {
		this.setLayout(new BorderLayout());
		
		//Kozepso gomb letrehozasa;
		kozep = new JPanel();
		
	    //kozep.setLayout(null);
	    //Felso haromszogek
		
		this.setBounds(100, 0, 1000, 1000);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.setVisible(true);
	}
	

}
