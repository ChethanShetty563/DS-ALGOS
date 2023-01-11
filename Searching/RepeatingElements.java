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
