//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.Map.Entry;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Solution g = new Solution();
            ArrayList<Integer> ans = g.duplicates(a, n);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
      ArrayList<Integer> ans = new ArrayList<>();
       int[] rec = new  int[n];
       for(int i=0;i<n;i++){
           int temp = arr[i];
           rec[temp]++;
       }
           
       for(int i =0;i<n;i++){
       if(rec[i]>1){
           ans.add(i);
           
       }
       }
        if (ans.isEmpty()) {
            ans.add(-1);
        }
       
       
       
       return ans;
    }
}
