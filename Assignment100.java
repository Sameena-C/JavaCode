/*
 "Assignment 100
Write a Program on add method 
in the collection class with heterogeneous Values."
 */
package assignments;

import java.util.ArrayList;
import java.util.Collection;

public class Assignment100 {

	public static void main(String[] args) 
	{
		Collection c1=new ArrayList();
		c1.add("Kiwi");
		c1.add(78);
		c1.add(11.9);
		c1.add('u');
		c1.add(true);
		System.out.println(c1);

	}

}
