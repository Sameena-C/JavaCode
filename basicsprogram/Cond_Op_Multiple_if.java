/*
 Program on Conditional Operators
 > < >= <= == !=
 using multiple if blocks
 Here if blocks are executing so else block will not execute
 */
  package basicsprogram;
 

public class Cond_Op_Multiple_if {

	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		//int c=30;
		
		if(a>b)
		{
			System.out.println("1");
		}
		if(a<b)
		{
			System.out.println("2");
		}
		if(a>=b)
		{
			System.out.println("3");
		}
		if(a<=b)
		{
			System.out.println("4");
		}
		if(a==b)
		{
			System.out.println("5");
		}
		if(a!=b)
		{
			System.out.println("6");
		}
		/*else 
		{
			System.out.println("End");
		}*/
	}

}
