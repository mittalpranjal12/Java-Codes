package TimeAndSpace;

import java.util.Scanner;

public class UniqueNum {

	public static int findUnique(int[] arr)
	{
		int res = arr[0];
		for(int i = 1; i < arr.length; i++)
		{
			res = res ^ arr[i];
		}
		return res;
	}
	
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = takeInput();
		System.out.print(findUnique(arr));
	}
}
