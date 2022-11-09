int getLArgest(int arr[]) {
  int res = 0;
  for(int i=1;i<=n;i++) {
    if(arr[res] < arr[i]) {
      res = i;
    }
  }
  return res;
}
