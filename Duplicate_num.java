package arrays;

import java.util.Scanner;

public class Duplicate_num {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int input[] = new int[n];
		
		// input numbers
		for(int i = 0; i< n; i++) {
			input[i] = s.nextInt();
		}
		
		for(int i = 0; i < input.length - 1; i++)
		{
			int j;
			for(j = i + 1; j < input.length; j++)
			{
				if(input[i] == input[j])
				{
					System.out.println(input[j] + " ");
				}
			}
			
		}
		s.close();
	}

}
