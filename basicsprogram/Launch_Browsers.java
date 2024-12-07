/*
 Write a program to launch different browsers 
using Scanner class
 */
package basicsprogram;

import java.util.Scanner;

public class Launch_Browsers {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter 1 to launch Chrome Browser");
		System.out.println("Enter 2 to launch Mozilla Browser");
		System.out.println("Enter 3 to launch Edge Browser");
		System.out.println("Enter 4 to launch Opera Browser");
		System.out.println("Enter 5 to launch IE Browser");
		System.out.println("Enter 6 to launch Safari Browser");
		int a=s1.nextInt();
		
		switch(a)
		{
		case 1:
			System.out.println("Chrome Browser is Launched");
			break;
			
		case 2:
			System.out.println("Mozilla Browser is Launched");
			break;
			
		case 3:
			System.out.println("Edge Browser is Launched");
			break;
			
		case 4:
			System.out.println("Opera Browser is Launched");
			break;
			
		case 5:
			System.out.println("IE Browser is Launched");
			break;
			
		case 6:
			System.out.println("Safari Browser is Launched");
			break;
			
			default:
				System.out.println("Your selection is incorrect. "
						+ "Kindly select 1, 2, 3, 4, 5, 6 and try again");
		}
	

	}

}
