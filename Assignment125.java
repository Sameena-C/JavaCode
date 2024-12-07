/*
  "Assignment 125
Write a program on Get() method in the Map Interface."

 */
package assignments;

import java.util.HashMap;
import java.util.Map;

public class Assignment125 {

	public static void main(String[] args) 
	{
		Map<String, Double> m1=new HashMap<String, Double>();
		m1.put("Sarita", 56.2);
		m1.put("Reshma", 76.4);
		m1.put("Abhishek", 87.6);
		m1.put("Deeraj", 96.2);
		m1.put("Rita", 42.6);
		System.out.println(m1);
		
		System.out.println(m1.get("Deeraj")); //96.2
		
		System.out.println(m1.get("Ashok")); //null

	}

}
