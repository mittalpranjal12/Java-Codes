// Given a string S, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*".
// Input :
// hello
// Output:
// hel*lo

package Recursion;

import java.util.Scanner;

public class PairStar {

	public static String addStars(String s)
	{
		if(s.length() <= 1)
			return s;
		
		if(s.charAt(0) == s.charAt(1))
			return s.charAt(0) + "*" + addStars(s.substring(1));
		
		return s.charAt(0) + addStars(s.substring(1));
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(addStars(input));
		s.close();
	}

}
