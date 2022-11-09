// Naive method
// Time complexity is O(n^2) and Auxiliry space is O(1)
boolean isSorted(int arr[], int n) {
  for(int i=0;i<n;i++) {
    for(int j=i+1;j<n;j++) {
      if(arr[i] < arr[j]) {
        return false;
      }
    }
  }
  return true;
  }

// Efficient Solution
// Time complexity is O(n) and and Auxiliry space is O(1)
boolean isSorted(int arr[]) {
   for(int i=1;i<arr.length;i++) {
     if(arr[i]< arr[i-1]) {
       return false;
     }
   }
  return true;
}
  
