//{ Driver Code Starts

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.waysToBreakNumber(N));
        }
    }
}
// } Driver Code Ends



class Solution {
    int waysToBreakNumber(int N) {
        long mod = 1000000007;
        long ans = (((N + 1) % mod) * ((N + 2) % mod)) % mod;
        ans = (ans * 500000004) % mod; // Multiply by modular inverse of 2
 
        return (int) ans;
    }
}
