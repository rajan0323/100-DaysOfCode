//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String S[] = read.readLine().split(" ");
            
            ArrayList<Integer> arr = new ArrayList<>();
            
            for(int i=0 ; i<N ; i++)
                arr.add(Integer.parseInt(S[i]));

            Solution ob = new Solution();
            ArrayList<Integer> res = ob.increment(arr,N);
            
            for(int i=0; i<res.size(); i++)
                System.out.print(res.get(i) + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static ArrayList<Integer> increment(ArrayList<Integer> arr , int N) {
        ArrayList<Integer> ans = new ArrayList<>();
        int carry =1;
        for(int i= arr.size()-1;i>=0;i--){
            int sum = arr.get(i)+carry;
            ans.add(sum%10);
            carry = sum /10;
         }
         while(carry>0){
             ans.add(carry%10);
             carry/= 10;
         }
           ArrayList<Integer> ans1 = new ArrayList<>();
       for(int j= ans.size()-1;j>=0;j--){
           ans1.add(ans.get(j));
       }
       return ans1;
    }
};