//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG 
{
    public static void main(String args[]) throws IOException 
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            int n = Integer.parseInt(read.readLine());
            String input[] = read.readLine().split(" ");
            
            int arr[] = new int[n];
            for(int i = 0;i<n;i++){
                arr[i] = Integer.parseInt(input[i]);
            }
            
            Solution ob = new Solution();
            System.out.println(ob.countTriplet(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int countTriplet(int arr[], int n) {
        int count = 0;
        
       
        Arrays.sort(arr);
        
      
        for (int i = n - 1; i >= 2; i--) {
            int left = 0;
            int right = i - 1;
          
            while (left < right) {
                int sum = arr[left] + arr[right];
                
                if (sum == arr[i]) {
                    count++;
                    left++;
                    right--;
                } else if (sum < arr[i]) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        
        return count;
    }
}
