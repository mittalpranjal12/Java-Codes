// Given a decimal number (integer N), convert it into binary and print.
// The binary number should be in the form of an integer.
// Note : The given input number could be large, so the corresponding binary number can exceed the integer range.
// N = 12
// 1100
	
package For_loop;

import java.util.Scanner;

public class decimal_to_binary {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long n = s.nextInt();
		long ans = 0;
		long pv = 1;
		long digit = 0;
		
		while( n != 0) {
		    digit = n%2;
		    n = n/2;
			ans = ans + (digit*pv);
			pv = pv*10;
		}
		System.out.print(ans);
		s.close();
	}

}
