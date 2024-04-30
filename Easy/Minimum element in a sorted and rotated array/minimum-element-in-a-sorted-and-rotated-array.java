//{ Driver Code Starts
//Initial Template for Java

import java.util.*;

public class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n = sc.nextInt();
            int A[] = new int[n];
            
            for (int i = 0;i < n;i++)
            {
                A[i] = sc.nextInt();
            }
            
            Solution sol = new Solution();
            System.out.println(sol.findMin(A, n));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    int findMin(int arr[], int n)
    {
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(mid!=0&&arr[mid]<arr[mid-1]){
                return arr[mid];
            }else if(mid!=arr.length-1&&arr[mid]>arr[mid+1]){
                return arr[mid+1];
            }else if(arr[start]<=arr[mid]){
                start= mid+1;
            }else{
                end= mid-1;
            }
        
        }
       return arr[0];
    }
}
