package strings_and_2DArrays;

import java.util.Scanner;

public class CheckPermutation {

	public static boolean isPermutation(String input1, String input2)
	{
		if(input1.length() != input2.length())
			return false;

		int arr1[] = new int[256];
		int arr2[] = new int[256];
		
		for(int i = 0; i < input1.length(); i++)
		{
			int s1 = input1.charAt(i);
			int s2 = input2.charAt(i);
			arr2[s2]++;
			arr1[s1]++;
		}
		
		for(int j = 0; j < arr1.length; j++)
		{
			if(arr1[j] != arr2[j])
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input1 = s.next();
		String input2 = s.next();
		System.out.println(CheckPermutation.isPermutation(input1, input2));
		s.close();
	}

}
