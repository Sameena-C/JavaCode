/*
 Program to create a class consisting of 
 Static, Non static and Constructor methods
 call each one of them
 */
package basicsprogram;

public class St_Nst_Cons 
	{
	static void adding()
	{
		System.out.println("Static Non para adding");
	}
	static void add(int a, int b)
	{
		System.out.println("Static para method");
		System.out.println(a+b);
	}
	
	void adding1()
	{
		System.out.println("Non-static Non para adding");
	}
	void add1(int c, int d)
	{
		System.out.println("Non-static Non para method");
		System.out.println(c+d);
	}
	
	St_Nst_Cons()
	{
		System.out.println("Non para Constructor");
	}
	St_Nst_Cons(int m, int n)
	{
		System.out.println("Para Constructor");
		System.out.println(m+n);
	}
	
	public static void main(String[] args) 
	{
		new St_Nst_Cons();
		new St_Nst_Cons(10,30);
		
		adding();
		add(10,15);
				
		St_Nst_Cons s1=new St_Nst_Cons(); //Constructor will also be called along with Non static method
		s1.adding1();
		s1.add1(100, 200);		
	
	}

}
