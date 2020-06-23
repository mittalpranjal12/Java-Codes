package For_loop;

import java.util.Scanner;

public class check_number_sequence {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = 0;
        int num [] = new int [n];
        
        for(int i = 0; i<n; i++) {
        	num[i] = s.nextInt();
        }
        
        for(int i = 0; i< n - 1; i++) 
        {
        	if(count == 0) 
        	{
        		if(num[i]<num[i + 1])
        		{
        			count++;
        		}
        	}
        	else if(count == 1)
        	{
        		if(num[i]>= num[i + 1])
        		{
        			count++;
        		}
        	}
        	else if(count > 1) 
        	{
        		break;
        	}
        }
        
        if(count == 0 || count == 1) {
        	System.out.println(true);
        }else {
        	System.out.println(false);
        }
        s.close();
	}

}
