package Recursion;

import java.util.Scanner;

public class SumOfDigits {
	
	public static int sumOfDigits(int input)
	{
		if(input <= 0)
			return 0;
		
		int ld = input % 10;
		return ld + sumOfDigits(input/10);

	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(sumOfDigits(n));
		s.close();
	}

}
