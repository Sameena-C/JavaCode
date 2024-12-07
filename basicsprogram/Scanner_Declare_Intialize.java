/*
 Program to do Declaration and Initialization of all the 
 methods in Scanner class
 */
package basicsprogram;

import java.util.Scanner;

public class Scanner_Declare_Intialize {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter String value:");
		String a1=s1.next();
		System.out.println("String value:"+a1);
		
		System.out.println("Enter Int value:");
		int i1=s1.nextInt();
		System.out.println("Int value:"+i1);
		
		System.out.println("Enter Byte value:");
		byte b1=s1.nextByte();
		System.out.println("Byte value:"+b1);
		
		System.out.println("Enter Short value:");
		short s2=s1.nextShort();
		System.out.println("Short value:"+s2);
		
		System.out.println("Enter Long value:");
		long l1=s1.nextLong();
		System.out.println("Long value:"+l1);
		
		System.out.println("Enter Float value:");
		float f1=s1.nextFloat(); //do not enter f after value
		System.out.println("Float value:"+f1);
		
		System.out.println("Enter Double value:");
		double d1=s1.nextDouble();
		System.out.println("Double value:"+d1);
		
		System.out.println("Enter Boolean value:");
		boolean b2=s1.nextBoolean(); //Enter True or False only; can enter in upper case also
		System.out.println("Boolean value:"+b2);
		
	}

}
