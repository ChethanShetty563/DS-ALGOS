
// Iterative Solution

int bsearch(int arr[], int x, int n) {
  int low = 0;
  int high = n - 1;
  
  while(low < high)
  {
    int mid = (high + low) / 2;
    
    if(arr[mid] == x) {
      return mid;
    }
    else if(arr[mid] > x) {
      high = mid -1;
    }
    else {
      low = mid +1 ;
    }
    return -1;
  }
  
//   Recursive solution
  
  int bsearchr(int arr[], int low, int high, int x ) {
    if(low >= high) {
      return -1;
    }
    int mid = (low + high) /2;
    if(arr[mid] == x) {
      return mid;
    }
    
    else if(arr[mid] >x) {
      bsaerch(arr,low,mid-1,x);
    }
    else {
      bsaerch(arr,mid+1,high,x);
    }
  }
      
    
    
  
