/*
 Program to find Circumference of Square 
 using Scanner class
 */
package basicsprogram;

import java.util.Scanner;

public class Circumference_Square {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of side of Square:");
		double a=s1.nextDouble();
		double circum=4*a;
		System.out.println("Circumference of Square:"+circum);

	}

}
