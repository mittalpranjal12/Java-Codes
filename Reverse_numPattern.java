package Patterns;

import java.util.Scanner;

public class Reverse_numPattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 0;
        
        while( i <= n)
        {
            int j = i;
            
            	while( j >= 1)
            	{
                    System.out.print(j);
                    j--;
                }
            System.out.println();
            i++;
        }
        s.close();
	}

}
