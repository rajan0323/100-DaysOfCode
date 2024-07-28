//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
        	int[] array = new int[n];
        	for (int i=0; i<n ; i++ ) {
        		array[i] = sc.nextInt();
        	}
            Solution ob = new Solution();
            long[] ans = new long[n];
            ans = ob.productExceptSelf(array, n); 

           	for (int i = 0; i < n; i++) { 
				System.out.print(ans[i]+" ");
			} 
            System.out.println();
            t--;
        }
    } 
} 
  


// } Driver Code Ends


//User function Template for Java


class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
        long[] ans = new long[n];
        ans[0]= 1;
        for(int i =1;i<n ;i++){
           
            ans[i]= (long)(ans[i-1]* nums[i-1]);
        }
       long  suffix =1;
        for(int k =n-1;k>=0;k--){
            ans[k] = (long)(suffix*ans[k]);
            suffix = (long)(suffix*nums[k]);
        }
        return ans ;
	} 
} 
