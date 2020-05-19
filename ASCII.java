import java.util.Scanner;
public class ASCII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a character: ");
		
		String str = s.nextLine();
		char name = str.charAt(0);
		int ascii = (int) name;
		
		System.out.println(ascii);
		
		s.close();
	}
}
