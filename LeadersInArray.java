package strings_and_2DArrays;

import java.util.Scanner;

public class LeadersInArray {

	public static void leaders(int[] input)
	{
		int size = input.length;
		
		for(int i = 0; i < size; i++)
		{
			int j = i + 1;
			for( ; j < size; j++)
			{
				if(input[j] > input[i])
					break;
			}
			
			if(j == size)
				System.out.print(input[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++){
			input[i] = s.nextInt();
		}
		leaders(input);
		s.close();
	}

}
