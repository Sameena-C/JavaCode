/*
  Write a program to create a class without creating 5 methods 
  addition, subtraction, multiplication, division, modulus. 
  Create 2 global variable a & b and perform 
  the operation without involving 3rd variable.
 */

package basicsprogram;

public class Global_Var_Method5 
{
	final static double a=100;
	final static double b=20;

	public static void main(String[] args) 
	{
		System.out.println(a+b); //Addition
		System.out.println(a-b); //Subtraction
		System.out.println(a*b); //Multiplication
		System.out.println(a/b); //Division
		System.out.println(a%b); //Modulus

	}

}
