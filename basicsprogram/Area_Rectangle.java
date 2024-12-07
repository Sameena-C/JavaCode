/*
 Program to find Area of Rectangle using Scanner class
 */
package basicsprogram;

import java.util.Scanner;

public class Area_Rectangle {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Length of Rectangle:");
		double L=s1.nextDouble();
		System.out.println("Enter Breadth of Rectangle:");
		double B=s1.nextDouble();
		double Area=L*B;
		System.out.println("Area of Rectangle:"+Area);

	}

}
