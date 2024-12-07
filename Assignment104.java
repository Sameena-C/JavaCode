/*
 "Assignment 104
write a program on Contains method 
in the Collection class."
 */
package assignments;

import java.util.ArrayList;
import java.util.Collection;

public class Assignment104 {

	public static void main(String[] args) 
	{
		Collection c1=new ArrayList();
		c1.add("Onion");
		c1.add("Potato");
		c1.add("Tomato");
		System.out.println(c1.contains("Lemon")); 
	}

}
