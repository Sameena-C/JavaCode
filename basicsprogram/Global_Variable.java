package basicsprogram;

public class Global_Variable 
{
	static double pi=3.14; //global variable
	static int age;
	static boolean answer;
	
	static void abc()
	{
		double area=pi*10*10; //area is local variable
		System.out.println(area);
	}
	public static void main(String[] args) 
	{
		System.out.println(age);
		System.out.println(answer);
		double area1=pi*12*12; //area1 is local variable
		System.out.println(area1);
		abc();
		

	}

}
