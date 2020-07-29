// Given a binary number as an integer N, convert it into decimal and print.
// N = 1100
// 12

package For_loop;

import java.util.Scanner;

public class binary_to_decimal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int pv = 1;
		int ans = 0;
		
		while(n!= 0) {
			int digit = n%10;
			ans = ans + digit*pv;
			pv = pv*2;
			n = n/10;
		}
		System.out.println(ans);
		s.close();
	}

}
