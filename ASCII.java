// to find the ASCII value of the entered character
import java.util.Scanner;
public class ASCII {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String str = s.nextLine();
		char name = str.charAt(0);
		
		int ascii = (int)name;
		
		System.out.println(ascii);
		
		s.close();
	}

}
