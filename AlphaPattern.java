// Print the following pattern for the given N number of rows.
// Pattern for N = 3
//  A
//  BB
//  CCC

package Patterns;

import java.util.Scanner;

public class AlphaPattern {
	
public static void main(String[] args) {
			
			Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        int i = 1;
	        
	        while( i <= n)
	        {
	            int j = 1;
	            char startingChar = (char)('A' + i - 1);
	            
	            	while( j <= i)
	            	{
	                    System.out.print(startingChar);
	                    j++;
	                }
	            System.out.println();
	            i++;
	        }
	        s.close();
		}
	}
