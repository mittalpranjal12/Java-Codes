//introducing different types of bitwise operators.

package Introduction;

import java.util.Scanner;

public class bitwise {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		
		System.out.println("Bitwise AND: " + (n & m));
		System.out.println("Bitwise OR: " + (n | m));
		System.out.println("Bitwise XOR: " + (n ^ m));
		System.out.println("Bitwise NOT: " + (~n));
		System.out.println("Bitwise NOT: "  + (~m));
		System.out.println("Left Shift of 34: " + (34 << 1));
		System.out.println("Right Shift of 34: " + (34 >> 2));
		System.out.println("Left Shift of -4: " + (-4 << 1));
		System.out.println("Right Shift of -4: " + (-4 >> 1));
		
		s.close();
	}

}
