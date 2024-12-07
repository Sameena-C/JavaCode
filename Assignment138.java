/*
 "Assignment 138
Write a program with exception handling 
using multiple catch block "
 */
package assignments;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment138 {

	public static void main(String[] args) 
	{
		try
		{
		Scanner s1=new Scanner(System.in);
		System.out.println("Please enter the size of an Array");
		int rollno[]=new int[s1.nextInt()];
		
		for(int i=0; i<rollno.length; i++)
		{
			rollno[i]=s1.nextInt();
		}
		System.out.println(Arrays.toString(rollno));
		}
		catch(InputMismatchException m1)
		{
			System.out.println("Please enter whole number");
			
			Scanner s1=new Scanner(System.in);
			System.out.println("Please enter the size of an Array");
			int rollno[]=new int[s1.nextInt()];
			
			for(int i=0; i<rollno.length; i++)
			{
				rollno[i]=s1.nextInt();
			}
			System.out.println(Arrays.toString(rollno));
		}
		catch(NegativeArraySizeException m2)
		{
			System.out.println("Please enter positive number");
			
			Scanner s1=new Scanner(System.in);
			System.out.println("Please enter the size of an Array");
			int rollno[]=new int[s1.nextInt()];
			
			for(int i=0; i<rollno.length; i++)
			{
				rollno[i]=s1.nextInt();
			}
			System.out.println(Arrays.toString(rollno));
			
			
		}
	}
      
}
