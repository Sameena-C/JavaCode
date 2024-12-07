/*Exam 2*/
package basicsprogram;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter 1st number:");
		double a=s1.nextDouble();
		System.out.println("Enter 2nd number:");
		double b=s1.nextDouble();
		System.out.println("Enter 3rd number:");
		double c=s1.nextDouble();
		System.out.println("Enter 4th number:");
		double d=s1.nextDouble();
		
		double sum=a+b+c+d;
		
		System.out.println("Sum of 4 numbers:"+sum);

	}

}
