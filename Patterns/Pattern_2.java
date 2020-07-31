// Number Star pattern 
// Print the following pattern for given number of rows.

// Pattern in N lines: 5
// Sample Output :
//  5432*
//  543*1
//  54*21
//  5*321
//  *4321

package Patterns;

import java.util.Scanner;

public class Pattern_2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        
        for( i = 1; i<= n; i++) {
        	
        		for(int j = n; j>= 1; j--) {
        			
        			if( j!=i) {
        				System.out.print(j);
        			} else {
        				System.out.print("*");
        			}
        			
        		}
        		System.out.println();
        }
        
        
        s.close();
	}

}
