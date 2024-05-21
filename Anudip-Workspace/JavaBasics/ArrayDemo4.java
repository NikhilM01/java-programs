package JavaBasics;

public class ArrayDemo4 {
	static void methodOne(double[] d)
	{
		d[2]=25.62;
		d[4]=66.62;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] d=new double[8];
		d[2]=10.11;
		d[4]=8.99;
		
		methodOne(d);
		System.out.println(d[2]);
		System.out.println(d[4]);
	}

}
