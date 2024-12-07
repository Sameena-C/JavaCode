/*
 "Assignment 140
Write a program on encapsulation "
 */
package assignments;

class Pgm
{
	void payment(int dc, int cvv)
	{
		System.out.println("Paid using Debit card");
	}
		
}

public class Assignment140 extends Pgm
{
	void payment(int cc, int cvv)
	{
		System.out.println("Paid using Credit card");
	}
	
	public static void main(String[] args) 
	{
		/*Parent class method is called*/
		Pgm a1=new Pgm();
		a1.payment(4532, 328);
		
		/*Child class method is called*/
		Assignment140 a2=new Assignment140();
		a2.payment(5678, 743);
		
		
				
	}
}
