/*
 "Assignment 81
Write a program to calculate average value of below array element
[5,8,16,20,5]"
 */
package assignments;

public class Assignment81 {

	public static void main(String[] args) 
	{
		double input[]=new double[5];
			   input[0]=5;
			   input[1]=8;
			   input[2]=16;
			   input[3]=20;
			   input[4]=5;
		double sum=0;
		for(int i=0;i<input.length;i++)
		{
			sum=sum+input[i];
		}
		System.out.println("Total sum is:"+sum);
		double Avg=sum/input.length;
		System.out.println("Average Value:"+Avg);
	
	}

}
