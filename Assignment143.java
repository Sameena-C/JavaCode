/*
 "Assignment 143
Write a program on primitive type casting for

1) Narrowing: convert double into int
2) Widening:  convert int into double"
*/
package assignments;

public class Assignment143 {

	public static void main(String[] args) 
	{
		double d2=98.6;
		int a2=(int)d2; //explicit narrowing
		System.out.println(a2);
		
		int a=500;
		double d=a; //implicit widening
		System.out.println(d);
		
		double d1=(double)a; //explicit widening
		System.out.println(d1); 
		

	}

}
