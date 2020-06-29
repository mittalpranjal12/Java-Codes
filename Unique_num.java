// You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1].
// Now, in the given array/list, 'M' numbers are present twice and one number is present only once.
// You need to find and return that number which is unique in the array/list.
// Input :
// 1
// 7
// 2 3 1 6 3 6 2
// Output:
// 1

package arrays;

import java.util.Scanner;

public class Unique_num {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int input[] = new int[n];
		
		for(int i = 0; i< n; i++) 
		{
			input[i] = s.nextInt();
		}
		
		for(int i = 0; i < input.length; i++)
		{
			int j;
			for(j = 0; j < input.length; j++)
			{
				if(i == j) 
				{
					continue;
				}
				if(input[i] == input[j])
				{
					break;
				}
			}
			
			if(j == input.length)
			{
				System.out.println(input[i] + " ");

			}
		}
		s.close();
	}

}
