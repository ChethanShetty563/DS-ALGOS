// NAive Approach
// Time Complexity is sqrt(n)

int sqrtFloor(int x) {
    int i = 1;
    while(i*i <= x) {
        i++;
    }

    return i - 1;
}


// Optimized way
// Time Complexity is O(logn)
long floorSqrt(long X)
{
   // Your code here
   long low = 1;
   long high = X;
   long ans = -1;
   
   while(low <= high) {
       long mid = low + (high - low)/2;
       
       long midsq = mid * mid;
       
       if(midsq == X) {
           return mid;
       }
       else if (midsq > X) {
           high = mid - 1;
       }
       
       else {
           low = mid + 1;
           ans = mid;
       }
   }
   
   return ans;
}