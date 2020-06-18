package Patterns;

import java.util.Scanner;

public class odd_star_patterns {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        
        while( i <= n){
            int j = 1;
            int spaces = 1;
            
            	while( spaces <= n - i ){
                    System.out.print(" ");
                    spaces++;
                }
            
            	while( j <= 2*i - 1){
                    System.out.print("*");
                    j++;
                }
            System.out.println();
            i++;
        }
		s.close();
	}

}
