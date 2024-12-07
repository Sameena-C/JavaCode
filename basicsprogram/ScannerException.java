/*
 Program on java.util.InputMismatchException using Scanner class
 */
package basicsprogram;

import java.util.Scanner;

public class ScannerException {

	public static void main(String[] args) {
		Scanner s1= new Scanner(System.in);
		int a1=s1.nextInt();
		boolean b1=s1.nextBoolean(); //If incorrect input is given it throws java.util.InputMismatchException 
		
		System.out.println("Integer value:"+a1);
		System.out.println("Boolean vale:" +b1);

	}

}
