//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int N = sc.nextInt();
            int M[][] = new int[N][N];
            for(int i=0; i<N; i++)
            {
                for(int j=0; j<N; j++)
                {
                    M[i][j] = sc.nextInt();
                }
            }
            System.out.println(new Solution().celebrity(M,N));
            t--;
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java


class Solution{
    private boolean know(int M[][],int a,int b, int n){
        if(M[a][b]==1){
            return true;
        }else{
            return false;
        }
    }
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {
        
      Stack<Integer> sc = new Stack<>();
      for(int i =0;i<n;i++){
          sc.push(i);
      }while(sc.size()>1){
          int a = sc.peek();
          sc.pop();
          int b = sc.peek();
          sc.pop();
          if(know(M,a,b,n)){
              sc.push(b);
          }else{
              sc.push(a);
          }
      }
       int ans = sc.pop();
       int zero =0;
       for(int i =0;i<n;i++){
       if(M[ans][i]==0){
           zero++;
       }
       }if(zero!=n){
           return -1;
       }int one =0;
       for(int i =0;i<n;i++){
       if(M[i][ans]==1){
           one++;
       }
       }if(one!=n-1){
           return -1;
       }
      return ans;
    }
}