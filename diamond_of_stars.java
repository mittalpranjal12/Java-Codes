package Patterns;

import java.util.Scanner;

public class diamond_of_stars {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int  sp = 1, n1 = n/2;   
        int i = 1;
        
        while( i <= n){
            int k = n1;
            
            	while( k >= 1){
                    System.out.print(" ");
                    k--;
                }
            int j = 1;
            
            	while( j <= sp){
                     System.out.print("*");
                    j++;
                }
             System.out.println();
            
            	if( i < n/2 + 1){
                    sp += 2;
                    n1 -= 1;
                } else {
                    sp -= 2;
                    n1 += 1;
                }
            i++;
        } 
        s.close();
	}

}
