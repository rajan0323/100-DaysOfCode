//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String S = in.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.maxLength(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int maxLength(String s){
        int max = 0;
        Stack<Integer> sc = new Stack<>();
        sc.push(-1);
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)=='('){
                sc.push(i);
            }else{
                sc.pop();
            }
            if(sc.isEmpty()){
                sc.push(i);
        }
            max = Math.max(max,i-sc.peek());
        }
        return max;
    }
}