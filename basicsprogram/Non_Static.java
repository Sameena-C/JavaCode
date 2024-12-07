/*
 Program to create and access Non static method
 */

package basicsprogram;

public class Non_Static 
{
	void login()
	{
		System.out.println("Login with e-mail id");
	}
	void logout()
	{
		System.out.println("Logout");
	}

	public static void main(String[] args) 
	{
		Non_Static m1=new Non_Static();
		m1.login();
		m1.logout();
	}

}
