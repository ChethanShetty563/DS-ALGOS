// Naive Solution

int findOddOccur(int arr[], int n) {
  for(int i=0;i<n;i++) {
    int count = 0;
    for(int j=0;j<n;j++) {
      if(arr[i] == arr[j] {
        count ++;
      }
   }
         if(count % 2 != 0){
           return arr[i];
         }
 }
         
//  Efficient Solution
int findOdd(int arr[],int n) {
  int res = arr[0];
  for(int i=0;i<n;i++) {
    res =res^arr[i];
  }
  return res;
}
         
