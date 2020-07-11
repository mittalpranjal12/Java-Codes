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
