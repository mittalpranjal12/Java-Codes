package stacksAndQueues;

import java.util.Scanner;
import java.util.Stack;

public class CheckRedundantBrackets {

	static Scanner s = new Scanner(System.in);

	public static boolean checkRedundantBrackets(String input)
	{
		Stack<Character> stack = new Stack<Character>();

		for(int i = 0; i < input.length(); i++)
		{

			if(input.charAt(i) == ')')
			{
				char top = stack.peek();
				stack.pop();

				int count = 0;
				while(top != '(')
				{
					count++;
					top = stack.peek();
					stack.pop();
				}
				if(count < 1)
					return true;
			}
			else
				stack.push(input.charAt(i));

		}
		return false;
	}

	public static void main(String[] args) {
		String input = s.nextLine();
		System.out.println(checkRedundantBrackets(input));
	}
}
