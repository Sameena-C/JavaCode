/*
 Program using OR, NOT logical operators
 */

package basicsprogram;

public class Logic_Op_NOT_OR {

	public static void main(String[] args) {
		int a=50;
		int b=10;
		if(!(a==40 || b<10))
		//if(!(a>40 || b<10))
		{
			System.out.println("if block executed");
		}
		else
		{
			System.out.println("else block executed");
		}

	}

}
