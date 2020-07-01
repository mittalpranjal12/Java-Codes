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
