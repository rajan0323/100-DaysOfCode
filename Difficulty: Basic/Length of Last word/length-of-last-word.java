//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String s = read.readLine();
            Solution ob = new Solution();
            int ans = ob.findLength(s);
            System.out.println(ans);
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    int findLength(String s) 
    { 
        int count = 0;
        for(int i = s.length()-1;i>=0;i--){
            char ch = s.charAt(i);
            if(ch !=' '){
                count++;
            }else if(count !=0) 
            break;
        }
        return count;
    }
}