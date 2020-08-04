// You have been given a random integer array/list(ARR) of size N, and an integer X. You need to search for the integer X in the given array/list using 'Linear Search'.
//  You have been required to return the index at which X is present in the array/list. If X has multiple occurrences in the array/list, then you need to return the index at 
//  which the first occurrence of X would be encountered. In case X is not present in the array/list, then return -1.
// 'Linear search' is a method for finding an element within an array/list. It sequentially checks each element of the array/list until a match is
// found or the whole array/list has been searched.
// Input:
// 1
// 7
// 2 13 4 1 3 6 28
// 3
// Output:
// 4

package arrays;

import java.util.Scanner;

public class Linear_search {

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
	
	public static int linearsearch( int input[], int num) {

		int size = input.length;
		for(int i = 0; i < size; i++) {
			if(input[i] == num)
				return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr [] = takeInput();
		//System.out.println("Enter the number to be searched: ");
		
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int ans = linearsearch(arr,num);
		System.out.println(ans);
		s.close();
	}

}
