/*Exam 2*/
package basicsprogram;

import java.util.Scanner;

public class Vote {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter age:");
		int age=s1.nextInt();
		System.out.println("Enter gender:");
		String gender=s1.next();
		
		if(age>18 && gender=="female")
		{
			System.out.println("You can Vote");
		}
		else
		{
			System.out.println("You cannot Vote");
		}


	}

}
