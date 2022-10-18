package mathematics;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(itFact(n));
		System.out.println(recFact(n));

	}
	
/**
 * Using iterative method
 * Time complexity will be O(n)
 * Space complexity is O(1)
 * */
	
	public static int itFact(int n) {
		
		if(n == 0) {
			return 1;
		}
		int res = 1;
		
		for(int i=2;i <=n;i++) {
			res = res * i;
		}
		return res;
		
		
	}
	
	/**
	 * Using recursion
	 * Time complexity is O(n)
	 * Space complexity is O(n)
	 * */
	
	public static int recFact(int n) {
		if(n == 0) {
			return 1;
		}
		
		return recFact(n - 1) * n;
	}

}
