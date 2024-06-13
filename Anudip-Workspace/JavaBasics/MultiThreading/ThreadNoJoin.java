package com.nikhil;
/*join() method of java.lang.Thread class is used to mantain the order of
* execution of threads. Using join() method, you can make the currently
* executing thread to wait for the some other threads to finish their task.
*  For example, Let’s us assume that there are two threads namely, thread1
*   and thread2. You can make thread1 to hold it’s execution for some time
*   so that thread2 can finish it’s task. After, thread2 finishes it’s task,
*    thread1 resumes it’s execution.
* For this to happen, you should call join() method on thread2 within thread1.
*/
public class ThreadNoJoin extends Thread{
	@Override
	public void run()
	{
		System.out.println(Thread.currentThread().getName() +" "+  "Break-Fast");
		
		try {
			sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName() +" "+  "Lunch");
	}
	public static void main(String[] args) {
		ThreadNoJoin j1=new ThreadNoJoin();
		ThreadNoJoin j2=new ThreadNoJoin();
		j1.setName("Aniket");
		j2.setName("Vijaya");
		j1.start();
		
		try {
			j1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		j2.start();
		
		//Aniket -Breakfast
		//Aniket -Lunch
		
		//Vijaya -BreakFast
		//Vijaya -Lunch
	}
}
