int getsum(int n) {
  if(n==0) {
    return 0;
  }
 return n + getsum(n-1);
}
