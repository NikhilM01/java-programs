package com.anudip.nikhil;

/*The Java throw keyword is used to explicitly throw an exception.
We can throw either checked or unchecked exception in java by throw keyword.
The throw keyword is mainly used to throw custom exception(UserDefined).*/


public class ThrowDemo {
	static void validateAge(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("age is less than 18 hai");
		}
		else
		{
			System.out.println("please vote");
		}
	}
	public static void main(String[] args) {
		
		
		validateAge(13);//invoked function
		
		System.out.println("bacha hua code wil execute");
	}
}

