/*
 "Assignment 102
Write a Program on Clear method 
in the collection class."
 */
package assignments;

import java.util.ArrayList;
import java.util.Collection;

public class Assignment102 {

	public static void main(String[] args) 
	{

		Collection c2=new ArrayList();
		c2.add(false);
		c2.add(12.56);
		c2.add('h');
		
		c2.clear();
		System.out.println(c2);
		


	}

}
