package JavaBasics;



class Parent{ //Outer Class
	private int i;
	private void parentMethod() {
		System.out.println(i);
//		private	InnerParent ip=new InnerParent();
	}
class InnerParent{ //Inner class
		
	}
}

class AnotherClass{
	void anotherMethod() {
//		Parent p= new Parent();
//		System.out.println(p.i);
//		p.parentMethod();
//		Parent.InnerParent ipu= new Parent.InnerParent()
	}
}

class Child extends Parent{
	void childMethod() {
		Parent p1=new Parent();
//		System.out.println(p1.i);
//		p1.parentMethod();
		Parent.InnerParent ipu= new Parent.InnerParent();
	}
}

public class InterfaceDemo1 {
	
	 public static void main(String[] args) {
		 
	 }
}
