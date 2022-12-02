 void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
    for(int i=0;i<n;i+=k){

          int l = i;

          int r = Math.min(i+k-1,n-1);

          while(l<r)

            Collections.swap(arr,l++,r--);

      }
    }
}
