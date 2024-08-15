//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            Solution obj = new Solution();
            boolean ans = obj.lemonadeChange(n, a);
            System.out.println(ans ? "True" : "False");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static boolean lemonadeChange(int N, int bills[]) {
        int five = 0;
        int ten  =0;
        for(int i =0;i<N;i++){
            if(bills[i]==5){
                five++;
            }else if(bills[i]==10){
                

                if(five==0){
                    return false;
                }
                    five--;
                    ten++;
                
            }else if(bills[i]==20){
                if(five>0 && ten>0){
                    ten--;
                    five--;
                }else if(five>=3){
                    five-=3;
                }else {
                    return false;
                }
            }
        }
        return true;
    }
}
