// Given an array of length N, you need to find and return the sum of all elements of the array.
// Do this recursively.
// Input :
// 3
// 9 8 9
// Output :
// 26

package Recursion;

import java.util.Scanner;

public class SumOfArrays {
	
	private static int sum(int input[], int startIndex)
	{
		if(startIndex <= 0)
			return 0;
		
		return (sum(input, startIndex - 1) + input[startIndex - 1]);
	}
	
	public static int sum(int input[])
	{
		return sum(input,input.length);
	}

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		System.out.println(sum(input));
	}

}

