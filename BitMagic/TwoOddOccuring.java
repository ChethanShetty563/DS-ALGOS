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
