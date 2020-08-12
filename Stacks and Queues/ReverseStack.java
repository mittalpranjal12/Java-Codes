package stacksAndQueues;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStack {

	public static void reverseStack(Stack<Integer> s1, Stack<Integer> s2)
	{
		if(s1.size() <= 1)
			return;
		
		int x = s1.pop();
		
		reverseStack(s1, s2);
		
		while( !s1.isEmpty())
		{
			int a = s1.pop();
			s2.push(a);
		}
		
		s1.push(x);
		while(!s2.isEmpty())
		{
				int b = s2.pop();
				s1.push(b);
		}
	}
	
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		int size = s.nextInt();
		
		Stack<Integer> input = new Stack<Integer>();
		for(int i = 0; i < size; i++) 
		{
			input.push(s.nextInt());
		}
		Stack<Integer> extra = new Stack<Integer>();
		reverseStack(input, extra);
		while(!input.isEmpty())
		{
			System.out.print(input.pop() + " ");
		}
	}
}