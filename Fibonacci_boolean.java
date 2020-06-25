package functions;

import java.util.Scanner;

public class Fibonacci_boolean {
	
	public static boolean fibonacci(int x) {
		int n1 = 0, n2 = 1, n3;
		if(x == n1 || x == n2) 
			return true;
		
        n3 = n1 + n2;
        
        while(n3 <= x)
        {
            if(n3 == x) 
            	return true;
            
            n1 = n2;
            n2 = n3;
            n3 = n1 + n2;
        }
        return false;
    }

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        boolean ans = fibonacci(n);
        System.out.println(ans);
		s.close();
	}

}
