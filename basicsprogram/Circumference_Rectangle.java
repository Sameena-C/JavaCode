/*
 Program to find Circumference of Rectangle 
 using Scanner class
 */
package basicsprogram;

import java.util.Scanner;

public class Circumference_Rectangle {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Length of Rectangle:");
		double l=s1.nextDouble();
		System.out.println("Enter Breadth of Rectangle:");
		double b=s1.nextDouble();
		double circum=2*l+2*b;
		System.out.println("Circumference of Rectangle:"+circum);
		
		

	}

}
