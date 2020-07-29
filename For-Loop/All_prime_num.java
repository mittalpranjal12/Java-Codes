// Given an integer N, print all the prime numbers that lie in the range 2 to N (both inclusive).
// N = 9
// 2
// 3
// 5
// 7

package For_loop;

import java.util.Scanner;

public class All_prime_num {

	public static void main(String[] args) {
	
				Scanner s = new Scanner(System.in);
		        int n = s.nextInt();
		        int count = 0;
		        
		        for(int i = 2; i <= n; i++){
		        	count = 0;
		        	for(int j = 2; j < i; j++) {
		        		
		        		if(i%j == 0){
		        			count++;
		        			break;
		        		} 
		        		
		        	}
		        
		        if(count == 0) {
		        	 
		        	    System.out.println(i);
		         }
		        }
		        s.close();
			}

	}

