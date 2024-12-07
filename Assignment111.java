/*
 "Assignment 111
write a program on List Interface for ListIterator() of 
forward Iteration and Backward Iteration and Iterator() also."
 */
package assignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Assignment111 {

	public static void main(String[] args) 
	{
		List l1=new ArrayList();
		l1.add("Air");
		l1.add(12.4567);
		l1.add(true);
		l1.add('J');
		l1.add(78);
		System.out.println(l1);
		
		Iterator i1=l1.iterator();
		System.out.println("Using Iterator: Only Forward Iteration");
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		ListIterator i2=l1.listIterator();
		System.out.println("Using ListIterator: Forward Iteration");
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		
		System.out.println("Using ListIterator: Backward Iteration");
		while(i2.hasPrevious())
		{
			System.out.println(i2.previous());
		}
	
	}

}
