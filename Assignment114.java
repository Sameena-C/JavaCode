/*
 Assignment 114
Write a program on sort method 
in collection class for integer values 

 */
package assignments;

import java.util.ArrayList;
import java.util.Collections;

public class Assignment114 {

	public static void main(String[] args) 
	{
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(54);
		a1.add(41);
		a1.add(78);
		a1.add(15);
		a1.add(891);
		a1.add(0);
		a1.add(-10);
		System.out.println("Before sorting: "+a1);
		Collections.sort(a1);
		System.out.println("After sorting: "+a1);


	}

}
