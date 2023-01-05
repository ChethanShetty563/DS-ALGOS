// Naive approach
// The time complexity is O(pos) where pos = o=position of element

int search(int arr[], int x) {
    int i = 0;
    while(true) {
        if(arr[i] == x) {
            return i;
        }
        if(arr[i] > x) {
            return -1
        }
        i++;
    }
}

// Optimized approach
// Time Complexity O(log(pos))

int search(int arr[], int x) {
    if(arr[0] == 0) {
        return 0;
    }

    int  i = 1;
    while(arr[i] < x) {
        i = i * 2;
    }

    if(arr[i] == x) {
        return i;
    }

    return binarySearch(arr,x, i/2 + 1 , i - 1);
}