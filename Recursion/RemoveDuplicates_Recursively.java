// Given a string S, remove consecutive duplicates from it recursively.
// Input 1 :
// aabccba
// Output 1 :
// abcba
// Input 2 :
// xxxyyyzwwzzz
// Output 2 :
// xyzwz

package Recursion;

import java.util.Scanner;

public class RemoveDuplicates_Recursively {
	
static Scanner s = new Scanner(System.in);
	
	public static String removeConsecutiveDuplicates(String s)
	{
		if(s.length() <= 1)
			return s;
		
		if(s.charAt(0) != s.charAt(1))
			return s.charAt(0) + removeConsecutiveDuplicates(s.substring(1));
		
		return removeConsecutiveDuplicates(s.substring(1));
	}
	
	public static void main(String[] args) {
    	String input = s.next();
    	System.out.println(removeConsecutiveDuplicates(input));
    }

}
