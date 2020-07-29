// Write a Program to determine if the given number is Armstrong number or not. Print true if number is armstrong, otherwise print false.
// An Armstrong number is a number (with digits n) such that the sum of its digits raised to nth power is equal to the number itself.
// For example,
// 371, as 3^3 + 7^3 + 1^3 = 371
// 1634, as 1^4 + 6^4 + 3^4 + 4^4 = 1634
	
// N = 1
// true
	
// N = 103
// false

package For_loop;

import java.util.Scanner;

public class Armstrong_num {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int rem,t = 0;
        int ans = 0;
        int num = n;
        
        for (n = num;num != 0; num /= 10, ++t);
        {
        	num = n;
        }
        while(num != 0) {
        	rem = num%10;
        	ans = ans + (int)Math.pow(rem,t);
        	num = num/10;
        	}
        
        if(ans == n) {
        	System.out.println(true);
        }else {
        	System.out.println(false);
        }
        
        
        s.close();
	}

}
