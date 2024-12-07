/*
 Program to print your name during run time
 using Scanner class
 */
package basicsprogram;

import java.util.Scanner;

public class Scannerclass {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		String name=s1.next();
		System.out.println("Your name is:"+name);
	}

}
