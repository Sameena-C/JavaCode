/*
 Program on assert keyword
 */
package basicsprogram;

public class AssertKeyword 
{

	public static void main(String[] args) 
	{
		int age=10;
		//int age=25;
		//assert age>=18;
		assert age>=18:"Sorry your age is less than 18";
		System.out.println("You can Vote");

	}

}
