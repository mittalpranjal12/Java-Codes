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
