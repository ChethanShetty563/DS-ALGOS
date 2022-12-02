// The time complexity is O(n^2)

void leaders(int arr[], int n) {
  for(int i=0;i<n;i++) {
    boolean flag = false;
    for(int j=i+1;j<n;j++) {
      if(arr[i] <= arr[j] {
        flag = true;
        break;
      }
         }
         if(flag = false){
           System.out.println(arr[i])
           }
         }
         
// The time complexity is O(n) and space is O(1)         
         
 void leaders(int arr[], int n) {
   
   int curr_ldr = arr[n-1];
   System.out.println(curr_ldr);
   
   for(int i = n -2;i>=0;i--) {
     if(curr_ldr < arr[i]) {
       curr_ldr = arr[i];
        System.out.println(curr_ldr);
     }
   }
 }
       
         
      
