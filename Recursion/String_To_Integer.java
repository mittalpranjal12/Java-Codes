// Write a recursive function to convert a given string into the number it represents. 
// That is input will be a numeric string that contains only numbers, you need to convert the string into corresponding integer and return the answer.
// Input:
// 1231
// Output:
// 1231

package Recursion;

import java.util.Scanner;

public class String_To_Integer {

	public static int convertStringToInt(String input)
	{
		int b = input.charAt(0) - 48;
		if(input.length() == 1)
			return b;
		
		return (b*(int)Math.pow(10,input.length()-1) + convertStringToInt(input.substring(1)));
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(convertStringToInt(input));
		s.close();
	}

}
