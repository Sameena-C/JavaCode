package assignments;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;


public class Assignment113_TreeSet {

	public static void main(String[] args) 
	{
		TreeSet t1=new TreeSet();
		t1.add("Tea");
		t1.add("Coffee");
		t1.add("milk");
		t1.add("Water");
		t1.add("juice");
		/*t1.add("Tea");
		t1.add("Coffee");
		t1.add("milk");
		t1.add("Water");
		t1.add("juice");
		t1.add("Tea");
		t1.add("Coffee");
		t1.add("milk");
		t1.add("Water");
		t1.add("juice");
		t1.add("Tea");
		t1.add("Coffee");
		t1.add("milk");
		t1.add("Water");
		t1.add("juice");
		t1.add("Tea");
		t1.add("Coffee");
		t1.add("milk");
		t1.add("Water");
		t1.add("juice");
		t1.add("Tea");
		t1.add("Coffee");
		t1.add("milk");
		t1.add("Water");
		t1.add("juice");
		t1.add("Tea");
		t1.add("Coffee");
		t1.add("milk");
		t1.add("Water");
		t1.add("juice");
		t1.add("Tea");
		t1.add("Coffee");
		t1.add("milk");
		t1.add("Water");
		t1.add("juice");
		t1.add("Tea");
		t1.add("Tea");
		t1.add("Coffee");
		t1.add("milk");
		t1.add("Water");
		t1.add("juice");
		t1.add("Coffee");
		t1.add("milk");
		t1.add("Water");
		t1.add("juice");
		t1.add(11);
		t1.add(-907.678);
		t1.add(null);
		t1.add(0);
		t1.add(true);
		t1.add('q');
		t1.add(null);*/
		t1.add("Tea");
		System.out.println(t1);
		//Collections.sort(t1);
		//System.out.println(t1);
		
		Iterator i1=t1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}

}
