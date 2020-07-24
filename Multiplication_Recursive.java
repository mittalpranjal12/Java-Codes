// Given two integers M & N, calculate and return their multiplication using recursion. You can only use subtraction and addition for your calculation. 
// No other operators are allowed.
//  Input:
// 3 
// 5
//  Output :
// 15

package Recursion;

import java.util.Scanner;

public class Multiplication_Recursive {

		public static int multiplyTwoIntegers(int m, int n)
		{
			if(m == 0 || n == 0)
				return 0;
			
			return n + multiplyTwoIntegers(n,m-1);
		}
		
		public static void main(String[] args) {
			
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = s.nextInt();
		System.out.println(multiplyTwoIntegers(m, n));
		s.close();
	}

}
