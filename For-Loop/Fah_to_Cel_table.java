//Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W), 
//Convert all Fahrenheit values from Start to End at the gap of W, into their corresponding Celsius values and print the table.
import java.util.Scanner;
public class Fah_to_Cel_table {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        
        int S = s.nextInt();
        int E = s.nextInt();
        int W = s.nextInt();
        
        for(int i = S; i<=E; i = i+W)
        {
            int cel = (5*(i - 32))/9;
            System.out.print(i);
            System.out.print("\t");
            System.out.println(cel);
            
        }
        s.close();
	}

}
