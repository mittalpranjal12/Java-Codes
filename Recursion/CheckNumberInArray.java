// Given an array of length N and an integer x, you need to find if x is present in the array or not. Return true or false.
// Do this recursively.
// Input:
// 3
// 9 8 10
// 8
// Output:
// true

package Recursion;

import java.util.Scanner;

public class CheckNumberInArray {

	static Scanner s = new Scanner(System.in);

	private static boolean checkNumber(int input[], int x,int startIndex)
	{
		if(startIndex <= 0)
			return false;
		
		if(x == input[startIndex-1])
			return true;
		
		return checkNumber(input,x, startIndex-1);
	}
	
	public static boolean checkNumber(int input[],int x)
	{
		return checkNumber(input,x,input.length);
	}
	
	public static void main(String[] args) {
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		int x = s.nextInt();
		System.out.println(checkNumber(input, x));
	}

}
