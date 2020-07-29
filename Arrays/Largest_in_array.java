package arrays;

import java.util.Scanner;

public class Largest_in_array {
	
	public static int largest(int input[]) {
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < input.length; i++) {
			if(input[i] > max) {
				max = input[i];
			}
		}
		return max;
	}

	public static int [] takeInput() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = s.nextInt();
		int input[] = new int[n];
		
		System.out.println("Enter the numbers in " + n + " array size: ");
		
		for(int i = 0; i< n; i++) {
			input[i] = s.nextInt();
		}
		s.close();
		return input;
	}
	
	public static void print(int input[]) {
		System.out.println("Elements entered are: ");
		int n = input.length;
		for(int i = 0; i < n; i++) {
			System.out.print(input[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int arr[] = takeInput();
		print(arr);
		int largest_num = largest(arr);
		System.out.println("Largest no is: " + largest_num);
		
	}

}
