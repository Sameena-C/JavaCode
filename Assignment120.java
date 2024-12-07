/*
 Assignment 120
Write a program using the putAll() method with 
Object, Object parameters in the Map Interface.
 */
package assignments;

import java.util.HashMap;
import java.util.Map;

public class Assignment120 {

	public static void main(String[] args) 
	{
		Map<Object, Object> m1=new HashMap<Object, Object>();
		m1.put("Maple", "Tree");
		m1.put("Blue", "Sky");
		m1.put("Water", "Liquid");
		m1.put('E', 2);
		m1.put(true, false);
		m1.put(-32.67, null);
		System.out.println(m1);
		
		Map<Object, Object> m2=new HashMap<Object, Object>();
		m2.putAll(m1);
		
		System.out.println(m2);

	}

}
