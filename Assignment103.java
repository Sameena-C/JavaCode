/*
 "Assignment 103
write a program on isempty method
 in the Collection class."
 */
package assignments;

import java.util.ArrayList;
import java.util.Collection;

public class Assignment103 {

	public static void main(String[] args) 
	{
		Collection c1=new ArrayList();
		c1.add("Axe");
		c1.add("Bag");
		c1.add("Cot");
		c1.clear();
		System.out.println(c1.isEmpty());
		

	}

}
