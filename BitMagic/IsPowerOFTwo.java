// NAive Solution

boolean isPow2(int n) {
  if(n == 0 ) {
    return false;
  }
  
  while(n != 1) {
    if(n%2 != 0) {
      return false;
    }
    n =n /2;
  }
  return true;
}

// Efficient Solution
boolean isPow2(int n) {
  if(n == 0) {
    return false;
  }
  return ((n&(n-1) == 0);
          }
