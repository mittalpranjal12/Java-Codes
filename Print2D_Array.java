package strings_and_2DArrays;

import java.util.Scanner;

public class Print2D_Array {

static Scanner s = new Scanner(System.in);
	
	public static int[][] takeInput(){
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

	public static void print2DArray(int input[][])
	{
		int n = input.length;
		int m = input[0].length;
		
		for(int i = 0; i< n; i++)
		{
			for(int k = 0; k < (n-i); k++)
			{
				for(int j = 0; j < m; j++)
				{
					System.out.print(input[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
	
	public static void main(String[] args) {
		int[][] input = takeInput();
		print2DArray(input);
	}
}
