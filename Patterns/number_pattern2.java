//Print the following pattern
// Pattern for N = 4
//        1
//       23
//      345
//     4567

package Patterns;

import java.util.Scanner;

public class number_pattern2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        int i = 1;
        int val;
        
        while( i <= n){
            val = i;
            int space = 1;
            while( space <= n-i){
                System.out.print(" ");
                space = space + 1;
            }
            int j = 1;
            while(j <= i){
                System.out.print(val);
                val = val + 1;
                j = j + 1;
            }
            System.out.println();
            i = i + 1;
        }
        s.close();
	}

}
