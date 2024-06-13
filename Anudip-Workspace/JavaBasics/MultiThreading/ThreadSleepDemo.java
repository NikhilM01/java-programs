package com.nikhil;
public class ThreadSleepDemo extends Thread{
	@Override
	public void run()//running
	{
		for(int i=1; i <= 10 ; i++)
		{
			System.out.println(i);
			
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			
		}
	}
	public static void main(String[] args) {
		ThreadSleepDemo ts=new ThreadSleepDemo(); //new
		ts.start();  //runnable
	}
}
