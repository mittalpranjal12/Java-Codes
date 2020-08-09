// Given the code to find out and return the number of digits present in a number recursively.
// Input :
//  156
// Output :
// 3

package Recursion;

import java.util.Scanner;

public class NumberOfDigits {

	public static int count(int n)
	{
		if(n == 0)
			return 0;
			
		int sa = count(n / 10);
		int ans = sa + 1;
		
		return ans;
	}
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		System.out.println(count(n));
		s.close();
	}

}
