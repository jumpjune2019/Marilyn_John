package trafficlight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StopLight implements Runnable{

/*
	boolean stopped;
	String s = null;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	private boolean doStop = false;
	
	public Boolean getStop() {
		return doStop;
	}
	
	public void setStop(Boolean stop) {
		this.doStop = stop;
	}
	*/
	
	public int LOOP_NUMBERS_UPTO=20;
	static int  number=1;
	int remainder;
	static Object lock=new Object();
 
	StopLight(int remainder)
	{
		this.remainder=remainder;
	}
 
	@Override
	public void run() {

		//while(!doStop) {

			while (number < LOOP_NUMBERS_UPTO-1) {
			synchronized (lock) {
				while (number % 3 != remainder) { // wait for numbers other than remainder
		//			do {
					try {
						
				//		s = br.readLine();

						
						String threadName = Thread.currentThread().getName();
						
						switch (threadName) {
						
						case "Light is Green - Go!":
							int value1 = Colors.GREEN.getValue();
							Thread.sleep(value1);
							break;
						case "Light is Yellow - Yield!":
							int value2 = Colors.YELLOW.getValue();
							Thread.sleep(value2);
							break;
						case "Light is Red - Stop!":
							int value3 = Colors.RED.getValue();
							Thread.sleep(value3);
							break;
						}
						
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					//}while(s!="");
					
					//mystop();
					

				}
				System.out.println(Thread.currentThread().getName());
				number++;
				
				lock.notifyAll();
				
				
				
			}
			}
			
			
			
			
		}
	/*
	synchronized void mystop() {
		stopped = true;
		notify();
	}
	*/
	
}