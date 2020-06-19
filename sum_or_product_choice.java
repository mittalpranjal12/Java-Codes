// Write a program that asks the user for a number N and a choice C. 
// And then give them the possibility to choose between computing the sum and computing the product of all integers in the range 1 to N (both inclusive).
// If C is equal to -
//  1, then print the sum
//  2, then print the product
//  Any other number, then print '-1' (without the quotes)
//   10
//   1
// output: 55

package For_loop;

import java.util.Scanner;

public class sum_or_product_choice {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int choice = s.nextInt();
        int sum = 0;
        int product = 1;
        
        if( choice == 1) {
        	for(int i = 1; i <= n; i++) {
        		sum = sum + i;
        	}
        	System.out.println(sum);
        } else if( choice == 2) {
        	for(int j = 1; j <= n; j++) {
        		product = product*j;
        	}
        	System.out.println(product);
        } else {
        	System.out.println(-1);
        }
        s.close();
	}

}
