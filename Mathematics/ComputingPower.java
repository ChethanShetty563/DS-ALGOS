package mathematics;

public class ComputePower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int power(int n, int x) {
		
		if(n == 0) {
			return 1;
		}
		
		int temp = power(n/2, x);
		temp = temp * temp;
		if(n%2 == 0) {
			return temp;
		}
		else {
			return temp * x;
		}
		
	}

}
