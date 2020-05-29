//Write a program to find x to the power n (i.e. x^n). 

package For_loop;

import java.util.Scanner;

public class power_ofa_number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int ans = 1;
        int x = s.nextInt();
        int n = s.nextInt();
        
        for(int i = 1; i<=n; i++){
            ans = ans*x;
        }
        System.out.print(ans);
        
        s.close();
	}
	}

