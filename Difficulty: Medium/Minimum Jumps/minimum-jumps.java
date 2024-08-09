//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int size = Integer.parseInt(br.readLine());
            String[] arrStr = ((String)br.readLine()).split("\\s+");
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = Integer.parseInt(arrStr[i]);
            }
            System.out.println(new Solution().minJumps(arr, size));
        }
    }
}

// } Driver Code Ends


class Solution {
    static int minJumps(int[] arr, int n) {
        // If the first element is 0 and n > 1, it's not possible to jump
        if (n== 1) {
            return 0;
        }
        else if(arr[0] == 0){
        return -1;
        }
        // Initialize maximum reach, steps possible with current jumps, and jumps count
        int maxReach = arr[0];
        int steps = arr[0];
        int jumps = 1;
        
        for (int i = 1; i < n; i++) {
            // If we have reached the end of the array
            if (i == n - 1) {
                return jumps;
            }
            
            // Update the maximum reach
            maxReach = Math.max(maxReach, i + arr[i]);
            
            // Use a step to move forward
            steps--;
            
            // If no more steps left
            if (steps == 0) {
                jumps++;
                
                // Check if the current index/position is beyond the maximum reach
                if (i >= maxReach) {
                    return -1;
                }
                
                // Reinitialize steps to the amount of steps to reach maxReach from position i
                steps = maxReach - i;
            }
        }
        
        return -1; // If we never reach the end
    }
}
