//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    int n=sc.nextInt();
                    Solution obj = new Solution();
                    System.out.println(obj.convert(s,n));
                }
                
        }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    String convert(String s, int n) {
        if (n == 1) return s;

        StringBuilder[] ans = new StringBuilder[n];
        for (int i = 0; i < n; i++) {
            ans[i] = new StringBuilder();
        }

        int ind = 0;
        while (ind < s.length()) {
            for (int i = 0; i < n && ind < s.length(); i++) {
                ans[i].append(s.charAt(ind++));
            }
            for (int j = n - 2; j > 0 && ind < s.length(); j--) {
                ans[j].append(s.charAt(ind++));
            }
        }

        StringBuilder res = new StringBuilder();
        for (int i = 0; i < n; i++) {
            res.append(ans[i]);
        }

        return res.toString();
    }
}
