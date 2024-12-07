/*
 Program on Method Overloading
 */
package basicsprogram;

public class Method_Overloading {
	static void add()
	{
		System.out.println("Non para Static method");
	}
	
	static void add(int a)
	{
		System.out.println("Para Static method");
	}
	void add(double a)
	{
		System.out.println("Para Non Static method");
	}
	/*//Duplicate method so will throw Compile time error either 1st or this is allowed
	void add()
	{
		System.out.println("Non para Non Static method");
	}
	*/
	public static void main(String[] args) 
	{
	add();
	add(90);
	add(0);
	add();
	Method_Overloading m1=new Method_Overloading();
	m1.add(23.5);
	m1.add(0.5);
	//m1.add(); //calling Non para Non Static method

	}

}
