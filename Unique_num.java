package arrays;

import java.util.Scanner;

public class Unique_num {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int input[] = new int[n];
		
		for(int i = 0; i< n; i++) 
		{
			input[i] = s.nextInt();
		}
		
		for(int i = 0; i < input.length; i++)
		{
			int j;
			for(j = 0; j < input.length; j++)
			{
				if(i == j) 
				{
					continue;
				}
				if(input[i] == input[j])
				{
					break;
				}
			}
			
			if(j == input.length)
			{
				System.out.println(input[i] + " ");

			}
		}
		s.close();
	}

}
