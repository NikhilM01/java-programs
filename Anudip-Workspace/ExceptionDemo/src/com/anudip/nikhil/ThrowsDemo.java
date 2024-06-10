package com.anudip.nikhil;
import java.io.IOException;
/*
*
*/
//If a method is capable of throwing an exception that it could not handle,
//then it should specify that exception using throws keyword.
//It helps the callers of that method in handling that exception
//throws
// Propagation of exception
public class ThrowsDemo {
	
	void method1() throws IOException
	{
		throw new IOException("Some divice Error");
	}
	void method2() throws IOException
	{
		method1();
	}
	void method3()
	{
		try {
			method2();
		} catch (IOException e) {
			
			System.out.println("Handle hua");
		}
	}
	public static void main(String[] args) {
		ThrowsDemo td=new ThrowsDemo();
		
		td.method3();
	}
}

