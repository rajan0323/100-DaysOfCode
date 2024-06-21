//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.findPosition(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int findPosition(int N) {
        int i = 0;
        int count = 0;
        int position = -1;  // To store the position of the set bit

        // Iterate through all 32 bits of the integer
        while (i < 32) {
            int bitmask = 1 << i; // Create a bitmask with only the ith bit set
            int ans = N & bitmask; // Use bitwise AND to check if the ith bit is set

            if (ans > 0) {
                count++;  // Increment count of set bits
                position = i + 1; // Update position (1-based index)
            }

            // If more than one set bit is found, we can return -1 immediately
            if (count > 1) {
                return -1;
            }

            i++;
        }

        // If exactly one set bit is found, return its position
        if (count == 1) {
            return position;
        }

        // If no set bits are found, return -1
        return -1;
    }
}
