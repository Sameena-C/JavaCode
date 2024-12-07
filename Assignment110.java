/*
 "Assignment 110
write a program on List Methods 
from add() to size() in the List Class"
 */
package assignments;

import java.util.ArrayList;
import java.util.List;

public class Assignment110 {

	public static void main(String[] args) 
	{
		List l1=new ArrayList();
		l1.add("Moon");
		l1.add("Sun");
		l1.add("Earth");
		l1.add(true);
		l1.add('k');
		l1.add(156.78);
		l1.add(0);
		l1.add(null);
		l1.add("Sun");
		l1.add(19);
		System.out.println(l1);
		
		System.out.println(l1.contains("Moon"));
		//l1.remove(4);
		//l1.remove(9);
		System.out.println(l1.remove(156.78)); //not working for int & char
		System.out.println(l1);
		
		List l2=new ArrayList();
		l2.addAll(l1);
		l2.add(98);
		l2.add("Water");
		System.out.println(l2);
		
		System.out.println(l2.containsAll(l1));
		
		l2.removeAll(l1);
		System.out.println(l2);
		
		System.out.println(l2.size());
		
		l1.clear();
		System.out.println(l1);
		
		System.out.println(l1.isEmpty());
		
	}

}
