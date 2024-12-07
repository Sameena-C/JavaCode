/*
 Program to perform addition, subtraction, multiplication, 
 division, modulus using Scanner class; Using only 2 variables
 without involving 3rd variable
 
 */
package basicsprogram;

import java.util.Scanner;

public class Scanner_Arithmetic_Op {

	public static void main(String[] args) {

		Scanner s1=new Scanner(System.in);
		System.out.println("Enter first number:");
		double a=s1.nextDouble();
		System.out.println("Enter second number:");
		double b=s1.nextDouble();
		
		double Add=a+b;
		double Sub=a-b;
		double Mul=a*b;
		double Div=a/b;
		double Mod=a%b;
		
		System.out.println("Addition of 2 numbers:"+Add);
		System.out.println("Subtraction of 2 numbers:"+Sub);
		System.out.println("Multiplication of 2 numbers:"+Mul);
		System.out.println("Division of 2 numbers:"+Div);
		System.out.println("Modulus of 2 numbers:"+Mod);
		
		
	}

}
