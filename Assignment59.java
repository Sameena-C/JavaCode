/*
 Assignment 59 Write a program where the non static global variable 
 data type used are same as local variable. 
 Use non static method to use the local variable in method. 
 Use this key word to update the global variable value 
 same as local variable.
 */
package assignments;

public class Assignment59 
{	
	int emp_id;
	char dept;
	String emp_name;
	double salary;
	
	public void emp_details(int emp_id, char dept, String emp_name,
	double salary)
	{
	System.out.println("Employee ID is:"+emp_id);
	System.out.println("Employee dept is:"+dept);
	System.out.println("Employee name is:"+emp_name);
	System.out.println("Employee salary is:"+salary);
	
	this.emp_id=emp_id;
	this.dept=dept;
	this.emp_name=emp_name;
	this.salary=salary;
	
	}
	public static void main(String[] args) 
	{
		Assignment59 a1=new Assignment59();
		a1.emp_details(1076,'A',"Jasmine",900000);
		System.out.println(a1.emp_id);
		System.out.println(a1.dept);
		System.out.println(a1.emp_name);
		System.out.println(a1.salary);
		
	}

}
