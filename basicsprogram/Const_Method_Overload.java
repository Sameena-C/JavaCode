/*
 Program on both Constructor and Method Overloading
 */
package basicsprogram;

public class Const_Method_Overload 
{
	/*Constructor Overloading*/
	Const_Method_Overload()
	{
		System.out.println("Constructor 1");
	}
	Const_Method_Overload(int a)
	{
		System.out.println("Constructor 2");
	}
	Const_Method_Overload(int a,double d)
	{
		System.out.println("Constructor 3");
	}
	/*Method Overloading*/
	/*Static Method*/
	static void sub()
	{
		System.out.println("Substracting");
	}
	static void sub(int a, int b)
	{
		System.out.println(a-b);
	}
	static void sub(int a, double b)
	{
		System.out.println(a-b);
	}
	/*Method Overloading*/
	/*Non static Method*/
	void sub(int x)
	{
		System.out.println(x);
	}
	void sub(int x, boolean b)
	{
		System.out.println(b);
	}
	void sub(double y)
	{
		System.out.println("Login");
	}
	public static void main(String[] args) 
	{
		new Const_Method_Overload();
		new Const_Method_Overload(1);
		new Const_Method_Overload(2, 4.8);
		
		sub();
		sub(4,5);
		sub(6,7.1);
		
		Const_Method_Overload n1=new Const_Method_Overload();
		n1.sub(5);
		n1.sub(10,true);
		n1.sub(19.8);

	}

}
