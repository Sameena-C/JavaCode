/*
 "Assignment 89
check if the given string starts with 'a'

string "axe"
 */
package assignments;

public class Assignment89 {

	public static void main(String[] args) 
	{
		String a="axe";
		System.out.println(a.matches("a.."));
		
		System.out.println(a.matches("a(.*)"));

	}

}
