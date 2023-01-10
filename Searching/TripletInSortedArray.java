// NAive Approach
// Time Complexity O(n^3)

boolean isTriplet(int arr[], int n, int x) {
  for(int i=0;i<n-2;i++) {
    for (int j=i+1;j<n-1;j++) {
      for(int k= j+1;k<n;k++) {
        if(arr[i] + arr[j] + arr[k] == x) {
          return true;
        }
      }
    }
  }
  return false;
}

// Optimized Approach
// Time Complexity O(n^2)

bool ispair(int arr[], int n) {
int i=0;
int j = n -1;
while(i<j) {
if(arr[i] + arr[j] == x) {
return true;
}
else if(arr[i] + arr[j] <x)
{
i++;
}
else {
j--;
}

return false;
}
  
  boolean isTriplet(int arr[], int n, int x) {
    for(int i=0i<n-2;i++){
      if(isPair(arr,x-arr[i],i+1) {
        return true;
      }
         return false;
         }
