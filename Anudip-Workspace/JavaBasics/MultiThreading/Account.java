package com.nikhil;

//String Buffer is thread safe
//String Buffer is synchronized class
//Vector class is also thread safe
public class Account extends Thread{
	static int balance=1000;
	
	public void run()
	{
		synchronized (Account.class)  //thread safety
		{
		if(balance > 800)
		{
					
			System.out.println(Thread.currentThread().getName() + " " +""
					+ " Your balance is " + balance + " " + "u can withdraw the ammount");
			
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			balance=200;
			System.out.println(Thread.currentThread().getName() + "After withdrwal your balace is " + balance);
			
		}
	
		else
		{
			System.out.println(Thread.currentThread().getName() + " " +""
					+ " Your balance is " + balance + " " + "u can not withdraw the amount");
			
		}
		
	 }
	}
}
