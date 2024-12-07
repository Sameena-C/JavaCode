/*
 Program on Bus Ticket system in Karnataka
 using Logical Operator &&
 */

package basicsprogram;

public class Logic_Op_AND {

	public static void main(String[] args) {
		//char gender='M';
		char gender='F';
		//int age=4;
		//int age=11;
		//int age=21;
		int age=85;
		
		if(gender=='M' && age>5 && age<12)
		{
			System.out.println("Half Ticket");
		}
		else if(gender=='M' && age>=12 && age<=59)
		{
			System.out.println("Full Ticket");
		}
		else if(gender=='M' && age>59)
		{
			System.out.println("Senior Citizen Ticket");
		}
		else
		{
			System.out.println("No Ticket");
		}
	}

}
