// For a given two-dimensional integer array/list of size (N x M), 
// you need to find out which row or column has the largest sum(sum of all the elements in a row/column) amongst all the rows and columns.
//  Input :
// 1
// 2 2 
// 1 1 
// 1 1
// Output :
// row 0 2

package strings_and_2DArrays;

import java.util.Scanner;

public class Largest_Row_Or_Column {
	
	static Scanner s = new Scanner(System.in);
		
		public static int[][] takeInput2D(){
			
			int numRows = s.nextInt();
			int numCols = s.nextInt();
			int[][] input = new int[numRows][numCols];
			for(int i = 0; i < numRows; i++){
				for(int j = 0; j < numCols; j++){
					input[i][j] = s.nextInt();
				}
			}
			return input;
		}
		
		public static void findLargest(int input[][])
		{
			int row = input.length;
			int col = input[0].length;
			int sum1 = Integer.MIN_VALUE;
			int i = 0, j = 0, x = 0;
			String s = "";
			
			for(i = 0; i < row; i++)
			{
				int sum = 0;
				
				for(j = 0; j < col; j++)
				{
					sum = sum + input[i][j];
				}
				if(sum > sum1)
				{
					sum1 = sum;
					x = i;
					s = "row";
				}
			}
			for(j = 0; j < col; j++)
			{
				int sum = 0;
				
				for(i = 0; i < row; i++)
				{
					sum = sum + input[i][j];
				}
				if(sum > sum1)
				{
					sum1 = sum;
					x = j;
					s = "column";
				}
			}
			
					System.out.print(s + " " + x + " " + sum1);
			}
		
		public static void main(String[] args) {
		
			int input[][] = takeInput2D();
			LargestRow_Or_Column.findLargest(input);
			
		}

	}
