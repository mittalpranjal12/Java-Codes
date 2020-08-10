Given is the code to print numbers from 1 to n in increasing order recursively.

package Recursion;

import java.util.Scanner;

public class PrintNumbers {
	
	public static void print(int n)
	{
		if(n <= 0)
			return;
		
		if(n == 1)
		{
			System.out.print(n + " ");
		}
		else
		{
			print(n-1);
			System.out.print(n + " ");
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		print(n);
		s.close();
	}

}
