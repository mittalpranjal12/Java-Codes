// marks of three tests as m1, m2, and m3 of a student considering all the three marks have been given in integer format.
// We need to calculate the average of the given marks and print it.
//All the test marks are in integers and hence calculate the average in integer as well.

import java.util.Scanner;
public class Average_Marks {

	public static void main(String[] args) {
		
		Scanner n = new Scanner(System.in);
      
		int m1 = n.nextInt();
        int m2 = n.nextInt();
        int m3 = n.nextInt();
        
        int avg = (m1+m2+m3)/3;
        
        System.out.println(avg);
        
        n.close();
      }

}
