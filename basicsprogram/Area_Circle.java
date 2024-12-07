/*
 Program to find Area of Circle using Scanner class
 */
package basicsprogram;

import java.util.Scanner;

public class Area_Circle {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter radius of Circle:");
		double r=s1.nextDouble();
		double Area=Math.PI*r*r;
		System.out.println("Area of Circle:"+Area);

	}

}
