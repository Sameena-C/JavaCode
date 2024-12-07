/*
 Assignment 87
Write a program to replace all the numeric  
with nothing in the string "Kv No 2"
 */
package assignments;

public class Assignment87 {

	public static void main(String[] args) 
	{
		String a="Kv No 2";
		System.out.println(a.replaceAll("[0-9]", ""));

	}

}
