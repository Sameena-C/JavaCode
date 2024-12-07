/*
 Write a program to create a class consist of 
 static , Non Static and constructor method and 
 call each of them in a non parameterized way.
 */
package basicsprogram;

public class NS_S_Con {
	static void name()
	{
		System.out.println("Static method");
	}
	
	void country()
	{
		System.out.println("Non static method");
	}

	NS_S_Con()
	{
		System.out.println("Non para Constructor");
	}
	public static void main(String[] args) 
	{
		name();
		
		NS_S_Con n1=new NS_S_Con(); //Non static and Constructor method both will be called and executed
		n1.country();
		
		new NS_S_Con();

	}

}
