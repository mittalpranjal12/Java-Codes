package searching_and_sorting;

import java.util.Scanner;

public class SumOf_TwoArrays {

	static Scanner s = new Scanner(System.in);
	public static int[] takeInput() {
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static int[] sumOfTwoArrays(int[] arr1, int[] arr2)
	{
		int i = arr1.length-1, j = arr2.length-1, size = arr1.length + 1;
		int carry = 0, num = 0;
		int arr3[] = new int [size];
		int k = size - 1;
	
			while(j >= 0)
			{
				num = arr1[i] + arr2[j] + carry;
				arr3[k] = num%10;
				carry = num/10;
				i--;
				j--;
				k--;
				if(j == -1)
					break;
			}
		
		while(i >= 0)
		{
				num = arr1[i] + carry;
				arr3[k] = num%10;
				carry = num/10;
				i--;
				k--;
		}
		
		arr3[0] = carry;
		
		return arr3;	
	}
	
	public static void main(String[] args) {
		int[] arr1 = takeInput();
		int[] arr2 = takeInput();
		print(SumOf_TwoArrays.sumOfTwoArrays(arr1, arr2));
	}
}
