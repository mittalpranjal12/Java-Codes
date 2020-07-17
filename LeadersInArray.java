// Given an integer array A of size n. Find and print all the leaders present in the input array. An array element A[i] is called Leader, 
// if all the elements following it (i.e. present at its right) are less than or equal to A[i].
// Print all the leader elements separated by space and in the same order they are present in the input array.
// Input 1 :
// 6
// 3 12 34 2 0 -1
// Output 1 :
// 34 2 0 -1
// Input 2 :
// 5
// 13 17 5 4 6
// Output 2 :
// 17 6

package strings_and_2DArrays;

import java.util.Scanner;

public class LeadersInArray {

	public static void leaders(int[] input)
	{
		int size = input.length;
		
		for(int i = 0; i < size; i++)
		{
			int j = i + 1;
			for( ; j < size; j++)
			{
				if(input[j] > input[i])
					break;
			}
			
			if(j == size)
				System.out.print(input[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++){
			input[i] = s.nextInt();
		}
		leaders(input);
		s.close();
	}

}
