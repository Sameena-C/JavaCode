/*
 Program on continue keyword
 */
package basicsprogram;

public class ContinueKeyword {

	public static void main(String[] args) 
	{
		for(int i=1; i<11; i++)
		{
			//if(i==7)
			//if(i>=7)
			//if(i<=7)
			if(i!=2)
			//if(i==7 || i==9)
			{
				continue;
			}
			System.out.println(i);
		}

	}

}
