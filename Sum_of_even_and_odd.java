package For_loop;

import java.util.Scanner;

public class Sum_of_even_and_odd {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        int digit,rem,even=0, odd=0;
        
        while( n>0 ){
            
            digit = n%10;
            n = n/10;
            rem = digit%2;
            
            if(rem!=0){
                odd = odd + digit;
            }else{
                even = even + digit;
            }
            
        }
        System.out.println("Sum of even numbers: " + even);
        
        System.out.println("Sum of odd numbers: "+odd);
        
        s.close();
	}

}
