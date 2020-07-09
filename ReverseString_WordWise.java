package strings_and_2DArrays;

import java.util.Scanner;

public class ReverseString_WordWise {

	public static String reverseWordWise(String input)
	{
		int i = input.length()-1;
		String ans = "";
		
		while(i >= 0)
		{
			while(i >= 0 && input.charAt(i) == ' ')
				i--;
			
			int j = i;
			
			if(i < 0)
				break;
			
			while(i >= 0 && input.charAt(i) != ' ')
				i--;
			if(ans.isEmpty())
				ans = ans.concat(input.substring(i+1, j+1));
			else
				ans = ans.concat(" " + input.substring(i+1, j+1));
			
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(ReverseString_WordWise.reverseWordWise(input));
		s.close();
	}

}
