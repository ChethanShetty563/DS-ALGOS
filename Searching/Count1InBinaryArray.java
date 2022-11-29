
// The time complexity will be O(x) where x = number of 1's
public static int countOnes(int arr[], int N){
        
        // Your code here
        int count = 0;
        for(int i=0;i<N;i++) {
            if(arr[i] == 0) {
                break;
            }
            count++;
        }
        return count;
    }

public static int countOnes(int arr[], int N){
        
    int low = 0;
    int high = N ;
    
    while(low <high) {
        
        int mid = (low + high)/2;
        
        if(arr[mid] == 1) {
            low = mid + 1;
            
        }
        else {
            high = mid ;
        }
        
        
    }
    
    return high;
    }

public static int countOnes(int arr[], int N){
    int index = -1;
    int low = 0;
    int high = N ;
    
    while(low <high) {
        
        int mid = (low + high)/2;
        
        if(arr[mid] == 1) {
                index = mid;
            low = mid + 1;
            
        }
        else {
            high = mid ;
        }
        
        
    }
    
    return index + 1;
    }
        
        
