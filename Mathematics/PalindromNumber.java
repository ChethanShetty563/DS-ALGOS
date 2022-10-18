package mathematics;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(isPal(n));

	}
	
	public static boolean isPal(int n) {
		int res =0;
		int temp = n;
		while(temp !=0) {
			int rem = temp %10;
			res = res * 10 + rem;
			temp = temp / 10;
		}
		return n==res;
	}

}

// The time complexity is O(d) where d is digits in n
