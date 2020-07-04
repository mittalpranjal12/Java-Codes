package searching_and_sorting;

import java.util.Scanner;

public class Push_ZeroesToEnd {

	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
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
	
	public static void pushZerosAtEnd(int[] arr)
	{
		int i = 0;
		int k = 0;
		
		while(i < arr.length)
		{
				if(arr[i] == 0)
				{
					i++;
				}
				else if(arr[i]!=0)
				{
					int temp = arr[i];
					arr[i] = arr[k];
					arr[k] = temp;
					i++;
					k++;
				}
		}
	}


	public static void main(String[] args) {
		int[] arr = takeInput();

		Push_ZeroesToEnd.pushZerosAtEnd(arr);
		printArray(arr);
	}
	
}
