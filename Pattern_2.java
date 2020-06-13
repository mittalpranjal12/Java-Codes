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
