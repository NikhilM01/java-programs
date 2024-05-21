package JavaBasics;

import java.util.Arrays;

public class ArrayDemo {
	
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,9,10};
		int[] b= a;
	
		for(int i=0;i<a.length;i++) 
		{  
		System.out.print(a[i] + " , ");    
		}
		 System.out.println();
		 b[2]=11;
		 
		 System.out.println(a[2]);
		  int c[] = Arrays.copyOf(a, a.length); 
		  for(int i=0;i<c.length;i++) 
			{  
			System.out.print(c[i] + " , ");    
			}
	}
}


