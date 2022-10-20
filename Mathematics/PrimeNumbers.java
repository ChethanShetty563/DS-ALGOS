package mathematics;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(isPrime1(n));
		System.out.println(isPrime2(n));
		System.out.println(isPrime3(n));

	}
	
//The time complexity is O(n)
	
	public static boolean isPrime1(int n) {
		
		if(n == 1 ) {
			return false;
		}
		
		for(int i=2;i<n;i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	
//	The time complexity is sqrt(n)
//	EX : 30 : (1,30) (2,15)(3,10)
//	if(x,y) is pair then x *y =n
//	and if (x <= y) then x*x <= n x<= sqrt(n)
	
	
	public static boolean isPrime2(int n) {
		
		if(n == 1 ) {
			return false;
		}
		
		for(int i=2;i*i<=n;i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}
	
//	This method will save many iteration
	
	
	public static boolean isPrime3(int n) {
		
		if(n == 1 ) {
			return false;
		}
		
		if(n ==2 || n == 3) {
			return true;
		}
		
		if(n%2 == 0|| n % 3 == 0 ) {
			return false;
		}
		
		for(int i=5;i*i<=n;i = i+6) {
			System.out.println("Iteration");
			if(n%i == 0 || n% (i+2) == 0) {
				return false;
			}
		}
		return true;
	}
	
	
	

}
