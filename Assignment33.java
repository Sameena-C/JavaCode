/*
 Write a program that creates a class to print 
 the value of a from 1 to 8, 
 but skip the value when a equals 3, 
 using the switch concept.
 */

package assignments;

public class Assignment33 {

	public static void main(String[] args) {
		switch(1)
		{
		
		case 1:
		for(int i=1; i<=8; i++)
		{
			if(i==3)
			{
				continue;
			}
			System.out.println(i);
		}
		 break;
		 
		case 2:
			for(int i=1; i<=8; i++)
			{
				System.out.println(i);
			}
			 break;
			
			
		default:
			System.out.println("Your selection is incorrect");
			
		}

	}

}
