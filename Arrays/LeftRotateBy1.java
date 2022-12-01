// Time complexity is O(n) and space is O(1)

void leftRotate(int arr[], int n) {
  int temp = arr[0];
  for(int i=0;i<n-1;i++) {
    arr[i]= arr[i+];
  }
  arr[n-1] = temp;
}

