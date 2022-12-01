// Time complexity is O(n) and space is O(1)
// The below progrm is to left rotate by 1 time
void leftRotateByOne(int arr[], int n) {
  int temp = arr[0];
  for(int i=0;i<n-1;i++) {
    arr[i]= arr[i+];
  }
  arr[n-1] = temp;
}

// The below program is to rotate by D times by making use of above method
// The time complexity is O(n*d) and space O(n)
void leftRotate(int arr[], int n, int d) {
  for(int i=0;i<d;i++){
    leftRotateByOne(arr,n);
  }
}

