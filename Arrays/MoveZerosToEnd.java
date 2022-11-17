/*
* Naive Solution
* Time Complexity is O(n^2) and Auxiliary space is O(1)
*/

void moveZeros(int arr[], int n) {
  for(int i=0;i<n;i++) {
    if(arr[i] == 0) {
      for(int j=i+1;j<n;j++) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
  }
}

// Another Solution
//  The time complexity is O(n) but Auxiliry space is also O(n)
 void pushZerosToEnd(int[] arr, int n) {
        // code here
        int res[] = new int[n];
        int count = 0;
        for(int i=0;i<n;i++) {
            if(arr[i] != 0) {
                res[count++] = arr[i];
            }
        }
        for(int i=count;i<n;i++) {
            res[i] = 0;
        }
         for(int i=0;i<n;i++) {
            arr[i] = res[i];
        }
    }

