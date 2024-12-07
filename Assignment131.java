/*
 "Assignment 131
Write a program on replace() method 
using StringBuffer Class"
 */
package assignments;

public class Assignment131 {

	public static void main(String[] args) 
	{
		StringBuffer s=new StringBuffer("Java with Selenium");
					 s.replace(0, 5, "Python ");
					 System.out.println(s);

	}

}
