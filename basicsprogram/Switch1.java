/*
 Program on Switch syntax 1
 */
package basicsprogram;

public class Switch1 {

	public static void main(String[] args) 
	{
		int a=3;
		switch(a)
		{
		case 1:
			System.out.println("Chrome Browser is launched");
			break;
			
		case 2:
			System.out.println("Mozilla Browser is launched");
			break;
			
		case 3:
			System.out.println("Edge Browser is launched");
			break;
			
		case 4:
			System.out.println("IE Browser is launched");
			break;
			
			default:
				System.out.println("Your selection is incorrect. "
						+ "Kindly press 1, 2, 3, or 4 only");
		}
	}

}
