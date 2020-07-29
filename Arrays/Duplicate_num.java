// You have been given an integer array/list(ARR) of size N which contains numbers from 0 to (N - 2). Each number is present at least once. That is, if N = 5, 
// the array/list constitutes values ranging from 0 to 3 and among these, there is a single integer value that is present twice.
// You need to find and return that duplicate number present in the array.
// Input:
// 1
// 9
// 0 7 2 5 4 7 1 3 6
// Output:
// 7
	
package arrays;

import java.util.Scanner;

public class Duplicate_num {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int input[] = new int[n];
		
		// input numbers
		for(int i = 0; i< n; i++) {
			input[i] = s.nextInt();
		}
		
		for(int i = 0; i < input.length - 1; i++)
		{
			int j;
			for(j = i + 1; j < input.length; j++)
			{
				if(input[i] == input[j])
				{
					System.out.println(input[j] + " ");
				}
			}
			
		}
		s.close();
	}

}
