// For a given two-dimensional integer array/list of size (N x M), find and print the sum of each of the row elements in a single line, separated by a single space.
// Input :
// 2		//test cases
// 2 5 
// 4 5 3 2 6 
// 7 5 3 8 9
// 4 4
// 1 2 3 4
// 9 8 7 6
// 3 4 5 6
// -1 1 -10 5
// Output :
// 20 32 
// 10 30 18 -5 

package strings_and_2DArrays;

import java.util.Scanner;

public class RowWise_Sum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = s.nextInt();
		int sum[][] = new int [m][n];
		
		for(int i = 0; i < m; i++)
		{
			for(int j = 0; j < n; j++)
			{
				sum[i][j] = s.nextInt();
			}
		}
		
		int row = sum.length;
		int col = sum[0].length;
		
		for(int i = 0; i < row; i++)
		{
			int rowsum = 0;
			for(int j = 0; j < col; j++)
			{
				rowsum = rowsum + sum[i][j];
			}
			System.out.print(rowsum + " ");
		}
		
		s.close();
	}

}
