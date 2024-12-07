/*
Write a program using a switch case 
with the help of a for loop.
*/

package assignments;

public class Assignment34 {

	public static void main(String[] args) {
		switch(1)
		{
		case 1:
			System.out.println("Case 1 output");
			for(int i=1; i<=10; i++)
			{
				System.out.println(i);
				i++;
				i++;
			}
			
		case 2:
			System.out.println("Case 2 output");
			for(int i=10; i<21; i++)
			{
				System.out.println(i);
			}
		}

	}

}
