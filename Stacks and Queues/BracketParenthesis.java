package stacksAndQueues;

import java.util.Scanner;
import java.util.Stack;

public class BracketParenthesis {
	
		static Scanner s = new Scanner(System.in);
		
		public static boolean checkBalanced(String exp)
		{
			Stack<Character> stack = new Stack<>();
			
			for(int i = 0; i < exp.length(); i++)
			{
				if(exp.charAt(i) ==  '[' || exp.charAt(i) ==  '{' || exp.charAt(i) ==  '(')
				{
					stack.push(exp.charAt(i));
				}
				if(exp.charAt(i) ==  ']' || exp.charAt(i) ==  '}' || exp.charAt(i) ==  ')')
				{
					if(stack.isEmpty())
						return false;
					else if(!isMatchingPair(stack.pop(), exp.charAt(i)))
						return false;
				}
			}
			if(stack.isEmpty())
				return true;
			else
				return false;
		}
		
		static boolean isMatchingPair(char character1, char character2) 
	    { 
	       if (character1 == '(' && character2 == ')') 
	         return true; 
	       else if (character1 == '{' && character2 == '}') 
	         return true; 
	       else if (character1 == '[' && character2 == ']') 
	         return true; 
	       else
	         return false; 
	    } 
		
		public static void main(String[] args) {
			String input = s.nextLine();
			System.out.println(checkBalanced(input));
		}
	}

