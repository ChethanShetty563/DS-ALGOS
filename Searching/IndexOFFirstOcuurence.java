// Bruteforce approach
// Time complexity will be O(n)
// Space complexity will be O(1)

int firstOcc(int arr[], int x) {
  for(int i=0;i<arr.length;i++) {
    if(arr[i] == x) {
      return i;
    }
  }
  return -1;
}

// Optimized way
// Time complexity is log(n)
int firstOcc(int arr[], int low, int high,int x) {
  
  while(low > high) {
    int mid = (low + high) /2;
    if(x > arr[mid])
    {
      high = mid - 1;
    }
    else if(x < arr[mid])
    {
      low = mid + 1;
    }
    else {
      if(mid == 0 || arr[mid - 1] != arr[mid]) {
        return mid;
      }
      else {
        high = mid -1;
      }
    }
    return -1;
  }
      
