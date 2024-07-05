//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a, n);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solve {
    int[] findTwoElement(int arr[], int n) {
        int xor = 0;
        
        // Step 1: XOR all array elements and numbers from 1 to n
        for (int i = 0; i < n; i++) {
            xor ^= arr[i];
        }
        for (int i = 1; i <= n; i++) {
            xor ^= i;
        }
        
        // Step 2: Find a bit that is set in xor
        int setBit = xor & ~(xor - 1);
        
        // Step 3: Divide elements into two sets and XOR
        int x = 0, y = 0;
        for (int i = 0; i < n; i++) {
            if ((arr[i] & setBit) != 0) {
                x ^= arr[i];
            } else {
                y ^= arr[i];
            }
        }
        for (int i = 1; i <= n; i++) {
            if ((i & setBit) != 0) {
                x ^= i;
            } else {
                y ^= i;
            }
        }
        
        // Step 4: Determine which is the duplicate and which is the missing number
        int[] ans = new int[2];
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                ans[0] = x; // Duplicate
                ans[1] = y; // Missing
                break;
            } else if (arr[i] == y) {
                ans[0] = y; // Duplicate
                ans[1] = x; // Missing
                break;
            }
        }
        
        return ans;
    }
}
