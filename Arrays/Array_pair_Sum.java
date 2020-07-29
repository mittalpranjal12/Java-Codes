// You have been given an integer array/list(ARR) and a number X. Find and return the total number of pairs in the array/list which sum to X.
// Input:
// 1
// 9
// 1 3 6 2 5 4 3 2 4
// 7
// Output:
// 7
	
package arrays;

import java.util.Scanner;

public class Array_pair_Sum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int input[] = new int[n];
		
		// input numbers
		for(int i = 0; i< n; i++) {
			input[i] = s.nextInt();
		}
		
		int sum = s.nextInt();
		
		for(int i = 0; i < input.length -1; i++)
		{
			int j;
			for(j = i + 1;j < input.length; j++)
			{
				if(input[i] + input[j] == sum)
				{
					if(input[i] <= input[j])
					{
						System.out.println(input[i] + " " + input[j]);
					}
					else if(input[j] <= input[i])
					{
						System.out.println(input[j] + " " + input[i]);
					}
				}
			}	
		}
		s.close();
	}

}
