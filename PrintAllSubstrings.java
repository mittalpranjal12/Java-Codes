// Given a String S of length n, print all its substrings.
// Substring of a String S is a part of S (of any length from 1 to n), which contains all consecutive characters from S.
// Input :
// xyz
// Output :
// x
// xy
// xyz
// y
// yz
// z

package strings_and_2DArrays;

import java.util.Scanner;

public class PrintAllSubstrings {

	public static void printSubstrings(String str)
	{
		int i = 0;
		while(i < str.length())
		{
			int j = i;
			while(j < str.length())
			{
				System.out.println(str.substring(i , j + 1));
				j++;
			}
			i++;
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		PrintAllSubstrings.printSubstrings(str);
		
		s.close();
	}

}
