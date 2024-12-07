/*
"Assignment 115
Write a program on sort method 
in collection class for String values ."
 */
package assignments;

import java.util.ArrayList;
import java.util.Collections;

public class Assignment115 {

	public static void main(String[] args) 
	{
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("rose");
		a1.add("lily");
		a1.add("jasmine");
		a1.add("sunflower");
		a1.add("marigold");
		a1.add("tulips");
		a1.add("hibiscus");
		a1.add("daffodils");
		System.out.println("Before sorting:"+a1);
		Collections.sort(a1);
		System.out.println("After sorting:"+a1);

	}

}
