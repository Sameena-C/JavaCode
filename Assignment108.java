/*
 "Assignment 108
write a program on Size method 
in the Collection class."
 */
package assignments;

import java.util.ArrayList;
import java.util.Collection;

public class Assignment108 {

	public static void main(String[] args) 
	{
		Collection c1=new ArrayList();
		c1.add("Science");
		c1.add("Maths");
		c1.add("English");
		c1.add("Hindi");
		System.out.println(c1);
		System.out.println(c1.size());
		

	}

}
