package Recursion;

import java.util.Scanner;

public class MergeSort {

	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void printArray(int input[]) {
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}
	
	public static void mergeSort(int[] input,int si, int ei)
	{
		int mid = (si + ei)/ 2;
		
		if(si >= ei)
			return;
		
		mergeSort(input,si,mid);
		
		mergeSort(input,mid+1,ei);
		
		merge(input,si,mid,ei);

	}
	
	private static void merge(int[] input, int si, int mid, int ei)
	{
		int i = mid;
		int j = mid+1;
		
		while(si <= i &&  j <= ei)
		{
			if(input[si] < input[j])
				si++;
			else
			{
				int temp = input[j];
				
				for(int k = j-1; k >= si; k--)
				{
					input[k+1] = input[k];
				}
				
				input[si] = temp;
				si++;
				i++;
				j++;
			}
			
		}
	}
	
	public static void mergeSort(int[] input)
	{
		mergeSort(input,0,input.length-1);
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		mergeSort(input);
		printArray(input);
	}
}
