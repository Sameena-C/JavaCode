/*
 "Assignment 136
Write a program on subString() method 
using StringBuffer Class"
 */
package assignments;

public class Assignment136 {

	public static void main(String[] args) 
	{
		StringBuffer s=new StringBuffer("StringBuffer is mutable");
		System.out.println(s.substring(16));
		System.out.println(s.substring(16, 23));
		System.out.println(s.substring(16, s.length()));
		

	}

}
