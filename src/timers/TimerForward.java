package timers;

import java.util.concurrent.TimeUnit;

import labels.TimerLabel;

public class TimerForward extends Thread{
		
	 	private long minutesPassed=0;
	    private long timePassed;
	    private long secondsPassed;
	    private long miliseconds;
	    private long starttime=System.currentTimeMillis();
	    
	    private TimerLabel timerLabel;
		
		public TimerForward(TimerLabel timerLabel) {
			this.timerLabel=timerLabel;
			starttime=System.currentTimeMillis();
		}
		
		@Override
		public void run(){
			while(true) {
			 try {
					TimeUnit.MICROSECONDS.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 	timePassed=System.currentTimeMillis()-starttime;
		        secondsPassed=timePassed/1000;
		        if(secondsPassed==60)
		        {
		            secondsPassed=0;
		            minutesPassed++;
		            starttime=System.currentTimeMillis();
		        }
		        miliseconds=(timePassed%1000);
		        timerLabel.setText(minutesPassed+":"+secondsPassed+":"+miliseconds);
			}
		}
}
