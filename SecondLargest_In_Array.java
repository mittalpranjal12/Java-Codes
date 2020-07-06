// You have been given a random integer array/list(ARR) of size N. You are required to find and return the second largest element present in the array/list.
// If N <= 1 or all the elements are same in the array/list then return -2147483648 or -2 ^ 31(It is the smallest value for the range of Integer)
// Input:
// 1
// 7
// 2 13 4 1 3 6 28
// Output:
// 13

package searching_and_sorting;

import java.util.Scanner;

public class SecondLargest_In_Array {
	static Scanner s = new Scanner(System.in);

	public static int[] takeInput() {
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static int secondLargestElement(int[] arr) 
	{
        int l = Integer.MIN_VALUE;
        int sl = Integer.MIN_VALUE;
        
        for(int i = 0;i < arr.length; i++)
        {
        	if(arr.length <= 1)
        		return -2147483648;
        	
            if(arr[i] > l)
            {
                sl = l;
                l = arr[i];
            }
            else if(arr[i] != l && arr[i] > sl)
            {
                sl = arr[i];
            }
        } 
             
       return sl;
	}
        
	public static void main(String[] args) {
		int[] arr = takeInput();

		System.out.println(SecondLargest_In_Array.secondLargestElement(arr));
	}

}
