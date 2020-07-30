// Convert fahrenhiet to celsius scale
import java.util.Scanner;
public class Conversion {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int fah = s.nextInt();
		
		int cel = (5*(fah - 32))/9;
		
		System.out.println(cel);
		s.close();
	}

}
