/*
 "Assignment 116
Write a program using the put() method with 
String, String parameters in the Map Interface."
*/

package assignments;

import java.util.HashMap;
import java.util.Map;

public class Assignment116 {

	public static void main(String[] args) 
	{
		Map<String, String> m1=new HashMap<String, String>();
		m1.put("Anu", "Gtm089");
		m1.put("Suraj", "Gtm076");
		m1.put("Jyoti", "Gtm034");
		m1.put("Rashmi", "Gtm058");
		System.out.println(m1);
	}

}
