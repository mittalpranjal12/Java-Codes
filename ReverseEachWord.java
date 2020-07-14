package strings_and_2DArrays;

import java.util.Scanner;

public class ReverseEachWord {

	public static String reverseEachWord(String input)
	{
		//int i = 0;
		//int j = 0;
		String ans = "";
		
		for(int j = 0; j < input.length(); j++)
		{
			for(int i = 0; i < input.length(); i++)
			{
				if(input.charAt(i) != ' ')
				{
					continue;
				}
				
				else if(input.charAt(i) == ' ')
				{
					//j = i;
					for(int k = j; k < i; k++)
					{
						ans = ans + input.charAt(i - k - 1);
					}
						System.out.print(" ");
						i++;
						j = i;
						break;
				}
				//i++;
			}
		}
//		while(i < input.length())
//		{
//			//j = i;
//			if(input.charAt(i) != ' ')
//			{
//				i++;
//			}
//			
//			else if(input.charAt(i) == ' ')
//			{
//				//j = i;
//				for(int k = j; k < i; k++)
//				{
//					ans = ans + input.charAt(i - k - 1);
//				}
//					System.out.print(" ");
//			}
//			i++;
//		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(ReverseEachWord.reverseEachWord(input));
		s.close();
	}

}
