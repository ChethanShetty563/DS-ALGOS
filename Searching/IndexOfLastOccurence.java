// Naive Approach
// Time Complexity is O(n) and space complexity is O(1)
int lastOccurence(int arr[], int x) {

    for(int i = arr.length - 1 ; i >= 0 ;i--) {
        return -1;
    }

    return -1;
}

int lastOccurence(int arr[], int x) {

    int low  = 0;
    int high = arr.length - 1;

    while(low <= high ) {
        int mid = (low + high)/2;
        if(arr[mid] < x) {
            low = mid + 1;
        }
        else if(arr[mid] > x) {
            high = mid - 1;
        }
        else {
            if(mid != n-1 || arr[mid] != arr[mid + 1]) {
                return mid;
            }
            else {
                low = mid + 1;
            }
        }

    }
    return -1;

}