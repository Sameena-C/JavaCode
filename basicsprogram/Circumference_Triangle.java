 /*
 Program to find Circumference of Triangle 
 using Scanner class
 */
package basicsprogram;

import java.util.Scanner;

public class Circumference_Triangle {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter value of a:");
		double a=s1.nextDouble();
		System.out.println("Enter value of b:");
		double b=s1.nextDouble();
		System.out.println("Enter value of c:");
		double c=s1.nextDouble();
		double circum=a+b+c;
		System.out.println("Circumference of Triangle:"+circum);

	}

}
