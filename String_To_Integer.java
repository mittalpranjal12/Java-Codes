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
