package testingPurpose;

import java.util.concurrent.TimeUnit;

public class Timer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    boolean x=true;
	    long displayMinutes=0;
	    long timepassed;
	    long secondspassed;
	    long starttime=System.currentTimeMillis();
	    System.out.println("Timer:");
	    while(x)
	    {
	        try {
				TimeUnit.MICROSECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        timepassed=System.currentTimeMillis()-starttime;
	        secondspassed=timepassed/1000;
	        if(secondspassed==60)
	        {
	            secondspassed=0;
	            displayMinutes++;
	            starttime=System.currentTimeMillis();
	        }
	        timepassed=(timepassed%1000);
	    System.out.println(displayMinutes+":"+secondspassed+":"+timepassed);
	    }

	}

}
