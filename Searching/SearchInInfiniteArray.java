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