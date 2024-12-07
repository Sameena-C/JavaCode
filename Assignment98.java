/*
 "Assignment 98
Write a program to find out 
Current time
Future Time
Past time"
 */
package assignments;

import java.util.Date;

public class Assignment98 {

	public static void main(String[] args) 
	{
		Date d1=new Date();
		System.out.println(d1.getTime());
		
		Date d2=new Date(d1.getTime());
		System.out.println(d2);
		
		String humantime=d2.toString();
		System.out.println(humantime);
		
		String month=humantime.substring(4, 7);
		System.out.println(month);
		
		String date=humantime.substring(8, 10);
		System.out.println(date);
		
		String year=humantime.substring(humantime.length()-4);
		System.out.println(year);
		
		/*Current date*/
		String format1=date.concat(" ").concat(month).concat(" ").concat(year);
		System.out.println("Current date: "+format1);
		
		/*Future date*/
		Date d3=new Date(d1.getTime() + (1000*60*60*24*1));
		System.out.println(d3);
		
		String humantime1=d3.toString();
		System.out.println(humantime1);
		
		String month1=humantime1.substring(4, 7);
		System.out.println(month1);
		
		String date1=humantime1.substring(8, 10);
		System.out.println(date1);
		
		String year1=humantime1.substring(humantime1.length()-4);
		System.out.println(year1);
		
		String format2=date1.concat(" ").concat(month1).concat(" ").concat(year1);
		System.out.println("Future date: "+format2);
		
		/*Past date*/
		Date d4=new Date(d1.getTime() - (1000*60*60*24*1));
		System.out.println(d4);
		
		String humantime3=d4.toString();
		System.out.println(humantime3);
		
		String month3=humantime3.substring(4, 7);
		System.out.println(month3);
		
		String date3=humantime3.substring(8, 10);
		System.out.println(date3);
		
		String year3=humantime3.substring(humantime3.length()-4);
		System.out.println(year3);
		
		String format3=date3.concat(" ").concat(month3).concat(" ").concat(year3);
		System.out.println("Past date: "+format3);
		

	}

}
