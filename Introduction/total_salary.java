//WAP to calculate the total salary of a person. The user has to enter the basic salary (an integer) and 
//the grade (an uppercase character), and depending upon which the total salary is calculated as -
   // totalSalary = basic + hra + da + allow – pf
// where :
// hra   = 20% of basic
// da    = 50% of basic
// allow = 1700 if grade = ‘A’
// allow = 1500 if grade = ‘B’
// allow = 1300 if grade = ‘C' or any other character
// pf    = 11% of basic.
//Round off the total salary and then print the integral part only.

package Introduction;

import java.util.Scanner;

public class total_salary {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        
		System.out.print("Enter the basic salary and a character: ");
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
            System.out.println("Total Salary: " + Math.round(totalSalary));
            
            s.close();
	}

}
