/*
 Program on Constructor
 */
package basicsprogram;

public class Const_Sam 
	{
	Const_Sam()
	{
		System.out.println("Constructor");
	}
	public static void main(String[] args) 
	{
		Const_Sam s1=new Const_Sam(); //This is one way to create an object and call constructor
		new Const_Sam(); //This is another way to call constructor
		new Const_Sam();
		new Const_Sam();
		new Const_Sam(); //Can call multiple times
	}

}
