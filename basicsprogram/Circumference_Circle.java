/*
 Program to find Circumference of Circle 
 using Scanner class
 */
package basicsprogram;

import java.util.Scanner;

public class Circumference_Circle {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter radius of the Circle:");
		double r=s1.nextDouble();
		double circum=2*Math.PI*r;
		System.out.println("Circumference of Circle:"+circum);

	}

}
