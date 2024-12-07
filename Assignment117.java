/*
 "Assignment 117
Write a program using the put() method 
with Object, Object parameters in the Map Interface."

 */
package assignments;

import java.util.HashMap;
import java.util.Map;

public class Assignment117 {

	public static void main(String[] args) 
	{
		Map<String,Integer> m1=new HashMap<String,Integer>();
		m1.put("Rice", 10);
		m1.put("Salt", 1);
		m1.put("Wheat", 15);
		m1.put("Jaggery", 5);
		m1.put("Sugar", 2);
		System.out.println(m1);
		
		Map<Object,Object> m2=new HashMap<Object,Object>();
		m2.put("Onion", 10);
		m2.put(true, 11.5);
		m2.put('h', null);
		m2.put(-123.56, "Abc");
		m2.put("*&^%", 12);
		System.out.println(m2);
	}

}
