package com.nikhil;

public class AnonymousThread {
	public static void main(String[] args) {
//Thread t1=new Thread();
		
		new Thread()
		{
			public void run()
			{
				System.out.println("Some tasks");
			}
		}.start();
		
	//	ImplementRunnable ir=new ImplementRunnable();
	//	Thread t1=new Thread(ir);
		//t1.start();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				
			}
		}).start();
	}
}
