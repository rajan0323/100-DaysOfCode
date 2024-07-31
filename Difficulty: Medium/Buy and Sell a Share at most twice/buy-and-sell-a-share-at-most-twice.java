//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);
        
        return a;
    }
    
    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
    
    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0){
            
            int n; 
            n = Integer.parseInt(br.readLine().trim());
            
            
            int[] price = IntArray.input(br, n);
            
            Solution obj = new Solution();
            int res = obj.maxProfit(n, price);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int maxProfit(int n, int[] price) {
        if (n == 0) return 0;
        
        int[] left = new int[n];
        int[] rig = new int[n];

      
        int min = price[0];
        left[0] = 0;
        for (int i = 1; i < n; i++) {
            if (min > price[i])
                min = price[i];
            int profit = price[i] - min;
            left[i] = Math.max(profit, left[i - 1]);
        }

    
        int max = price[n - 1];
        rig[n - 1] = 0;
        for (int i = n - 2; i >= 0; i--) {
            if (max < price[i])
                max = price[i];
            int profit = max - price[i];
            rig[i] = Math.max(profit, rig[i + 1]);
        }

        
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, rig[i] + left[i]);
        }

        return ans;
    }
}
