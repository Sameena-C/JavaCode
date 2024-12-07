/*
 Program on Arithmetic Operators
 */

package basicsprogram;

public class Arithmetic_Operators {	
		static void addition()
		{
			int a=100;
			int b=90;
			int sum=a+b; //Addition
			System.out.println(sum);
		}
		static void sub()
		{
			int a=100;
			int b=900;
			int c=a-b; //Substraction
			System.out.println(c);
		}
		static void multi()
		{
			int a=10;
			int b=9;
			int c=a*b; //multiplication
			System.out.println(c);
		}
		static void div()
		{
			int a=100;
			int b=90;
			int c=a/b; //division --returns quotient
			System.out.println(c);
		}
		static void mod()
		{
			int a=100;
			int b=90;
			int c=a%b;  //modulus --returns remainder
			System.out.println(c);
		}
			
public static void main(String[] args) 
{
	// TODO Auto-generated method stub
	
	addition();
	sub();
	multi();
	div();
	mod();
	
}
}
