/*
 "Assignment 101
write a program on 
add All method in the Collection class ."
 */
package assignments;

import java.util.ArrayList;
import java.util.Collection;

public class Assignment101 {

	public static void main(String[] args) 
	{
		Collection c1=new ArrayList();
		c1.add("Apple");
		c1.add("Pears");
		c1.add("Melon");
		c1.add("Guava");
		System.out.println(c1);
		Collection c2=new ArrayList();
		c2.addAll(c1);
		c2.add("Mango");
		c2.add("Orange");
		System.out.println(c2);

	}

}
