/*
 "Assignment 3
Write a program to create a static method 
along with a main method that performs 
addition, subtraction, multiplication, 
division and modulus."
 */

package assignments;

public class Assignment3 {
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
		addition();
		sub();
		multi();
		div();
		mod();

	}

}
