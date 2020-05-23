package Introduction;

import java.util.Scanner;

public class total_salary {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        
        double basic = s.nextInt();
        String str = s.next();
        char ch = str.charAt(0);
        double allow;
        
        double hra = ((basic*20/100.0));
        double da =  ((basic*50/100.0));
        double pf = ((basic*11/100.0));
        
        if( ch == 'A'){
            
        	 allow = 1700;
            
        } else if( ch == 'B'){
            
             allow = 1500;
            
        } else {
            
             allow = 1300;
            
        }
         double totalSalary = basic + hra + da + allow - pf;
            System.out.println(Math.round(totalSalary));
            
            s.close();
	}

}
