package searching_and_sorting;

import java.util.Scanner;

public class Rotate_Array {

	static Scanner s = new Scanner(System.in);

	public static int[] takeInput() {
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

		System.out.println();
	}
	
	 public static void rotate(int[] arr, int d)
	 {
		 int temp[] = new int[d];
		 for(int i = 0; i < d; i++)
		 {
			 temp[i] = arr[i];
		 }
		 for(int i = d; i < arr.length; i++) 
		 {
			arr[i - d] = arr[i]; 
		 }
		 for(int i = 0; i < d; i++)
		 {
			 arr[arr.length - d + i] = temp[i];
		 }
		
	 }
	
	public static void main(String[] args) {
		int[] arr = takeInput();
		int index = s.nextInt();

		Rotate_Array.rotate(arr, index);
		printArray(arr);
	}

}
