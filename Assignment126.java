/*
 "Assignment 126
Write a program on Contains() method 
both Key and Values in the Map Interface."

 */
package assignments;

import java.util.HashMap;
import java.util.Map;

public class Assignment126 {

	public static void main(String[] args) 
	{
		Map<String, Integer> m1=new HashMap<String, Integer>();
		m1.put("Harsh", 1500);
		m1.put("Veeresh", 2000);
		m1.put("Manpreet", 1000);
		m1.put("Prash", 5000);
		m1.put("Anu", 2500);
		System.out.println(m1);
		
		System.out.println(m1.containsKey("Anu")); //true
		System.out.println(m1.containsValue(500)); //false
		System.out.println(m1.containsKey("Bina")); //false
		System.out.println(m1.containsValue(2000)); //true
		
	}

}
