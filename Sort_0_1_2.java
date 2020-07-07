package searching_and_sorting;

import java.util.Scanner;

public class Sort_0_1_2 {

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
		for (int elem : arr) {
			System.out.print(elem + " ");
		}
		System.out.println();
	}
	
	public static void sort012(int[] arr)
	{
		int i = 0, nz = 0, nt = arr.length - 1;
		
		while(i < nt + 1)
		{
			if(arr[i] == 1)
			{
				i++;
			}
			
			else if(arr[i] == 2)
			{
				if(arr[nt] == 0 || arr[nt] == 1)
				{
					int x = arr[nt];
					arr[nt] = arr[i];
					arr[i] = x;
					nt--;
				}
				else
				{
					nt--;
				}
			}
			else if(arr[i] == 0)
			{
				int temp = arr[i];
				arr[i] = arr[nz];
				arr[nz] = temp;
				nz++;
				i++;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = takeInput();

		Sort_0_1_2.sort012(arr);
		printArray(arr);
	}
}
