// Print the following pattern for the given number of rows.
// Pattern for N = 4
// ...1
// ..232
// .34543
// 4567654
// The dots represent spaces.

package Patterns;

import java.util.Scanner;

public class triangle_of_num {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        
        while( i <= n) {
        	 int spaces = 1;
        	 int p = i;
	            
         	while( spaces <= n - i ){
                 System.out.print(" ");
                 spaces++;
             }
         	int j = 1;
         	
         		while( j <= i) {
         			System.out.print(p);
         			p++;
         			j++;
         		}
         		p = 2*i - 2;
         	j = 1;
         		while( j <= i - 1 ) {
         			
         			System.out.print(p);
         			p--;
         			j++;

        		}
         		System.out.println();
	            i++;
        }
        s.close();
	}

}
