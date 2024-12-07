/*
 "Assignment 142
Write a program where you have
1SIB
3IIB
2Constructor
1Main method

Create 2 object to invoke 2 constructors. 
Check order of execution"

Order of Execution:
1st - SIB
2nd - Main method
3rd with object a1 - IIB 1
					 IIB 2
				     IIB 3
4th with object a1 - Constructor 1
5th with object a2 - IIB 1
					 IIB 2
                     IIB 3
6th with object a2 - Constructor 2
 */
package assignments;

public class Assignment142 {
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
	{
		System.out.println("IIB 3");
	}
	Assignment142()
	{
		System.out.println("Constructor 1");
	}
	Assignment142(int a)
	{
		System.out.println("Constructor 2");
	}
	public static void main(String[] args) 
	{
		System.out.println("Main method"); 
		Assignment142 a1=new Assignment142();
		Assignment142 a2=new Assignment142(10);

	}

}
