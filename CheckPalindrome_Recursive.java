package Recursion;

import java.util.Scanner;

public class CheckPalindrome_Recursive {

	public static boolean isStringPalindrome(String input, int start, int end)
	{
		if(start == end)
			return true;
		
		if(input.charAt(start) != input.charAt(end))
			return false;
		
		if(start < end + 1)
			return isStringPalindrome(input,start+1, end-1);
		
		return true;
		
	}
	
	public static boolean isStringPalindrome(String input)
	{
		int start = 0;
		int end = input.length()-1;
		return isStringPalindrome(input,start,end);
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(isStringPalindrome(input));
		s.close();
	}

}
