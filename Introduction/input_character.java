import java.util.Scanner;
public class input_character {

	public static void main(String[] args) {

			Scanner s = new Scanner(System.in);
			
			String str = s.nextLine();
			
			System.out.print("Name: " +str);
			s.close();
	}

}
