/*
 "Assignment 90
Check if the given string ends with 'e'

string "axe" "
 */
package assignments;

public class Assignment90 {

	public static void main(String[] args) 
	{
		String a="axe";
		System.out.println(a.matches("..e"));
		
		System.out.println(a.matches("(.*)e"));

	}

}
