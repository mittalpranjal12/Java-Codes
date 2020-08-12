package TimeAndSpace;

import java.util.Scanner;

public class SplitArray {

	static Scanner s = new Scanner(System.in);

	public static boolean splitArray(int input[])
	{
		return splitArray(input,0,0,0);
	}
	
	public static boolean splitArray(int input[],int si,int lsum, int rsum)
	{
		if(si == input.length)
		{
			if(lsum == rsum)
			{
				return true;
			}
			else
				return false;
		}
		
		if(input[si] % 5 == 0)
		{
			lsum += input[si];
		}
		else if(input[si] % 3 == 0)
		{
			rsum += input[si];
		}
		else
		{
			boolean leftAns = splitArray(input, si+1, lsum+input[si], rsum);
			boolean rightAns = splitArray(input, si+1, lsum, rsum+input[si]);
			
			if(leftAns || rightAns)
				return true;
			else
				return false;
		}
		return splitArray(input, si+1, lsum, rsum);
	}
	
	public static void main(String[] args) {
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		System.out.println(splitArray(input));
	}
}
