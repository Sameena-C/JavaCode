/*
 Program to print your name 10 times 
 Use Thread class to introduce delay while printing
 */ 
package basicsprogram;


public class ThreadSleep 
{

	public static void main(String[] args) throws InterruptedException 
	{
		for(int i=1; i<=10; i++) 
		{
			System.out.println("SAMEENA");
			Thread.sleep(1000);
		}

	}

}
