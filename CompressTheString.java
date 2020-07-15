// Write a program to do basic string compression. For a character which is consecutively repeated more than once, 
// replace consecutive duplicate occurrences with the count of repetitions.
// For e.g. if a String has 'x' repeated 5 times, replace this "xxxxx" with "x5".
// Note : Consecutive count of every character in input string is less than equal to 9.
//  Input :
// aaabbccdsa
//  Output:
// a3b2c2dsa


package strings_and_2DArrays;

import java.util.Scanner;

public class CompressTheString {

	public static String compress(String inputString)
	{
		String x = "";
		
		for(int i = 0; i < inputString.length(); i++)
		{
			int count = 0;
			
			while((i < inputString.length()-1) && inputString.charAt(i) == inputString.charAt(i + 1))
			{
				count++;
				i++;
			}
			
			if(count++ >= 1)
			{
				x = x + inputString.charAt(i) + count;
			}
			else
			{
				x = x + inputString.charAt(i);
			}
		}
		
		return x;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(CompressTheString.compress(input));
		s.close();
	}

}
