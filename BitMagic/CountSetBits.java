// Naive Solution

int countSetBits(int n) {
  int count = 0;
  while(n > 0) {
    if((n&1) != 0) {
      count++;
    }
    n = n >>1;
  }
  return count;
}

// Brian kernigam's algorithm

int countSetBits(int n) {
  int count = 0;
  while(n > 0) {
    n = n &(n-1);
    res++;
  }
  return count;
}

// Lookup table solution

static int arr[] = new arr[256];

void initialize() {
  arr[0]= 0;
  for(int i=1;i<256;i++) {
    arr[i]= arr[i & (i-1)] + 1;
  }
}
int countSetBits(int n) {
  
  return arr[n&255] + arr[(n>>8)&255] + arr[(n>>16)&255] + arr[n>>24];
}
