// You are given S a sequence of n integers i.e. S = s1, s2, ..., sn. Compute if it is possible to split S into two parts : s1, s2, ..., si and si+1, si+2, ….., sn (0 <= i <= n) in such a way that the first part is strictly decreasing while the second is strictly increasing one.
// Note : We say that x is strictly larger than y when x > y.
// So, a strictly increasing sequence can be 1 4 8. However, 1 4 4 is NOT a strictly increasing sequence.

// That is, in the sequence if numbers are decreasing, they can start increase at one point. And once number starts increasing, they cannot decrease at any point further.
// Sequence made up of only increasing numbers or only decreasing numbers is a valid sequence. So in both the cases, print true.

// You just need to print true/false. No need to split the sequence.
// N = 5
// 9
// 8
// 4
// 5
// 6
// Output :
// true

package For_loop;

import java.util.Scanner;

public class check_number_sequence {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = 0;
        int num [] = new int [n];
        
        for(int i = 0; i<n; i++) {
        	num[i] = s.nextInt();
        }
        
        for(int i = 0; i< n - 1; i++) 
        {
        	if(count == 0) 
        	{
        		if(num[i]<num[i + 1])
        		{
        			count++;
        		}
        	}
        	else if(count == 1)
        	{
        		if(num[i]>= num[i + 1])
        		{
        			count++;
        		}
        	}
        	else if(count > 1) 
        	{
        		break;
        	}
        }
        
        if(count == 0 || count == 1) {
        	System.out.println(true);
        }else {
        	System.out.println(false);
        }
        s.close();
	}

}
