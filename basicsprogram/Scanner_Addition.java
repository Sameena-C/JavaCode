/*
 Program to do addition using Scanner class
 */
package basicsprogram;

import java.util.Scanner;

public class Scanner_Addition {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in); //To give input during run time
		System.out.println("Enter first number:");
		int a =s1.nextInt();
		System.out.println("Enter second number:");
		int b=s1.nextInt();
		int sum=a+b;
		System.out.println("Sum of two numbers is:"+sum);

	}

}
