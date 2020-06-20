package For_loop;

import java.util.Scanner;

public class termsof_AP {

	public static void main(String[] args) {
	
				Scanner s = new Scanner(System.in);
		        int n = s.nextInt();
		        
		        for(int i = 1; i <= n; i++) {
		        	int sum = 3*i + 2;
		        	
		        		if(sum%4 == 0) {
		        			n++;
		        			continue;
		        		}
		        	System.out.println(sum);
		        }
		        s.close();
			}

		}
