int getCount(int arr[], int n, int sum) {
  if(n == 0)
  {
    return (sum == 0) ? 1: 0;
  }
  
  return getCount(arr, n-1,sum) + getCount(arr, n-1,sum -arr[n-1]);
}
