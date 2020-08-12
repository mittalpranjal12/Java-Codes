package stacksAndQueues;

import java.util.Scanner;
import java.util.Stack;

public class StockSpan {
	static Scanner s = new Scanner(System.in);

	public static int[] stockSpan(int[] price)
	{
		int arr[] = new int[price.length];
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(0);
		arr[0] = 1;
		
		
		for(int i = 1; i < price.length; i++)
		{
			while( !stack.isEmpty() && price[stack.peek()] < price[i])
				stack.pop();
			
			arr[i] = (stack.isEmpty() ? i+1 : i - stack.peek());
					
			stack.push(i);
		}
		return arr;
	}
	
	public static void main(String[] args)
	{
		int size = s.nextInt();
		int[] input = new int[size];
		
		for(int i = 0; i < size; i++)
		{
			input[i] = s.nextInt();
		}
		
		int output[] = stockSpan(input);
		for(int i = 0; i < size; i++) 
		{
			System.out.print(output[i] + " ");
		}
	}
}
