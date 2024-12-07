/*
 "Assignment 68
Write a program with different string function 
mentioned below

Length
tolowercase
touppercase
trim
charAt(index)
indexof(char)
substring(start index)
substring(start index, end index)
equals
contains
equalsIgnoreCase

 */
package assignments;

public class Assignment68 {

	public static void main(String[] args) 
	{
		String a="Sameena"; 
		System.out.println(a);
		System.out.println(a.length());
		
		String name="Automation";
		System.out.println(name.toUpperCase());
		
		String name1="Automation Testing with Selenium";
		System.out.println(name1.toLowerCase());
		
		String name2=" This is         Java       ";
		System.out.println(name2);
		System.out.println(name2.trim());
		
		String a1="australia";
		System.out.println(a1.charAt(0));
		System.out.println(a1.charAt(6));
		
		System.out.println(a1.indexOf('s'));
		
		String a2="bangalore";
		System.out.println(a2.substring(2)); 
		System.out.println(a2.substring(5)); 
		
		System.out.println(a2.substring(1, 3)); 
		System.out.println(a2.substring(1, 7));
		
		String c1="Automation";
		System.out.println(c1.equals("Testing")); //false complete mismatch
		
		System.out.println(c1.equals("automation")); //false a is in lower case
		
		System.out.println(c1.equals("Automation ")); //false as space is present
		
		System.out.println(c1.equals("Automation")); //true as it is matching completely

		System.out.println(c1.contains("Auto")); //true
		
		System.out.println(c1.contains("Test")); //false
		
		System.out.println(c1.contains("automation")); //false as a is in lower case
	
		System.out.println(c1.equalsIgnoreCase(" Automation"));//false because space is present
		
		System.out.println(c1.equalsIgnoreCase("automation")); //true case is ignored 
	
		
		

	}

}
