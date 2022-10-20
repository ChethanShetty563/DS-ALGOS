package mathematics;

import java.util.Scanner;

public class GCDorHCF {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		
		System.out.println(gcd1(a,b));
//		System.out.println(isPrime2(n));

	}
	
//	The time complexity in best case is O(1)
//	In worst case O(min(a,b)
	
	public static int gcd1(int a, int b) {
		int res = Math.max(a, b);
		
		while(res > 0) {
			if(a % res ==0 && b % res == 0) {
				break;
			}
			res--;
		}
		return res;
	}
	
//	Euclid Algorithm
	
	public static int gcd2(int a, int b) {
		if(b == 0) {
			return a;
		}
		else {
			return gcd2(b, a%b);
		}
	}
	
	

}
