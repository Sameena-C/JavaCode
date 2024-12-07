/*
 Assignment 80
write a program to find 
1: Number of Alphabet 
2: Number of Numeric
3: Number of Space
4:Number of Special character
in Given string : "KV no 2"
 */

package assignments;

import java.util.Arrays;

public class Assignment80 {
	static int Countof_Alphabets;
	static int Countof_Numbers;
	static int Countof_Spaces;
	
	public static void main(String[] args) 
	{
		String a="KV no 2";
		char []c1=a.toCharArray();
		System.out.println(Arrays.toString(c1));
		for(int i=0; i<a.length();i++)
		{
		boolean v1=Character.isAlphabetic(c1[i]);
		boolean v2=Character.isDigit(c1[i]);
		boolean v3=Character.isWhitespace(c1[i]);
		if(v1==true)
		{
			Countof_Alphabets++;
		}
		if(v2==true)
		{
			Countof_Numbers++;
		}
		if(v3==true)
		{
			Countof_Spaces++;
		}
		
		}
		System.out.println("Alphabets in given Array are:"+ Countof_Alphabets);
		System.out.println("Numbers in given Array are:"+Countof_Numbers);
		System.out.println("Spaces in given Array are:"+Countof_Spaces);
		
		int Countof_SpecialCharacters = c1.length-(Countof_Alphabets+Countof_Numbers+Countof_Spaces);
		System.out.println("Special Characters in given Array are:"+Countof_SpecialCharacters);
	}

}
