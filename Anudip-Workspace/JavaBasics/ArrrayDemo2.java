package JavaBasics;

public class ArrrayDemo2 {

	public static void main(String[] args) {
			int[] originalArray = {1, 2, 3, 4, 5};
	        
	      
	        int[] clonedArray = originalArray.clone();
	        
	       
	        clonedArray[2] = 10;
	        
	        
	        System.out.println(originalArray[2]);
	        
	        
	        
	       // both array
	        for (int i : originalArray) {
	            System.out.print(i + " ");
	        }
	        System.out.println();
	        
	        for (int i : clonedArray) {
	            System.out.print(i + " ");
	        }
	        System.out.println();
	       
	}

}
