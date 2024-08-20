//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {

            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Long> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Long.parseLong(token));
            }

            long[] arr = new long[array.size()];
            int idx = 0;
            for (long i : array) arr[idx++] = i;

            Solution obj = new Solution();

            // calling maxSubarraySum() function
            System.out.println(obj.equilibriumPoint(arr));
        }
    }
}

// } Driver Code Ends


class Solution {
    // arr: input array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[]) {
        if(arr.length==1) return 1;
        long[] right = new long[arr.length];
        int k =0;
        for(int i =0;i<arr.length;i++){
         k += arr[i];
         right[i]=k;
        }
        long[] left = new long[arr.length];
        int l =0;
        for(int i =arr.length-1;i>=0;i--){
         l += arr[i];
         left[i]=l;
        }
        for(int i =0;i<arr.length;i++){
            if(right[i]-left[i]==0){
                return i+1;
            }
        }
        return -1;
    }
}
