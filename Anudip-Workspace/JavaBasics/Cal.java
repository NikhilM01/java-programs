package JavaBasics;
//method overriding: having same name same parameter list but appering in different class
class Operation1{

	public void add(int a, int b) { //method overloading
		int result=a+b;
		System.out.println(result);
	}
	public void add(int a, int b,int c) {
		int result=a+b+c;
		System.out.println(result);
	}
	public void add(int a, int b, float c) {
		float result=a+b+c;
		System.out.println(result);
	}
}

class Operation2 extends Operation1{

	public void add(int a, int b) { //method overloading
		int result=a+b;
		System.out.println(result);
	}
	public void add(int a, int b,int c) {
		int result=a+b+c;
		System.out.println(result);
	}
	public void add(int a, int b, float c) {
		float result=a+b+c;
		System.out.println(result);
	}
}



public class Cal {

	
	public static void main(String[] args) {
		

	}

}
