// Given an array/list(ARR) of length N, you need to find and return the sum of all the elements in the array/list.
// Input: 
// 1
// 3
// 9 8 9
// Output :
// 26

package arrays;

import java.util.Scanner;

public class Array_sum {
	
	public static int [] takeInput() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = s.nextInt();
		int input[] = new int[n];
		
		System.out.println("Enter the numbers in " + n + " array size: ");
		
		for(int i = 0; i< n; i++) {
			input[i] = s.nextInt();
		}
		s.close();
		return input;
	}
	
	public static int sum(int input[]) {
		int sum_arr = 0;
		for(int i = 0; i < input.length; i++) {
			sum_arr = sum_arr + input[i];
		}
		return sum_arr;
	}

	public static void main(String[] args) {
		int arr [] = takeInput();
		int sum_of_arr = sum(arr);
		System.out.println("Sum is: " + sum_of_arr);
		}
}
