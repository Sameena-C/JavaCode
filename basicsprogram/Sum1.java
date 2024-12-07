package basicsprogram;

import java.util.Scanner;

public class Sum1 {

	public static void main(String[] args) 
	{
		double sum=0;
		for(int i=1; i<=4; i++)
		{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter a number:");
		double a=s1.nextDouble();
		sum=sum+a;
		}
		System.out.println(sum);
	}

}
