import java.util.Scanner;
public class if_else {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        
        String str = s.nextLine();
        char a = str.charAt(0);
        
        if(a >= 'A' && a <='Z'){
            
            System.out.println(1);
            
        } else if(a >= 'a' && a <='z'){
            
            System.out.println(0);
            
        } else {
            
            System.out.println(-1);
            
        }
		
		s.close();

	}

}
