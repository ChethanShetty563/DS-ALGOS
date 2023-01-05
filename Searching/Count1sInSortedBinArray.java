// NAive approach
// Time complexity is O(n)
int count1InBinaryArray(int arr[], int n) {

    for(int i=0;i<arr.length;i++) {
        if(arr[i] == 1) {
            return n - i;
        }
    }

    return 0;
}

// Optimized way
// Time Complxity is O(logn)
// Binary search . It is same as the first Occurence of a number
int count1InBinaryArray(int arr[], int n) {
    int low = 0;
    int high = arr.length - 1;
    while(low<=high) {

        int mid = (low + high )/2;

        if(arr[mid] == 0) {
            low = mid + 1;
        }
        else {
            if(mid == 0 || arr[mid - 1] != arr[mid]) {
                return n - mid;
            }
            else {
                high = mid - 1;
            }
        }
    }
    return -1;
}