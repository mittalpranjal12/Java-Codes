package Recursion;

import java.util.Scanner;

public class Check_AB {

	public static boolean checkAB(String input)
	{
		if(input.length() == 1)
		{
			if(input.charAt(0) == 'a')
				return true;
			else 
				return false;
		}
		
		boolean ans = checkAB(input.substring(0,input.length()-1));
		if(ans == false)
			return ans;
		else
		{
			if (input.charAt(input.length() - 2) == 'a') 
			{
				if (input.charAt(input.length() - 1) == 'a' || input.charAt(input.length() - 1) == 'b')
					return true;
				else
					return false;
			}
			if (input.charAt(input.length() - 2) == 'b') 
			{
				if (input.charAt(input.length() - 3) == 'a')
				{
					if (input.charAt(input.length() - 1) == 'b')
					{
						return true;

					} else
						return false;
				}
				if (input.charAt(input.length() - 3) == 'b') 
				{
					if (input.charAt(input.length() - 1) == 'a')
					{
						return true;

					} else
						return false;
				}

			}
			else
				return false;
	        }
	        return false;
		}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		System.out.println(checkAB(input));
		s.close();
	}

}
