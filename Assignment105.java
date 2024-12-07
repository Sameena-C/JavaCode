/*
 "Assignment 105
write a program on Contains All method 
in the Collection class."
 */
package assignments;

import java.util.ArrayList;
import java.util.Collection;

public class Assignment105 {

	public static void main(String[] args) 
	{
		Collection c1=new ArrayList();
		c1.add("Rose");
		c1.add("Lily");
		c1.add("Jasmine");
		System.out.println(c1);
		Collection c2=new ArrayList();
		c2.addAll(c1);
		c2.add("Mogra");
		c2.add("Lotus");
		c2.add("Marigold");
		c2.add("Sun flower");
		System.out.println(c2);
		System.out.println(c2.containsAll(c1));
		

	}

}
