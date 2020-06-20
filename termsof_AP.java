// Write a program to print first x terms of the series 3N + 2 which are not multiples of 4.
// N = 10

// 5 11 14 17 23 26 29 35 38 41

package For_loop;

import java.util.Scanner;

public class termsof_AP {

	public static void main(String[] args) {
	
				Scanner s = new Scanner(System.in);
		        int n = s.nextInt();
		        
		        for(int i = 1; i <= n; i++) {
		        	int sum = 3*i + 2;
		        	
		        		if(sum%4 == 0) {
		        			n++;
		        			continue;
		        		}
		        	System.out.println(sum);
		        }
		        s.close();
			}

		}
