/*
 "Assignment 118
Write a program to print name and gender
 using the put() method in the Map Interface."

 Program on Map interface
 Name and Gender[M, F] of a person 
 <String, Character>
 */
package assignments;

import java.util.HashMap;
import java.util.Map;

public class Assignment118 {

	public static void main(String[] args) 
	{
		Map<String, Character> m1=new HashMap<String, Character>();
		m1.put("Adam", 'M');
		m1.put("Eve", 'F');
		m1.put("Eve", 'F'); //no duplicates are allowed
		m1.put("Mary",'F');
		m1.put("John", 'M');
		m1.put("Joseph", 'M');
		m1.put("Moses", 'M');
		System.out.println(m1);
		

	}

}
