/*
 Program on Conditional Operator
 using if - else if - else block
 
 Only 1 condition will execute whichever 1st condition is true
 so output will be 2
 */

package basicsprogram;

public class Cond_Op_if_else_if {

	public static void main(String[] args) {
		int a=100;
		int b=200;
		int c=90;
		int d=10;
		if(a>b)
		{
			System.out.println("1");
		}
		else if(a<b)
		{
			System.out.println("2");
		}
		else if(a==b)
		{
			System.out.println("3");
		}
		else if(c!=d)
		{
			System.out.println("4");
		}
		else
			{
				System.out.println("5");
			}
	}

}
