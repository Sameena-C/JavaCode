/*
 "Assignment 79
Write a program on all the Methods of 
String Functions from length() to till toCharArray()"
 */
package assignments;

import java.util.Arrays;

public class Assignment79 {

	public static void main(String[] args) 
	{
		String a=" Thursday   ";
		System.out.println(a.length());
		
		String a1="jaVa is PlatFRom iNdePENDENT langauage";
		System.out.println(a1.toLowerCase());
		System.out.println(a1.toUpperCase());
		
		String a2="           Software    Testing    ";
		System.out.println(a2.trim());
		
		String a3="India is My Country";
		System.out.println(a3.charAt(16));
		System.out.println(a3.indexOf('i'));
		
		System.out.println(a3.substring(5));
		System.out.println(a3.substring(6, 14));
		
		String a4="Bangalore";
		System.out.println(a4.equals("bangalore"));
		System.out.println(a4.equalsIgnoreCase("banGALorE"));
		
		System.out.println(a4.contains("gal"));
		
		char[] c1=a4.toCharArray();
		System.out.println(Arrays.toString(c1));
		

	}

}
