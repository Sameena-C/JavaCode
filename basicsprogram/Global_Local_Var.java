/*
 Program on Local & Global Variable
 */
package basicsprogram;

public class Global_Local_Var {
	static int a=100; //Global variable
	public static void main(String[] args) {
		a=200; //Global variable update
		
		int a=10; //Local variable
		
		System.out.println(a);

	}

}
