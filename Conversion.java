import java.util.Scanner;
public class Conversion {
	
		public static void main(String[] args) {
			
			Scanner n = new Scanner(System.in);
			int fah = n.nextInt();
			
			int cel = (5*(fah - 32))/9;
			
			System.out.println(cel);
			n.close();
		}

	}

