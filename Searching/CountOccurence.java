// NAive approach
// Time complexity is O(n)

int Occurence(int arr[], int x) {

    int count = 0;

    for(int i = 0;i<arr.length;i++) {
        if(arr[i] == count) {
            count++;
        }
    }

    return count;
}

// Optimized way
// Time complexity is O(logn)
// make use of indexofFirstOcurence and indexofLastOccurence functions
int countOccurence(int arr[],int x) {

    int first = firstOccur(arr,x);

    if(first == -1) {
        return 0;
    }
    else {
        return (lastOccur(arr,x) - first + 1);
    }
}