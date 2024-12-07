/*
 Program to Parameterized Static method
 */

package basicsprogram;

public class Param_Static {
	static void add(int a, int b, float c)
	{
		System.out.println(a+b+c);
	}
	static void sub(int a, int b)
	{
		System.out.println(a-b);
	}
	static void mul_div_mod(double c, double d)
	{
		System.out.println(c*d);
		System.out.println(c/d);
		System.out.println(c%d);
	}
	static void login(String un, String pwd)
	{
		System.out.println("Login Successful");
	}
	static void para(int a, float f, char c, double d, boolean b)
	{
		System.out.println("Multiple parameters in one static method");
	}
	public static void main(String[] args) 
	{
		sub(500, 1000);
		add(100, 200, 300.7f);	
		mul_div_mod(9, 4);
		login("Java", "Class@123");
		para(1, 2.3f, 'Q', 4.5678, true);
	}

}
