package JavaBasics;

public class Variables {
	int add(int a, int b) {
			int result=a+b;
			return result;
		}
	public static void main(String[] args) {
		Variables vr=new Variables();
		int m= vr.add(3,4); //invoking the method / Calling method
		System.out.println(m);
	}

}
