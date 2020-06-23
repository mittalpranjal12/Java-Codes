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
