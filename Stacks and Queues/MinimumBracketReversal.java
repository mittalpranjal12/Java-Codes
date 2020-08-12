package stacksAndQueues;

import java.util.Scanner;
import java.util.Stack;

public class MinimumBracketReversal {

	public static int countBracketReversals(String input)
	{
		if(input.length() == 0)
			return 0;
		
		if(input.length() % 2 != 0)
			return -1;
		
		Stack<Character> stack = new Stack<Character>();
		
		for(int i = 0; i< input.length(); i++)
		{
			if(input.charAt(i) == '{')
			{
				stack.push(input.charAt(i));
			}
			else 
			{
				if( !stack.isEmpty() && stack.peek() == '{')
					stack.pop();
				else 
					stack.push(input.charAt(i));
			}
		}
		int count = 0;

		while( !stack.isEmpty())
		{
			char c1 = stack.pop();
			char c2 = stack.pop();

			if(c1 == c2)
			{
				count++;
			}
			else
				count = count+2;
		}
		return count;
	}

	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {

		String str = s.nextLine();
		System.out.println(countBracketReversals(str));

	}
}
