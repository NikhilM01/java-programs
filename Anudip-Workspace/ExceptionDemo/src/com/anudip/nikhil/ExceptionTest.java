package com.anudip.nikhil;

class MeraException extends Exception{
	private int ex;
	MeraException(int a){
		ex=a;
	}

	@Override
	public String toString() {
		return "MyException [ " + ex  +" ] is less than 0";
	}
	
}



public class ExceptionTest {
	
	static void sum(int a , int b) throws MeraException{
		if(a<0) {
			throw new MeraException(a);
		}else {
			System.out.println(a+b);
		}
	}

	public static void main(String[] args) {
		
		try {
			sum(-10,10);
		}catch(MeraException e) {
			System.out.println(e);
		}
	}

}
