//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            String T = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.checkCompressed(S,T));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int checkCompressed(String S, String T) {
       int n = 0;
       int j = 0;
       for(int i= 0;i<T.length();i++){
           char c = T.charAt(i);
           if(c>='0'&&c<='9'){
               n =n*10+c-'0';
               j--;
           }else{
               j= j+n;
               if(S.charAt(j)!=c)
               return 0;
               n=0;
           }
           j++;
       }
       j= j+n;
       if(S.length()!=j)
           return 0;
           
       return 1;
    }
}