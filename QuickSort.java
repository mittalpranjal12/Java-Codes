 //Sort an array A using Quick Sort.
// Input :
// 6 
// 2 6 8 5 4 3
// Output:
// 2 3 4 5 6 8

package Recursion;

import java.util.Scanner;

public class QuickSort {

static Scanner s = new Scanner(System.in);
	
	public static int[] takeInput(){
		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}
	
	public static void quickSort(int[] input, int si, int ei)
	{
		int pivotPos = partition(input,si,ei);
		
		if(si < pivotPos - 1)
			quickSort(input, si, pivotPos-1);
		
		if(ei > pivotPos)
			quickSort(input, pivotPos, ei);
	}
	
	public static int partition(int[] input, int si, int ei)
	{
		int pivot = input[si];
		
		while(si <= ei)
		{
			while(input[si] < pivot)
			{
					si++;
			}
			while(input[ei] > pivot)
			{
				ei--;
			}
			
			if(si <= ei)
			{
				int temp1 = input[si];
				input[si] = input[ei];
				input[ei] = temp1;
				si++;
				ei--;
			}
		}
	return si;
}
	
	public static void quickSort(int[] input)
	{
		quickSort(input,0,input.length-1);
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		quickSort(input);
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}
}
