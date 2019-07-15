package trafficlight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//import threadtest.StopLight;


public class Main {

	public static void main(String[] args) {
		
		StopLight runnable1=new StopLight(1);
		StopLight runnable2=new StopLight(2);
		StopLight runnable3=new StopLight(0);
		
		Thread t1=new Thread(runnable1,"Light is Green - Go!");
		Thread t2=new Thread(runnable2,"Light is Yellow - Yield!");
		Thread t3=new Thread(runnable3,"Light is Red - Stop!");
		
		t1.start();
		t2.start();
		t3.start();	  
		
		/*
		runnable1.setStop(true);
		runnable2.setStop(true);
		runnable3.setStop(true);
	    */
	}

	
}
