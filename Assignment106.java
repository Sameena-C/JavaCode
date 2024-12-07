/*
 "Assignment 106
write a program on Remove method 
in the Collection class."
 */
package assignments;

import java.util.ArrayList;
import java.util.Collection;

public class Assignment106 {

	public static void main(String[] args) 
	{
		Collection c1=new ArrayList();
		c1.add("car");
		c1.add("bus");
		c1.add("jeep");
		c1.add("van");
		c1.add("truck");
		System.out.println(c1);
		System.out.println(c1.remove("van"));
		System.out.println(c1);

	}

}
