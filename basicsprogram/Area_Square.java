/*
 Program to find Area of Square using Scanner class
 */

package basicsprogram;

import java.util.Scanner;

public class Area_Square {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of side a:");
		double a=s1.nextDouble();
		double Area=a*a;
		System.out.println("Area of Square:"+Area);

	}

}
