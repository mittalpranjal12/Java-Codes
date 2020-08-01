package Recursion;

import java.util.Scanner;

public class BinarySearch_Recursive {

	static Scanner s = new Scanner(System.in);
	public static int[] takeInput() {
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static int binarySearch(int input[], int element,int si,int ei)
	{
		int mid = (si+ei)/2;
		
		if(si > ei)
			return -1;
		
		if(input[mid] < element)
			return binarySearch(input,element,mid+1,ei);
		
		else if(input[mid] > element)
			return binarySearch(input,element,si,mid-1);
		
		else 
			return mid;
	}
	
	public static int binarySearch(int input[], int element)
	{
		return binarySearch(input,element,0, input.length-1);
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		int element = s.nextInt();
		System.out.println(binarySearch(input, element));
	}
}
