/* Program on 
 Parameterized Super calling Constructor
 Assignment 55
 */

package assignments;

class Google3
{
	Google3(String name)
	{
		
		System.out.println("Google Constructor 1");
	}
	
}
public class Google2 extends Google3
{	
	Google2(int a)
	{
		super("Java");
		System.out.println("Google Constructor 2");
	}

	public static void main(String[] args) 
	{
		new Google2(12);
	}

}

