// Naive Approach
// Time Complexity O(n^2)

bool ispair(int arr[], int n, int x) {
  
  for(int i=0;i<n;i++) {
    for(int j=0;j<n;j++) {
      if(arr[i] + arr[j] == x)
      {
        return true;
      }
    }
  }
  return false
  }

// Naive Approach
// Time Complexity O(n)

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
