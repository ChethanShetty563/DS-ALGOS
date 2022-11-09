//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int a, b, c;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            Solution obj = new Solution();
            ArrayList<Integer> ans = obj.quadraticRoots(a, b, c);
            if (ans.size() == 1 && ans.get(0) == -1)
                System.out.print("Imaginary");
            else
                for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        // code here
       ArrayList<Integer> li = new ArrayList<>();
         double temp1=(Math.pow(b,2))-4*a*c;
         if(temp1<0){
            li.add(-1); //Imaginary
            return li;
         }
         temp1=Math.sqrt(temp1);
         double temp2=2*a;
         double result1=(-b+temp1)/temp2;
         double result2=(-b-temp1)/temp2;
         result1=(int)Math.floor(result1);
         result2=(int)Math.floor(result2);
         li.add((int)(Math.max(result1,result2)));
         li.add((int)(Math.min(result1,result2)));
         return li;
}
}
