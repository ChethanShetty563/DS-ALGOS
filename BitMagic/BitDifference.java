//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


// } Driver Code Ends
//User function Template for Java

class Solution{
    
    // Function to find number of bits needed to be flipped to convert A to B
    public static int countBitsFlip(int a, int b){
        
        // Your code here
             // Your logic here
       int x = a^b;
       int count = 0;
       
       while( x > 0 ) {
           if((x&1) == 1) {
               count++;
           }
           x = x >> 1;
       }
       return count;
        
    }
    
    
}


//{ Driver Code Starts.

// Driver class
class Main {
    
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();//testcases
		int m, n;
		long ans = 0; // initialise ans to 0
		while(t-->0) {
		    
		    //input m and n
		    m = sc.nextInt();
		    n = sc.nextInt();
		    Solution obj = new Solution();
		    System.out.println(obj.countBitsFlip(m, n));
		}
	}
}


// } Driver Code Ends
