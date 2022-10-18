package mathematics;

import java.util.Scanner;

public class TrailingZeroFact {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(countZero(n));

	}
	
	/**
	 * Time Complexity is O(logn)
	 * Space Complexity O(1)
	 * */
	
	public static int countZero(int n) {
		
		int res = 0;
		for(int i=5;i<=n;i=i*5) {
			res = res + n/i;
		}
		return res;
		
		
	}

}
