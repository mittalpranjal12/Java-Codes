package Patterns;

import java.util.Scanner;

public class Zeroes_and_stars_pattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        
        for(i = 1; i<= n; i++) {
        	int j = 1;
        	
        	for(j = 1; j<=n; j++) {
        		
        		if(i == j) {
        			System.out.print("*");
        		}
        		else {
        			System.out.print(0);
        		}
        		
        	}
        	
    		System.out.print("*");
    		j--;
    			while( j >= 1) {
    				if( i == j) {
    					System.out.print("*");
    				} else {
            			System.out.print(0);
            		}
    				j--;
    			}
        	System.out.println();
        }
        
        s.close();
	}

}
