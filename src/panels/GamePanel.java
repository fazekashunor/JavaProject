package panels;

import java.awt.Color;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.JPanel;

import triAngles.MiddleTriangle;

public class GamePanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected MiddleTriangle kozepGomb;

	protected int pheight;
	protected int pwidth;

	public GamePanel() {		
		this.setBackground(Color.WHITE);
		this.setLayout(null);
		pheight = this.getSize().height;
		pwidth = this.getSize().width;

		// Kozepso haromszog letrehozasa;
		kozepGomb = new MiddleTriangle();
		this.add(kozepGomb);
		kozepGomb.setFocusable(true);
		this.addComponentListener((ComponentListener) new ComponentAdapter() {
			public void componentResized(ComponentEvent e) {
				pheight = SizeH();
				pwidth = SizeW();
				kozepGomb.setLocation((pwidth / 2) - kozepGomb.getWidth() / 2,
						(pheight / 2) - kozepGomb.getHeight() / 2);
			}
		});
	}

	protected int SizeH() {
		return this.getSize().height;
	}

	protected int SizeW() {
		return this.getSize().width;
	}
	
	public MiddleTriangle getKozepGomb() {
		return kozepGomb;
	}
}
