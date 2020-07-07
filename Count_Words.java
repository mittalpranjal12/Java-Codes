// Given a string S, count number of words in the string.
// Input:
// this is a sample string
// Output:
// 5

package strings_and_2DArrays;

import java.util.Scanner;

public class Count_Words {

static Scanner s = new Scanner(System.in);
	
		public static int countWords(String str)
		{
			int count = 1;
			for(int i = 0; i< str.length(); i++)
			{
				if(str.charAt(i) == ' ')
				{
					count++;
				}
			}
			return count;
		}
	
		
		public static void main(String[] args) {
		String str = s.nextLine();
		System.out.println(Count_Words.countWords(str));
	}

}
