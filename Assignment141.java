/*
 "Assignment 141
Write a program where you have
1SIB
2IIB
1Main method

Here create 2 objects Check order of execution"

Order of Execution:
1st - SIB
2nd - Main method
3rd with object a - IIB 1
	  				IIB 2
4th with object b - IIB 1
      				IIB 2
 */
package assignments;

public class Assignment141 {
	static
	{
		System.out.println("SIB");
	}
	{
		System.out.println("IIB 1");
	}
	{
		System.out.println("IIB 2");
	}

	public static void main(String[] args) 
	{
		System.out.println("Main method");
		Assignment141 a=new Assignment141();
		Assignment141 b=new Assignment141();
	}

}
