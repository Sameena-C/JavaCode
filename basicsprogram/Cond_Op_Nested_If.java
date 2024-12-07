/*
 Program using Nested if condition
 if (a<b) is true if(a==10) is true output will be 1
 if (a<b) is true if(a!=10) is true output will be 2
 if (a>b) is true it goes to else output will be 3
 */

package basicsprogram;

public class Cond_Op_Nested_If {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		//int c=30;
		if (a<b)
		//if (a>b)
		{
			if(a==10)
			//if(a!=10)
			{
				System.out.println("1");
			}
			else
			{
				System.out.println("2");
			}
		}
		else
		{
			System.out.println("3");
		}

	}

}
