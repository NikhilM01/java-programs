package com.nikhil;
/*thread state
new
runnble
running
block
dead*/
public class ThreadSample extends Thread {
	public void run()//running
	{
		for(int i=0; i<=10;i++)
		{
			System.out.println(Thread.currentThread().getName()+ " "+ i);
		}
	}
	public static void main(String[] args) {
		ThreadSample ts=new ThreadSample();//new
		//ts.start(); //runnable
		
		ts.setName("Nikhil");
		ts.setPriority(MAX_PRIORITY); //10
		ts.setPriority(MIN_PRIORITY); //1
		ts.setPriority(NORM_PRIORITY);//5
		System.out.println(ts.getPriority());
		System.out.println(ts.getName());
		System.out.println(ts.getId());
		System.out.println(ts.getClass());
		
		
		ThreadSample ts1=new ThreadSample();
		System.out.println(ts1.getPriority());
		System.out.println(ts1.getName());
		System.out.println(ts1.getId());
		System.out.println(ts1.getClass());
		System.out.println(ts1.getState());
		//System.out.println(ts1.g);
		
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		/*try
		{
		ts.start();
		}
		catch(IllegalThreadStateException il)
		{
			System.out.println("State confuge hua");
		}
		System.out.println("mail vala bhi statment");*/
	}
}

