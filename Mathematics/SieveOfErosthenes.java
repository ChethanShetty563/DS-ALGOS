package mathematics;

import java.util.Arrays;

public class SieveOfErosthenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sieve(10);

	}
	public static void sieve(int n) {
		// TODO Auto-generated method stub
		boolean arr[] = new boolean[n+1];
		Arrays.fill(arr, true);
		for(int i=2;i<=n;i++) {
			if(arr[i] == true) {
				System.out.println(i);
				for(int j=i*i;j<=n;j=j+i) {
					arr[j] =false;
				}
			}
		}

	}
	
	

}
