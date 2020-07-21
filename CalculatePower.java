// Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to return the answer.
// Do this recursively.
// Input :
//  3 4
//  Output :
// 81

package Recursion;

import java.util.Scanner;

public class CalculatePower {

	public static int power(int x, int n)
	{
		if(n == 0)
			return 1;
		
		return x * power(x, n-1);
	}
	
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {

			int x = s.nextInt();
			int n = s.nextInt();
			
			System.out.println(power(x, n));
	}

}
