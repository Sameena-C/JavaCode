/*
  "Assignment 122
  Write a program using the Equals() method 
 in the Map Interface."

 */
package assignments;

import java.util.HashMap;
import java.util.Map;

public class Assignment122 {

	public static void main(String[] args) 
	{
		Map<Character, String> m1=new HashMap<Character, String>();
		m1.put('A', "Apple");
		m1.put('B', "Ball");
		m1.put('C', "Cat");
		m1.put('D', "Doll");
		m1.put('E', "Elephant");
		System.out.println(m1);
		
		Map m2=new HashMap();
		m2.putAll(m1);
		System.out.println(m2);
		
		System.out.println(m1.equals(m2)); //true
		
		m1.put('F', "Fish");
		boolean b1=m1.equals(m2);
		System.out.println(b1); //false

	}

}
