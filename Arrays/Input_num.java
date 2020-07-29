package arrays;

import java.util.Scanner;

public class Input_num {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = s.nextInt();
		int input[] = new int[n];
		
		System.out.println("Enter the numbers in " + n + " array size: ");
		
		for(int i = 0; i< n; i++) {
			input[i] = s.nextInt();
		}
		
		System.out.println("Elements entered are: ");
		
		for(int i = 0; i < n; i++) {
			System.out.print(input[i] + " ");
		}
		
	s.close();	
	}

}
