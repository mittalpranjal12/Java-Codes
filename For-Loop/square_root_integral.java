// Given a number N, find its square root. You need to find and print only the integral part of square root of N.
// For eg. if number given is 18, answer is 4.
// N = 4 ans:2
// N = 10 ans: 3

package For_loop;

import java.util.Scanner;

public class square_root_integral {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
	
		int ans = 0;
		int i = 0;
		
		while(ans <= n) {
			i++;
			
			ans = i*i;
			
		}
		i--;
		
		System.out.println(i);
		s.close();
	}

}
