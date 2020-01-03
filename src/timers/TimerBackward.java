package timers;

import java.util.concurrent.TimeUnit;

import labels.TimerLabel;

public class TimerBackward extends Thread{
	
 	private long minutesPassed;
    private long timePassed;
    private long secondsPassed;
    private long miliseconds;
    private long starttime=System.currentTimeMillis();
    
    private TimerLabel timerLabel;
    
    private Boolean zero;
	
	public TimerBackward(TimerLabel timerLabel,int minutes,int seconds,int milis) {
		minutesPassed = minutes;
		secondsPassed= seconds;
		miliseconds= milis;
		this.timerLabel=timerLabel;
		this.timerLabel.setText(minutes+":"+seconds+":"+milis);
		zero=true;
		starttime=System.currentTimeMillis();
	}
	
	@Override
	public void run(){
		while(zero) {
		 try {
				TimeUnit.MILLISECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 	timePassed=System.currentTimeMillis()-starttime;
		 	miliseconds=miliseconds-timePassed;
		 	if(miliseconds<0) {
		 		miliseconds = miliseconds + 1000;
		 		secondsPassed--;
		 		if(secondsPassed<0) {
		 			secondsPassed = secondsPassed+60;
		 			minutesPassed--;
		 		}
		 	}
		 	if(minutesPassed>=0) {
	        timerLabel.setText(minutesPassed+":"+secondsPassed+":"+miliseconds);
	 		starttime=System.currentTimeMillis();
		 	}
		 	else
		 		zero=false;
		}
		 timerLabel.setText(0+":"+0+":"+0);
	}
}
