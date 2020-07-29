//Write a program to input an integer N and print the sum of all its even digits and sum of all its odd digits separately.
//Digits mean numbers, not the places! That is, if the given integer is "13245", even digits are 2 & 4 and odd digits are 1, 3 & 5.

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
