/*
 "Assignment 127
  Write a program on clear() and isEmpty() method 
  in the Map Interface."
 */
package assignments;

import java.util.HashMap;
import java.util.Map;

public class Assignment127 {

	public static void main(String[] args)
	{
		Map<String, String> m1=new HashMap<String, String>();
		m1.put("Tina", "Girl");
		m1.put("Ayan", "Boy");
		m1.put("Alex", "Boy");
		m1.put("Pinky", "Girl");
		m1.put("Bunty", "Boy");
		System.out.println(m1);
		
		System.out.println(m1.isEmpty()); //false
		
		m1.clear();
		System.out.println(m1); // {}
		
		System.out.println(m1.isEmpty()); //true
		
	}

}
