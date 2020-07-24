// Given k, find the geometric sum i.e.
// 1 + 1/2 + 1/4 + 1/8 + ... + 1/(2^k) 
// using recursion.
//  Input:
// 3
// Output:
// 1.875

package Recursion;

import java.text.DecimalFormat;
import java.util.Scanner;


public class GeometricSum {

	public static double findGeometricSum(int k)
	{
		if(k == 0)
			return 1;
		
		return Math.pow(0.5,k) + findGeometricSum(k-1);
	}
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int k = s.nextInt();
		double ans = findGeometricSum(k);
		DecimalFormat dec = new DecimalFormat("#0.00000");
		System.out.println(dec.format(ans));
		s.close();
	}

}
