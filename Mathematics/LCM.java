package mathematics;

import java.util.Scanner;

public class LCM {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		
		System.out.println(lcm(a,b));
//		System.out.println(isPrime2(n));
	}
	
	public static int lcm(int a, int b) {
		
		int res = Math.max(a, b);
		
		while(true) {
			if(res%a ==0 && res%b == 0) {
				return res;
			}
			res++;
		}
		return res;
	}
	

}
