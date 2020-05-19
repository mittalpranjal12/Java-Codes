import java.util.Scanner;
public class Average_Marks {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
        
		int m1 = n.nextInt();
        int m2 = n.nextInt();
        int m3 = n.nextInt();
        
        int avg = (m1+m2+m3)/3;
        
        System.out.println("Average of 3 marks is " + avg);
        
        n.close();

	}

}
