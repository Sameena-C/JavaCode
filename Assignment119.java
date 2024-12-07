/*
 "Assignment 119
Write a program to print name and Salary 
using the put() method in the Map Interface."

 Program on Map interface
 Name and Salary of an Employee 
 <String, Double>
 */
package assignments;

import java.util.HashMap;
import java.util.Map;

public class Assignment119 {

	public static void main(String[] args) 
	{
		Map<String, Double> m1=new HashMap<String, Double>();
		m1.put("Prem", 10000.678);
		m1.put("Preeti", 20000.500);
		m1.put("Ashok", 15000.670);
		m1.put("Sid", 22005.907);
		System.out.println(m1);

	}

}
