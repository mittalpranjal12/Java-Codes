package arrays;

import java.util.Scanner;

public class Linear_search {

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
	
	public static int linearsearch( int input[], int num) {

		int size = input.length;
		for(int i = 0; i < size; i++) {
			if(input[i] == num)
				return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr [] = takeInput();
		//System.out.println("Enter the number to be searched: ");
		
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int ans = linearsearch(arr,num);
		System.out.println(ans);
		s.close();
	}

}
