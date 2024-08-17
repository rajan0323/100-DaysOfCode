//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = sc.nextInt();
            }
            Solution ob = new Solution();
            long[] ans = new long[n];
            ans = ob.productExceptSelf(array);

            for (int i = 0; i < n; i++) {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
            t--;
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public static long[] productExceptSelf(int nums[]) {
        int n = nums.length;
        long[] ans = new long[n];
        
        // Step 1: Calculate the product of all non-zero elements
        long totalProduct = 1;
        int zeroCount = 0;
        
        for (int num : nums) {
            if (num == 0) {
                zeroCount++;
            } else {
                totalProduct *= num;
            }
        }
        
        // Step 2: Fill the answer array based on the number of zeros
        for (int i = 0; i < n; i++) {
            if (zeroCount > 1) {
                ans[i] = 0; // More than one zero means all products are zero
            } else if (zeroCount == 1) {
                ans[i] = (nums[i] == 0) ? totalProduct : 0; // Only one zero
            } else {
                ans[i] = totalProduct / nums[i]; // No zeros in the array
            }
        }
        
        return ans;
    }
}
