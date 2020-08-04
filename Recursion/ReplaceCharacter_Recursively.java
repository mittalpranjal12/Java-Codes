// Given an input string S and two characters c1 and c2, you need to replace every occurrence of character c1 with character c2 in the given string.
// Do this recursively.
// Input :
// abacd
// a x
//  Output :
// xbxcd

package Recursion;

import java.util.Scanner;

public class ReplaceCharacter_Recursively {

	public static String replaceCharacter(String input, char c1, char c2)
	{
		if(input.length() <= 0)
			return "";
		
		if(input.charAt(0) != c1)
			return input.charAt(0) + replaceCharacter(input.substring(1),c1,c2);
		
		return c2 + replaceCharacter(input.substring(1),c1,c2);
			
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		char c1 = s.next().charAt(0);
		char c2 = s.next().charAt(0);
		System.out.println(replaceCharacter(input, c1, c2));
		s.close();
	}

}
