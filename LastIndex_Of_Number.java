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
