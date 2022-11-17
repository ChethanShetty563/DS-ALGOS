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

