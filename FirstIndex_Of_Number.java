// Given an array of length N and an integer x, you need to find and return the first index of integer x present in the array. Return -1 if it is not present in the array.
// First index means, the index of first occurrence of x in the input array.
// Do this recursively. Indexing in the array starts from 0.
// Input :
// 4
// 9 8 10 8
// 8
// Output :
// 1

package Recursion;

import java.util.Scanner;

public class FirstIndex_Of_Number {

static Scanner s = new Scanner(System.in);
	
	public static int[] takeInput(){
		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}
	
	private static int firstIndex(int input[], int x,int startIndex)
	{
		if(startIndex == input.length)
			return -1;
		
		if(input[startIndex] == x)
			return startIndex;
		
		return firstIndex(input,x,startIndex+1);
	}
	
	public static int firstIndex(int input[],int x)
	{
		return firstIndex(input,x,0);
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		int x = s.nextInt();
		System.out.println(firstIndex(input, x));
	}

}
