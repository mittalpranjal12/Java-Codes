package TimeAndSpace;

import java.util.Scanner;
import java.util.Arrays;

public class MaximumProfitOnApp {
	
	public static int maximumProfit(int budget[])
	{
		Arrays.sort(budget);
		
		int cost[] = new int[budget.length];
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < budget.length; i++)
		{
			cost[i] = budget[i] * (budget.length-i);
			
			//System.out.println("cost["+i+"] = "+budget[i]+ " * "+ (budget.length-i)+" = "+cost[i]);
		}
		
		//System.out.println();
		
		for(int i = 0; i < cost.length; i++)
		{
			if(cost[i] > max)
			{
				max = cost[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i=0;i<n;i++)
			input[i] = s.nextInt();
		
		System.out.println(maximumProfit(input));
		s.close();
	}

}
