// Naive approach
// Time Complexity is O(n)
int getMinimum(int arr[], int n) {
  int min = arr[0];
  for(int i=1;i<n;i++) {
    if(arr[i] < min ) {
      min = arr[i];
    }
  }
  return min;
}


// Optimized approach
// Time Complexity is O(logn)
  //Function to find the minimum element in sorted and rotated array.
    static int minNumber(int arr[], int low, int high)
    {
        // Your code here
           // Your code here

        if(arr[low]<arr[high]) return arr[low];

        while(low<=high)

        {

            int mid=(low+high)/2;

            if(arr[mid]>arr[high])

            low=mid+1;

            else

            {

                if(arr[mid-1]<arr[mid])

                high=mid-1;

                else return arr[mid];

            }

            

        }
        return -1;
    }
