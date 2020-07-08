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
