/*
 Program using AND, NOT logical operators
 */
package basicsprogram;

public class Logic_Op_NOT_AND {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		if(!(a==20 && b!=10))
		//if(!(a==10 && b!=10))
		{
			System.out.println("if block executed");
		}
		else
		{
			System.out.println("else block executed");
		}

	}

}
