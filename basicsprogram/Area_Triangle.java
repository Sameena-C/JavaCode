/*
 Program to find Area of Triangle using Scanner class
 */
package basicsprogram;

import java.util.Scanner;

public class Area_Triangle {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Base of Triangle:");
		double B=s1.nextDouble();
		System.out.println("Enter Height of Triangle:");
		double H=s1.nextDouble();
		double Area=0.5*B*H;
		System.out.println("Area of Triangle:"+Area);

	}

}
