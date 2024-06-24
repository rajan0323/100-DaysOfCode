//{ Driver Code Starts
import java.io.*;
import java.util.*;

  public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            System.out.println(new Solution().maxProduct(arr, n));
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        long sufix =1;
        long prefix= 1;
        long sum = Long.MIN_VALUE;
        for(int i =0;i<n;i++){
            if(sufix==0) sufix=1;
            if(prefix == 0) prefix =1;
            prefix *=arr[i]; 
            sufix*=arr[n-i-1];
            sum=Math.max(sum,Math.max(sufix,prefix));
        }
        return sum;
    }
}