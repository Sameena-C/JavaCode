/*
 "Assignment 121
Write a program using the putIfAbsent() method 
in the Map Interface."

 */
package assignments;

import java.util.HashMap;
import java.util.Map;

public class Assignment121 {

	public static void main(String[] args) 
	{
		Map<String, Integer> m1=new HashMap<String, Integer>();
		m1.put("Rice", 15);
		m1.put("Wheat", 20);
		m1.put("Salt", 1);
		m1.put("Ragi", 5);
		m1.put("Sugar", 2);
		System.out.println(m1);
		
		m1.putIfAbsent("Jowar", 12);
		System.out.println(m1.putIfAbsent("Jowar", 12)); //12
		m1.putIfAbsent("Rice", 10);
		System.out.println(m1.putIfAbsent("Rice", 10));  //15
		System.out.println(m1);

	}

}
