/*
 Program on Constructor Overloading
 */
package basicsprogram;

public class Amazon 
{
	Amazon()
	{
		System.out.println("Constructor 1");
	}
	Amazon(int a)
	{
		System.out.println("Constructor 2");
	}
	Amazon(int a, double b, String c)
	{
		System.out.println("Constructor 3");
	}
	public static void main(String[] args) 
	{
		new Amazon();		//calling constructor with 1 way
		Amazon a1=new Amazon(); //calling constructor in another way
		
		new Amazon(10);
		Amazon ab=new Amazon(90);
		
		new Amazon(2,3.7,"Java");
		Amazon abc=new Amazon(10,20,"Company");
		
	}

}
