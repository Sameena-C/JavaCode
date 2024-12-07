/*
 Program on Math class
 */

package basicsprogram;

public class MathClass
{
	final static double pi_value= Math.PI;
	
	public static void main(String[] args) 
	{
		
		System.out.println(Math.addExact(10, 100));
		System.out.println(Math.subtractExact(67890, 7890));
		System.out.println(Math.multiplyExact(7, 60));
		System.out.println(Math.divideExact(55, 2));
		
		System.out.println(Math.max(2000, 500));
		System.out.println(Math.min(-789, pi_value));
		
		System.out.println(Math.abs(-9.8));
		
		System.out.println(pi_value);
		
		System.out.println(Math.random());
	}

}
