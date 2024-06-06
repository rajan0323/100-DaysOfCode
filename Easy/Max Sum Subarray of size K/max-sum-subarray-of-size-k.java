//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            
            int N=sc.nextInt();
            int K=sc.nextInt();
            ArrayList<Integer> Arr = new ArrayList<Integer>(N); 
  
            // Appending new elements at 
            // the end of the list 
            for (int i = 0; i < N; i++) {
                int x = sc.nextInt();
                Arr.add(x); 
            }

            Solution ob = new Solution();
            System.out.println(ob.maximumSumSubarray(K,Arr,N));
        }
    }
}

// } Driver Code Ends


class Solution {
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr, int N) {
        long max = 0;
        long sum = 0;
        
        // Calculate the initial sum of the first K elements
        for (int i = 0; i < K; i++) {
            sum += Arr.get(i);
        }
        max = sum;

        // Slide the window and calculate the sum of each subarray
        for (int j = 1; j <= N - K; j++) { // Corrected the loop condition
            int prev = Arr.get(j - 1);
            int next = Arr.get(j + K - 1);
            sum = sum - prev + next;
            max = Math.max(max, sum);
        }

        return max;
    }
}
