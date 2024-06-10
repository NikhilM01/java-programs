package com.anudip.nikhil;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		
		int a=0;
		int b=1;
		System.out.println("Nikhil"); // this will print 
		
		try {
			System.out.println(b/a);
		}
		catch(Exception ex) {
			System.out.println("divide by 0 is not possible");
		}
		finally {
			System.out.println("i will suarly excecute"); 
		}
	
		System.out.println("XYZ");  // this will not print 

	}

}
//Exception in thread "main" java.lang.ArithmeticException: / by zero
// at ExceptionDemo/com.anudip.nikhil.ExceptionDemo.main(ExceptionDemo.java:10)