package panels;

import java.awt.Color;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.PriorityQueue;

import javax.swing.JPanel;

import buttons.SwitchButton;
import distinctClasses.IntegerStringPairs;
import labels.ScoresLabel;

public class ScoresPanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private BufferedReader survivalReader;
	private BufferedReader timedReader;
	
	private PriorityQueue<IntegerStringPairs> timedMaxHeap;
	private PriorityQueue<IntegerStringPairs> survivalMaxHeap;
	
	private ScoresLabel thirdTimed;
	private ScoresLabel secondTimed;
	private ScoresLabel firstTimed;
	
	private ScoresLabel thirdSurvival;
	private ScoresLabel secondSurvival;
	private ScoresLabel firstSurvival;
	
	private SwitchButton switchButton;
	
	public ScoresPanel() {
		this.setBackground(Color.lightGray);
		this.setLayout(null);
		makeQueueForTimed();
		makeQueueForSurvival();
		
		makeTimedLabels();
		makeSurvivalLabels();
		
		switchButton = new SwitchButton(thirdTimed,secondTimed,firstTimed,
										thirdSurvival,secondSurvival,firstSurvival);
		this.add(switchButton);		
		this.addComponentListener((ComponentListener) new ComponentAdapter() {
			public void componentResized(ComponentEvent e) {
				switchButton.setLocation((getWidth() / 2) - switchButton.getWidth() / 2,
						getHeight()-switchButton.getHeight()-10);
			}
		});
	}
	
	private void makeTimedLabels() {		
		//TMP
		IntegerStringPairs tmp;
		
		tmp = timedMaxHeap.poll();
		tmp = checkIfExists(tmp);
		firstTimed = new ScoresLabel(tmp,1);
		firstTimed.setForeground(Color.YELLOW);
		this.add(firstTimed);
		
		tmp = timedMaxHeap.poll();
		tmp = checkIfExists(tmp);
		secondTimed = new ScoresLabel(tmp,2);
		secondTimed.setForeground(Color.lightGray);
		this.add(secondTimed);
		
		tmp = timedMaxHeap.poll();
		tmp = checkIfExists(tmp);
		thirdTimed = new ScoresLabel(tmp,3);
		thirdTimed.setForeground(Color.PINK);
		this.add(thirdTimed);
		thirdTimed.setLocation(0,60);
		
		firstTimed.setLocation(thirdTimed.getWidth(),10);
		
		secondTimed.setLocation(firstTimed.getWidth()+firstTimed.getX(),30);
	}
	
	private void makeSurvivalLabels() {		
		//TMP
		IntegerStringPairs tmp;
		
		tmp = survivalMaxHeap.poll();
		tmp = checkIfExists(tmp);
		firstSurvival = new ScoresLabel(tmp,1);
		firstSurvival.setForeground(Color.YELLOW);
		this.add(firstSurvival);
		
		tmp = survivalMaxHeap.poll();
		tmp = checkIfExists(tmp);
		secondSurvival = new ScoresLabel(tmp,2);
		secondSurvival.setForeground(Color.lightGray);
		this.add(secondSurvival);
		
		tmp = survivalMaxHeap.poll();
		tmp = checkIfExists(tmp);
		thirdSurvival = new ScoresLabel(tmp,3);
		thirdSurvival.setForeground(Color.PINK);
		this.add(thirdSurvival);
		thirdSurvival.setLocation(0,60);
		
		firstSurvival.setLocation(thirdSurvival.getWidth(),10);
		
		secondSurvival.setLocation(firstSurvival.getWidth()+firstSurvival.getX(),30);
		
		thirdSurvival.setVisible(false);
		secondSurvival.setVisible(false);
		firstSurvival.setVisible(false);
	}
	
	private IntegerStringPairs checkIfExists(IntegerStringPairs obj) { // if doesn`t exists return 0 + Not Yet + Reached
		if(obj == null) {
			obj = new IntegerStringPairs(0,"Not Yet","Reached");
		}
		return obj;
	}
	
	private void makeQueueForTimed() {	
		//System.out.println(timedMaxHeap.poll().getName());
		//TMP
		IntegerStringPairs tmp;
		String[] splittedLine = new String[2];
		
		
		//CREATING MAXHEAP for TIMED
		timedMaxHeap = new PriorityQueue<IntegerStringPairs>(new Comparator<IntegerStringPairs>() {
	        @Override
	        public int compare(IntegerStringPairs o1, IntegerStringPairs o2) {
	            return - IntegerStringPairs.compare(o1,o2);
	        }
	    });
		
		try {
			timedReader = new BufferedReader(new FileReader(".Scores/Timed.txt")); 	  
			String st; 
			while ((st = timedReader.readLine()) != null) {
				if(!st.isEmpty()) {
					splittedLine = st.split("-");
					tmp = new IntegerStringPairs(Integer.parseInt(splittedLine[1]),splittedLine[0],splittedLine[1]);
					timedMaxHeap.add(tmp);
				}
			    //System.out.println(splittedLine[0]+" "+splittedLine[1]);
			}
			timedReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	private void makeQueueForSurvival() {	
		//System.out.println(timedMaxHeap.poll().getName());
		//TMP
		IntegerStringPairs tmp;
		String[] splittedLine = new String[2];
		
		
		//CREATING MAXHEAP for TIMED
		survivalMaxHeap = new PriorityQueue<IntegerStringPairs>(new Comparator<IntegerStringPairs>() {
	        @Override
	        public int compare(IntegerStringPairs o1, IntegerStringPairs o2) {
	            return - IntegerStringPairs.compare(o1,o2);
	        }
	    });
		
		try {
			survivalReader = new BufferedReader(new FileReader(".Scores/Survival.txt")); 	  
			String st; 
			while ((st = survivalReader.readLine()) != null) {
				if(!st.isEmpty()) {
					splittedLine = st.split("-");
					tmp = new IntegerStringPairs(converter(splittedLine[1]),splittedLine[0],splittedLine[1]);
					survivalMaxHeap.add(tmp);
				}
			    //System.out.println(splittedLine[0]+" "+splittedLine[1]);
			}
			survivalReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	private int converter(String string) {
		String[] splittedLine = new String[3];
		splittedLine = string.split(":");
		splittedLine[1]=convertToPropperString(splittedLine[1]);
		splittedLine[2]=convertToPropperString(splittedLine[2]);
		return Integer.parseInt(splittedLine[0]+splittedLine[1]+splittedLine[2]);
	}
	
	private String convertToPropperString(String string) {
		while(string.length()!=3) {
			string = "0"+string;
		}
		return string;
	}
}
