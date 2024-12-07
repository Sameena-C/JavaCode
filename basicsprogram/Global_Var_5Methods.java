/*
  Write a program to create a class with 5 methods 
  addition, subtraction, multiplication, division, modulus. 
  Create 2 global variable a & b and perform 
  the operation without involving 3rd variable.
 */

package basicsprogram;

public class Global_Var_5Methods 
{
	final static double a=100;
	final static double b=20;
	
	static void addition()
	{
		System.out.println(a+b); 	
	}
	static void subtraction()
	{
		System.out.println(a-b); 	
	}
	static void multiplication()
	{
		System.out.println(a*b); 	
	}
	static void division()
	{
		System.out.println(a/b); 	
	}
	static void modulus()
	{
		System.out.println(a%b); 	
	}
	public static void main(String[] args) 
	{
		addition();
		subtraction();
		multiplication();
		division();
		modulus();
	}

}
