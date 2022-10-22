package arrays;

public class delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3};
		System.out.println(deleteEle(arr, 3, 2));

	}
	
	public static int deleteEle(int arr[], int n, int x) {
		
		int i;
		for(i=0;i<n;i++) {
			if(arr[i] == x) {
				break;
			}
		}
		
		if(i == n) {
			return n;
		}
		
		for(int j=i;j<n-1;j++) {
			arr[j] = arr[j+1]; 
		}
		return n -1;
	}

}
