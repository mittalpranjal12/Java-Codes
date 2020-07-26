// Given a string, compute recursively a new string where all appearances of "pi" have been replaced by "3.14".
// Input 1 :
// xpix
// Output :
// x3.14x
// Input 2 :
// pipi
// Output :
//3.143.14
	

package Recursion;

import java.util.Scanner;

public class Replace_pi {

	public static String replace(String input)
	{
		if(input.length() <= 1)
			return input;
	
		if(input.charAt(0) == 'p' && input.length() >= 2 && input.charAt(1) == 'i')
			return 3.14 + replace(input.substring(2,input.length()));
	
		return input.charAt(0) + replace(input.substring(1,input.length()));
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(replace(input));
		s.close();
	}

}
