// Write a program to generate the reverse of a given number N. Print the corresponding reverse number.
// Note : If a number has trailing zeros, then its reverse will not include them. For e.g., reverse of 10400 will be 401 instead of 00401.
//  N = 1234
// 4321

package For_loop;

import java.util.Scanner;

public class Reverse_ofa_num {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int rev = 0;
		
		while( n!= 0) {
			int digit = n%10;
			rev = rev*10 + digit;
			n = n/10;
		}
		System.out.print(rev);
		s.close();
	}

}
