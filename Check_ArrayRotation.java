package searching_and_sorting;

import java.util.Scanner;

public class Check_ArrayRotation {

	static Scanner s = new Scanner(System.in);

	public static int[] takeInput() {
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

//	public static int arrayRotateCheck(int[] arr){
//        
//		int minIndex = 0;
//		int min = arr[0];
//		
//		for(int j = 0; j < arr.length; j++)
//		{
//			if(min > arr[j])
//			{
//				 min = arr[j]; 
//	             minIndex = j; 
//			}
//		}
//		return minIndex;
//	}
	
	public static int arrayRotateCheck(int arr[])
	{
		return arrayRotateCheck(arr,0,arr.length-1);
	}
	
	public static int arrayRotateCheck(int arr[], int low, int high) 
	{ 
		// This condition is needed to handle  
		// the case when array is not rotated  
		// at all 
		if (high < low) 
			return 0; 

		// If there is only one element left 
		if (high == low) 
			return low; 

		// Find mid 
		// /*(low + high)/2;*/ 
		int mid = low + (high - low)/2;  

		// Check if element (mid+1) is minimum 
		// element. Consider the cases like 
		// {3, 4, 5, 1, 2} 
		if (mid < high && arr[mid+1] < arr[mid]) 
			return (mid + 1); 

		// Check if mid itself is minimum element 
		if (mid > low && arr[mid] < arr[mid - 1]) 
			return mid; 

		// Decide whether we need to go to left  
		// half or right half 
		if (arr[high] > arr[mid]) 
			return arrayRotateCheck(arr, low, mid - 1); 

		return arrayRotateCheck(arr, mid + 1, high); 
	}
	
	public static void main(String[] args) {
		int[] arr = takeInput();

		System.out.println(arrayRotateCheck(arr));
	}

}
