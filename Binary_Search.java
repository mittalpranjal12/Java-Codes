// You have been given a sorted(in ascending order) integer array/list(ARR) of size N and an element X. Write a function to search this element in the given input array/list 
// using 'Binary Search'. Return the index of the element in the input array/list. In case the element is not present in the array/list, then return -1.
//  Input:
// 7
// 1 3 7 9 11 12 45
// 1
// 3
// Output:
// 1
// Input Format: The first line contains an Integer 'N' which denotes the size of the array/list.
// Second line contains 'N' single space separated integers representing the elements in the array/list.
// Third line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow..
// All the 't' lines henceforth, will take the value of X to be searched for in the array/list.

package searching_and_sorting;

import java.util.Scanner;

public class Binary_Search {

	static Scanner s = new Scanner(System.in);

	//function to take input
	public static int[] takeInput(){
		
		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}
	//end
	
	// function for binary search
	public static int binarySearch(int[] arr, int val)
	{
		
		int start = 0;
		int end = arr.length - 1;
		int mid = (start + end)/2;
		
		while(start <= end)
		{
			mid = (start + end)/2;
			if(arr[mid] == val)
			{
				return mid;
			}
			else if(arr[mid] < val)
			{
				start = mid + 1;
			}
			else if(arr[mid] > val)
			{
				end = mid - 1;
			}
			
		}
		return -1;
	}
	//end
	
	public static void main(String[] args) {
		
		int[] arr = takeInput();
		int val = s.nextInt();
		System.out.println(Binary_Search.binarySearch(arr, val));

	}

}
