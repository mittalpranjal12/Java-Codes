// Fahrenheit to Celsius Table
// Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W), you need to convert all Fahrenheit values from Start to End at the gap of W,
// into their corresponding Celsius values and print the table.
// Input : 
// 0 
// 100 
// 20
// Output :
// 0   -17
// 20  -6
// 40  4
// 60  15
// 80  26
// 100 37
	
package functions;

import java.util.Scanner;

public class fah_conversion {
	
	public static void cel_conversion(int start, int end, int size) {
		
		for(int i = start; i<=end; i = i + size)
        {
            int cel = (5*(i - 32))/9;
            System.out.print(i);
            System.out.print("\t");
            System.out.println(cel);
            
        }
	
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        
        int S = s.nextInt();
        int E = s.nextInt();
        int W = s.nextInt();
        
        cel_conversion(S,E,W);
     
        s.close();
	}

}
