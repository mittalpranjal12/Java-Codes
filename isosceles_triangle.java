// For N = 5
//     1
//    121
//   12321
//  1234321
// 123454321

package Patterns;

import java.util.Scanner;

public class isosceles_triangle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int i = 1;
		
		while( i <= n) {
			int spaces = 1;
			
			while( spaces <= n - i) {
				System.out.print(" ");
				spaces++;
			}
			int j = 1;
			int p = 1;
			
				while( j <= i) {
					System.out.print(p);
					p++;
					j++;
				}
				p = i - 1;
				j = 1;
				
					while( j <= i - 1) {
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
