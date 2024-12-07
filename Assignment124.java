/*
  "Assignment 124
 Write a program on Remove() method with Key 
 and Both Key ,Value parameters in the Map Interface."

 */
package assignments;

import java.util.HashMap;
import java.util.Map;

public class Assignment124 {

	public static void main(String[] args) 
	{
		Map<String, Boolean> m1=new HashMap<String, Boolean>();
		m1.put("Suhas", true);
		m1.put("Priya", false);
		m1.put("Rahul", false);
		m1.put("Ashok", true);
		m1.put("Lucky", true);
		m1.put("Arun", false);
		System.out.println(m1);
		
		m1.remove("Lucky");
		System.out.println(m1);
		
		m1.remove("Arun", true);
		System.out.println(m1);
		
		m1.remove("Arun", false);
		System.out.println(m1);
	}

}
