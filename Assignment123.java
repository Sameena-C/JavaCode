/*
  "Assignment 123
Write a program on Iteration methods 
in the Map Interface using For Each Loop Concept.
1.keySet().
2.values().
3.entrySet()."

 */
package assignments;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Assignment123 {

	public static void main(String[] args) 
	{
		Map<String, String> m1=new HashMap<String, String>();
		m1.put("Almonds", "dryfruit");
		m1.put("Chocolate", "Sweet");
		m1.put("Orange", "Juice");
		m1.put("Puff", "Snacks");
		m1.put("Water", "Liquid");
		System.out.println(m1);
		
		System.out.println(m1.keySet());
		System.out.println("Fetching Keys:");
		for(String s1:m1.keySet())
		{
			System.out.println(s1);
		}
		
		System.out.println(m1.values());
		System.out.println("Fetching Values:");
		for(String s2:m1.values())
		{
			System.out.println(s2);
		}
		
		System.out.println(m1.entrySet());
		System.out.println("Fetching Key Value pairs:");
		for(Entry<String, String> s3: m1.entrySet())
		{
			System.out.println(s3);
		}

	}

}
