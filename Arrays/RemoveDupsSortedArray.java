int remDups(int arr[], int n) {
  
  int tmp[] = new int[n];
  tmp[0] = arr[0];
  int res = 1;
  for(int i=1;i<n;i++) {
    if(tmp[res-1] != arr[i]) {
      tmp[res] = arr[i];
      res++;
    }
  }
  for(int i=0;i<res;i++) {
    arr[i] = tmp[i];
  }
  return res;
}
      
