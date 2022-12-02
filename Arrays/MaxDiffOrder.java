// The time complexity will be O(n^2)

int maxDiff(int arr[], int n) {
  int res = arr[1] - arr[0];
  for(int i=0;i<n-1;i++) {
    for(int j = i+1;j<n;j++) {
      res = Math.max(res, arr[j] - arr[i];
     }
  }
 return res;
 }
