/*
 Program to create 5 Static and 5 Non Static methods 
 with same name
 */

package basicsprogram;

public class Same_Method5 {
	/*Static Method*/
	static void mul()
	{
		System.out.println("Static Non para Multiply-1");
	}
	static void mul(int a)
	{
		System.out.println("Static para Multiply-2");
	}
	static void mul(char g)
	{
		System.out.println("Static para Multiply-3");
	}
	static void mul(String s)
	{
		System.out.println("Static para Multiply-4");
	}
	static void mul(int i,double d, boolean b)
	{
		System.out.println("Static para Multiply-5");
	}
	/*Non Static method*/
	void mul(float a)
	{
		System.out.println("Non Static para Multiply-1");
	}
	void mul(double a)
	{
		System.out.println("Non Static para Multiply-2");
	}
	void mul(int x, int y)
	{
		System.out.println("Non Static para Multiply-3");
	}
	void mul(boolean b, char c)
	{
		System.out.println("Non Static para Multiply-4");
	}
	void mul(float c,int d)
	{
		System.out.println("Non Static para Multiply-5");
	}
	public static void main(String[] args) 
	{
		/*Calling Static method*/
		mul();
		mul(10);
		mul('M');
		mul("Java");
		mul(2,3.5,true);
		
		/*Calling Non static method*/
		Same_Method5 m1=new Same_Method5();
		m1.mul(123.5f);
		m1.mul(45678.6789);
		m1.mul(1,1234);
		m1.mul(false,'F');
		m1.mul(11.1f,127);
		

	}

}
