// Super naive Solutions
// time complxity is O(n^2) and space is O(1)

int getRepeatingElement(int arr[], int n) {
  for(int i=0;i<n-1;i++) {
    for(int j=i+1;j<n;j++) {
      if(arr[i] == arr[j] )
        return arr[i];
    }
  }
}
return -1;
}

// NAive Approach
// Time Complxity is O(nlogn) and space complexity O(1)

int getRepeatingElement(int arr[], int n) {
  Arrays.sort(arr);
  for(in i=0;i<n-1;i++){
    if(arr[i] == arr[i+1]) {
      return arr[i];
    }
  }
  return -1;
}

// Efficient Approach
// Time Complexity O(n) and O(n)

int getRepeatingElements(int arr[], int n) {
  boolean temp[] = new boolean[n];
  
  for(int i=0;i<n;i++) {
    temp[i] = false;
  }
  
  for(int i=0;i<n;i++) {
    if(temp[arr[i]]) {
      return arr[i];
    }
    temp[arr[i]] = true;
  }
}

// Optimized approach
// Time Complexity O(n) and space O(1)
int getRepeatingElements(int arr[], int n) {
  int slow = arr[0];
  int fast = arr[0];
  
  do {
    slow = arr[slow];
    fast = arr[arr[fast]];
  }
  while(slow != fast)
    slow = arr[0];
  
  while(slow != fast) {
    slow = arr[slow];
    fast = arr[fast];
  }
  
  return slow;
}

  
