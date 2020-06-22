package For_loop;

import java.util.Scanner;

public class square_root_integral {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
	
		int ans = 0;
		int i = 0;
		
		while(ans <= n) {
			i++;
			
			ans = i*i;
			
		}
		i--;
		
		System.out.println(i);
		s.close();
	}

}
