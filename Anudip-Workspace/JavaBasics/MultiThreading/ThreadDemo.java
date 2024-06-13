package com.nikhil;

//Multithreding
//Application-is a program which is designed to perform some specific task.
/*word - video player -google crome -
*
* Process- Process is an executing instance of an application.
* For example, when you double click MS Word icon in your computer,
*  you start a process that will run this MS word application.
*  Processes are heavy weight operations that they require their own
*  separate memory address in operating system.
*  
Thread- Thread is a smallest executable unit of a process.
* For example, when you start MS word, operating system creates a process and
*  start the execution of a primary thread of that process.
*   A process can have multiple threads.
*   Threads of the same process share the memory address of that process.
*    i.e threads are stored inside the memory of a process.
*     As the threads are stored in the same memory space, communication between threads
*      (Inter Thread Communication) is fast.
*    Context switching from one thread to another thread is also less expensive.
*  
*   Multitasking
*   Multitasking is an operation in which multiple tasks are performed simultaneously.
*  
*   Multitasking can be of two types.
*  
*   Process-based multitasking- Multiprocessing
*  
*   Thread-based Multitasking- Multithreading
*  
*   2 ways to create the thread
*   1 - By extending the Thread class
*   2- By Implementing the Runnable interface
* 
*   Thread life cycle
*  
*   new - > runnable - > running - > block (sleep/wait) - runnable - running - >end
*/
//is-a- Thread1 is-a thread
class Thread1 extends Thread
{
	public void run() // running
	{
		for(int i=0; i<=10;i++)
		{
			System.out.println(Thread.currentThread().getName()+ " "+ i);
		}
	}
}
//end
/*
* class Thread2 extends Thread { public void run() { for(int i=11; i<=20;i++) {
* System.out.println("Thread 2 " +i); } } }
*/
public class ThreadDemo {
	public static void main(String[] args) { // single threaded application
		
		Thread1 t1=new Thread1(); //new
		t1.setName("Nikhil");
		t1.start(); //runnable
		
		Thread1 t2=new Thread1();
		t2.setName("Aniket");
		t2.start();
		
		/*
		 * Thread2 t2=new Thread2(); t2.start();
		 */
		System.out.println("im main");
	}
}
