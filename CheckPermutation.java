// Given two strings, S and T, check if they are permutations of each other. Return true or false.
// Permutation means - length of both the strings should same and should contain same set of characters. Order of characters doesn't matter.
// Note : Input strings contain only lowercase english alphabets.
// Input 1 :
// abcde
// baedc
// Output 1 :
// true
// Input 2 :
// abc
// cbd
// Output 2 :
// false

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
