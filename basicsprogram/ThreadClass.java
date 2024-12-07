/*
 Program to print numbers from 1 to 10. 
 Use Thread class to introduce delay while printing
 */ 
package basicsprogram;

public class ThreadClass {

	public static void main(String[] args) throws InterruptedException  {
		for(int i=1; i<=10; i++)
		{
			System.out.println(i);
			Thread.sleep(2000);
			
		}

	}

}
