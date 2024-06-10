//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            inputLine = br.readLine().trim().split(" ");
            int l = Integer.parseInt(inputLine[0]);
            int r = Integer.parseInt(inputLine[1]);

            new Solution().reverseSubArray(arr, n, l, r);
            for (int i = 0; i < n; i++) {
                out.print(arr[i] + " ");
            }
            out.println();
        }
        out.close();
    }
}

// } Driver Code Ends


//User function Template for Java



class Solution {
    void reverseSubArray(int arr[], int n, int l, int r) {
        int temp;
        while(l < r){
            temp=arr[l-1];
            arr[l-1]=arr[r-1];
            arr[r-1]=temp;
            l++;
            r--;
             
         }
    }
}