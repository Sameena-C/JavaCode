/*
 Program to Parameterized Non-static method
 */
package basicsprogram;

public class Param_Non_Static 
{
	void add(int a, int b)
	{
		System.out.println(a+b);
	}
	void sub(int a, double d)
	{
		System.out.println(d-a);
	}
	void info(String firstname, String Lastname, String Country)
	{
		System.out.println("Details submitted");
		System.out.println(firstname); 
		System.out.println(Lastname); 
		System.out.println(Country);
		System.out.println(firstname+Lastname+Country);
	}
	void ques(boolean a)
	{
		System.out.println("Boolean datatype");
		System.out.println(a);
	}
	public static void main(String[] args) 
	{
		Param_Non_Static a1=new Param_Non_Static();
		a1.add(10, 20);
		a1.sub(600, 1000);
		a1.info(null, null, null);
		a1.info("ABC", "XYZ", "India");
		a1.ques(true); //Only true and false can be mentioned as parameter nothing else, not even null
	}

}
