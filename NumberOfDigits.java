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
