/*
 Program to find area of circle using Final Variable
 */

package basicsprogram;

public class Final_Var {
    final static double pi=3.142; //Final Variable
    static int r=50; //Global variable
	public static void main(String[] args) 
	{
		r=15; //Updated Global variable
		int r=10; //Local variable
		r=0; //updated local variable  
		double area=pi*r*r;
		System.out.println(area);
	}

}
