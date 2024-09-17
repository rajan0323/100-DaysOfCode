//{ Driver Code Starts
import java.io.*;
import java.util.*;

class IntArray {
    public static int[] input(BufferedReader br, int n) throws IOException {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int N;
            N = Integer.parseInt(br.readLine());

            int[] A = IntArray.input(br, N);

            Solution obj = new Solution();
            int res = obj.minimumInteger(N, A);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int minimumInteger(int N, int[] A) {
       int x  =Integer.MAX_VALUE;
      long s = 0;
       for(int i =0;i<A.length;i++){
           s +=A[i];
       }
       for(int i =0;i<A.length;i++){
           if(s <= (long)N*A[i]){
               x = Math.min(x,A[i]);
           }
       }
       return x;
    }
}
