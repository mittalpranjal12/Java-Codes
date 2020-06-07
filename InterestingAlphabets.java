// Print the following pattern for the given number of rows.
// Pattern for N = 5
// E
// DE
// CDE
// BCDE
// ABCDE

package Patterns;

import java.util.Scanner;

public class InterestingAlphabets {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        int i = 1;
	        
	        while( i <= n)
	        {
	            int j = 1;
	            char startingChar = (char)('A' + n - i);
	            
	            	while( j <= i)
	            	{
	                    System.out.print(startingChar);
	                    startingChar = (char)(startingChar + 1);
	                    j++;
	                }
	            System.out.println();
	            i++;
	        }
		s.close();		
	}
}
