//{ Driver Code Starts
// Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int t = Integer.parseInt(in.readLine().trim());
        while (t-- > 0) {
            String line = in.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            int key = Integer.parseInt(in.readLine().trim());
            Solution ob = new Solution();
            out.println(ob.kthSmallest(arr, key));
        }
        out.flush();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public static int kthSmallest(int[] arr, int k) {
    PriorityQueue<Integer> ans = new PriorityQueue<>();
    for(int i:arr){
        ans.add(i);
    }
    for(int i =0;i<k-1;i++){
        ans.remove();
    }
    return ans.peek();
    }
}
