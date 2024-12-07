/*
 "Assignment 95
Write a program where
Input is""Manish Kumar Tiwari""
Output""
M
K
T"
 */
package assignments;

public class Assignment95 {

	public static void main(String[] args) 
	{
		String input="Manish Kumar Tiwari";
		String a=input.replaceAll("[a-z ]", "");
		//System.out.println(a);
		
		System.out.println(a.substring(0,1));
		System.out.println(a.substring(1,2));
		System.out.println(a.substring(2));

	}

}
