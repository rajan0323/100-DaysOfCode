//{ Driver Code Starts
//Initial Template for Java

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
            String s = read.readLine().trim();

            Solution ob = new Solution();
            System.out.println(ob.longestUniqueSubsttr(s));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution{
    int longestUniqueSubsttr(String s){
        HashSet<Character> st = new HashSet<>();
        int left =0;
        int right = 0;
        int max = 0;
        while(right < s.length()){
            char r  = s.charAt(right);
            if(st.add(r)){
             max = Math.max(max, right-left+1);
                right++;
            }else{
                while(r!=s.charAt(left)){
                    st.remove(s.charAt(left));
                    left++;
                }
                st.remove(s.charAt(left));
                left++;
            }
        }
        return max;
    }
}