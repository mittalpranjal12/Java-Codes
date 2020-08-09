// Given a string S (that can contain multiple words), you need to find the word which has minimum length.
// Note : If multiple words are of same length, then answer will be first minimum length word in the string.
// Words are seperated by single space only.
// Input :
// this is test string
// Output :
// is

package strings_and_2DArrays;

import java.util.Scanner;

public class MinimunLength_Word {

	public static String minLengthWord(String input)
	{
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		String ans[] = input.split(" ");
		int i = 0;
		String largest;
		String smallest;
		largest = smallest = "";
		
		for(i = 0; i < ans.length; i++)
		{
			if(ans[i].length() < min)
			{
				smallest = ans[i];
				min = ans[i].length();
			}
			if(ans[i].length() > max)
			{
				largest = ans[i];
				max = ans[i].length();
			}
		}
		return smallest;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		
		System.out.println(minLengthWord(str));
		s.close();
	}

}
