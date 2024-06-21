//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int i = sc.nextInt();

            Solution obj = new Solution();
            obj.bitManipulation(n, i);
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static void bitManipulation(int num, int i) {
        int kal = 0;
        int bm = 1<<(i-1);
        int get = num & bm;
        if(get>0){
           kal = 1; 
        }
        int set = num |bm;
        int k = ~(bm);
        int clear = num &k;
         System.out.print(kal+" "+set+" "+clear);
        
    }
}
