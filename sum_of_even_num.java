package For_loop;

import java.util.Scanner;


public class sum_of_even_num {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        int sum = 0;
        int i;
        
		for(i=2; i<=n; i = i+2)
        {
                sum = sum + i;
        }
        	System.out.println("Sum of even numbers is: " + sum);
        	s.close();
	}

}
