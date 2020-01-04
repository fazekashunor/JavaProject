package buttons;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import menus.BaseFrame;
import menus.PopoutEnding;
import textField.NameTextField;


public class SaveAndExitButton extends BaseButton{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@SuppressWarnings("unused")
	private NameTextField name;
	@SuppressWarnings("unused")
	private PopoutEnding baseFrame;
	@SuppressWarnings("unused")
	private BaseFrame frame;
	@SuppressWarnings("unused")
	private String score;
	private BufferedWriter writer;
	
	public SaveAndExitButton(String score,NameTextField name,PopoutEnding baseFrame,BaseFrame frame) {
		super();
		
		this.name = name;
		this.baseFrame=baseFrame;
		this.frame=frame;
		this.score=score;
		
		this.setSize(200, 70);
		this.setText("Save And Exit");
		try {
			customFont = Font.createFont(Font.TRUETYPE_FONT, is).deriveFont(12f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			//register the font
			ge.registerFont(customFont);
		} catch (FontFormatException | IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		this.setFont(customFont);
		
		this.addMouseListener(new java.awt.event.MouseAdapter() {		    
		    public void mousePressed(MouseEvent e) {
		    	String tmp= new String();
		    	tmp=name.getText();
		    	if(tmp.isEmpty() || tmp.contains("-")) {
		    		
		    	}
		    	else {
		    		decideWitchFileToOpen(score);
		    		try {
		    			writer.append('\n');
		    			writer.append(tmp+"-"+score);
						writer.close();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			    	frame.dispose();
			    	baseFrame.dispose();
		    	}
		    }
		});
	}
	
	void decideWitchFileToOpen(String score) {
		if(!score.contains(":"))
			try {
				writer = new BufferedWriter(new FileWriter(".Scores/Timed.txt",true));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		else
			try {
				writer = new BufferedWriter(new FileWriter(".Scores/Survival.txt",true));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
}
