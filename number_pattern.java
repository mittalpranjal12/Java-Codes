package Patterns;

import java.util.Scanner;

public class number_pattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        
        int i = 1;
        int val;
        
        while( i<=n){
            val = i;
            int j = 1;
            while( j<=i){
                System.out.print(val);
                val = val + 1;
                j = j + 1;
            }
            System.out.println();
            //System.out.print(val);
            i = i + 1;
        }
		s.close();
	}

}
