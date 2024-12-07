/*
 "Assignment 139
Write a program with exception handling 
using multiple catches block and finally block "
 */
package assignments;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment139 {

	public static void main(String[] args) 
	{
		try
		{
		Scanner s1=new Scanner(System.in);
		System.out.println("Please enter the size of an Array");
		int num[]=new int[s1.nextInt()];
		
		for(int i=0; i<num.length; i++)
		{
			num[i]=s1.nextInt();
		}
		System.out.println(Arrays.toString(num));
		}
		catch(NegativeArraySizeException m1)
		{
			System.out.println("Please enter the size of Array as Positive number");
			
			Scanner s1=new Scanner(System.in);
			System.out.println("Please enter the size of an Array");
			int num[]=new int[s1.nextInt()];
			
			for(int i=0; i<num.length; i++)
			{
				num[i]=s1.nextInt();
			}
			System.out.println(Arrays.toString(num));
		}
		catch(InputMismatchException m2)
		{
			System.out.println("Please enter the size of Array as whole number");
			
			Scanner s1=new Scanner(System.in);
			System.out.println("Please enter the size of an Array");
			int num[]=new int[s1.nextInt()];
			
			for(int i=0; i<num.length; i++)
			{
				num[i]=s1.nextInt();
			}
			System.out.println(Arrays.toString(num));
		}
		finally
		{
			System.out.println("I am always there!");
			System.out.println("Thank you!");
		}
		
		
	}

}
