/*
 "Assignment 107
write a program on Remove All method 
in the Collection class."
 */
package assignments;

import java.util.ArrayList;
import java.util.Collection;

public class Assignment107 {

	public static void main(String[] args) 
	{
		Collection c1=new ArrayList();
		c1.add("Cone");
		c1.add("Triangle");
		c1.add("Square");
		System.out.println(c1);
		Collection c2=new ArrayList();
		c2.addAll(c1);
		c2.add("Cube");
		c2.add("Sphere");
		c2.add("Cyclinder");
		System.out.println(c2);
		System.out.println(c2.removeAll(c1));
		System.out.println(c2);

	}

}
