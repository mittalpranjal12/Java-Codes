// Given an array of length N and an integer x, you need to find and return the last index of integer x present in the array. Return -1 if it is not present in the array.
// Last index means - if x is present multiple times in the array, return the index at which x comes last in the array.
// You should start traversing your array from 0, not from (N - 1).
// Do this recursively. Indexing in the array starts from 0.
// Input :
// 4
// 9 8 10 8
// 8
// Output :
// 3

package Recursion;

import java.util.Scanner;

public class LastIndex_Of_Number {

static Scanner s = new Scanner(System.in);
	
	public static int[] takeInput(){
		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}
	
	private static int lastIndex(int input[], int x,int startIndex)
	{
		if(startIndex == input.length)
			return -1;
		
		int index = lastIndex(input, x, startIndex+1);
		
		if(index == -1 && input[startIndex] == x)
			return startIndex;
		else
			return index;
	}
	public static int lastIndex(int input[], int x) 
	{
		return lastIndex(input,x,0);
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		int x = s.nextInt();
		System.out.println(lastIndex(input, x));
	}
}
