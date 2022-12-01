// Time complexity is O(n) and space is O(1)
// The below progrm is to left rotate by 1 time
void leftRotateByOne(int arr[], int n) {
  int temp = arr[0];
  for(int i=0;i<n-1;i++) {
    arr[i]= arr[i+];
  }
  arr[n-1] = temp;
}

// The below program is to rotate by D times by making use of above method
// The time complexity is O(n*d) and space O(n)
void leftRotate(int arr[], int n, int d) {
  for(int i=0;i<d;i++){
    leftRotateByOne(arr,n);
  }
}

// The time complexity for this program is O(n) and space is O(d)

void leftRotate(int arr[], int n, int d){
  
  int temp[d];
  for(int i=0;i<d;i++) {
    temp[i] = arr[i];
  }
  
  for(int i=d;i<n;i++) {
    {
      arr[i-d] = arr[i];
    }
    
    for(int i=;i<d;i++){
      arr[n-d+i] =temp[i];
    }
  }
  
  // The time complexity for this program is O(2n) and space is O(1)
  
  void leftRotate(int arr[], int n, int d) {
    reverse(arr,0,d-1);
    reverse(arr,d,n-1);
    reverse(arr,0,n-1);
  }
  
  void reverse(int arr[], int low, int high) {
    while(low<high) {
      swap(arr[low], arr[high]);
      low++;
      high--;
    }
  }
    

  
  
  

