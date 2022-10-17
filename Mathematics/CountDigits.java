package mathematics;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(countdigits(n));

	}
	
	public static int countdigits(int n) {
		
		int res = 0;
		
		while( n > 0) {
			n = n/10;
			res++;
		}
		
		return res;
		
	}

}

// The time complexity is O(d) where d is digits of number
