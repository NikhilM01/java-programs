package JavaBasics;


// byte -> short -> char -> int -> long -> float -> double 

public class TypeCasting {
	  

	public static void main(String args[])  
	{  
	double d = 166.66;  
	//converting double data type into long data type  
	long l = (long)d;  
	
	
	//converting long data type into int data type  
	int i = (int)l;  
	System.out.println("Before conversion: "+d);  
	
	System.out.println("After conversion into long: "+l);  
	
	System.out.println("After conversion into int: "+i);  
	
	}  
}
