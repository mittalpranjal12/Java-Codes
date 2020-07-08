// Given a String s, check it its palindrome. Return true if string is palindrome, else return false.
// Palindrome strings are those, where string s and its reverse is exactly same.
// Input:
// abcdcba
// Output :
// true 
// Input :
// abcd
// Output :
// false

package strings_and_2DArrays;

import java.util.Scanner;

public class Check_Palindrome {
	
	public static boolean checkPalindrome(String str)
	{
		for(int i = 0; i<str.length()/2; i++)
		{
			if(str.charAt(i) != str.charAt(str.length() - i -1))
			{ 
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(Check_Palindrome.checkPalindrome(str));
		s.close();
	}

}
