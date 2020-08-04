// Provided with a random integer array/list(ARR) of size N, you have been required to sort this array using 'Bubble Sort'.
// The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
// First line of each test case or query contains an integer 'N' representing the size of the array/list.
// Second line contains 'N' single space separated integers representing the elements in the array/list.
// Input:
// 1
// 7
// 2 13 4 1 3 6 28
// Output:
// 1 2 3 4 6 13 28

package searching_and_sorting;

import java.util.Scanner;

public class Bubble_sort {

	static Scanner s = new Scanner(System.in);

	//function to print array
	public static void printArray(int[] arr) {
		for (int element : arr) {
			System.out.print(element + " ");
		}

		System.out.println();
	}
	//end
	
	//bubble sort function
	public static void bubbleSort(int[] arr){
    	for(int i = 0; i< arr.length - 1;i++)
    	{
    		for(int j = 0; j< arr.length - 1; j++)
    		{
    			if(arr[j] > arr[j + 1])
    			{
    				int temp = arr[j];
    				arr[j] = arr[j + 1];
    				arr[j + 1] = temp;
    			}
    		}
    	}
    }  
	//ends

	public static void main(String[] args) {
		int n = s.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}

		Bubble_sort.bubbleSort(arr);

		printArray(arr);

	}
}
