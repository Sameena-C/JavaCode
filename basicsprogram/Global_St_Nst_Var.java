/*
 Program on updating static and non static global variable. 
 */

package basicsprogram;

public class Global_St_Nst_Var {
	int a=10; //Non static global variable
	static double b=20; //static global variable

	public static void main(String[] args) {
		b=30; //Updated static global variable
		System.out.println(b);
		Global_St_Nst_Var g1=new Global_St_Nst_Var();
		System.out.println(g1.a);
		g1.a=100; //Updated non static global variable
		System.out.println(g1.a);
	}

}
