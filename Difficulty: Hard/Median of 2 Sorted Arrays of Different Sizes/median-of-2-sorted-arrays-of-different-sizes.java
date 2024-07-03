//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Driver
{
    public static void main(String args[]) 
	{ 
	    Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int []a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            
            int  m= sc.nextInt();
            int []b = new int[m];
            for (int i = 0; i < m; i++) b[i] = sc.nextInt();
            
            double res = new GFG().medianOfArrays(n, m, a, b);
            
            if (res == (int)res) System.out.println ((int)res);
            else System.out.println (res);
        }
    		
	} 
}
// } Driver Code Ends


//User function Template for Java

class GFG 
{ 
  static double medianOfArrays(int n, int m, int a[], int b[]) 
    {
       int[] ans = merge(a,b);
       if(ans.length%2==0){
           double ans1 =(double)(ans[ans.length/2]+ans[(ans.length/2)-1])/2;
           return ans1;
       }else{
           double ans1 =(double)(ans[ans.length/2]);
           return ans1;
       }
       
    }
  static int[] merge(int[] arr1,int[]arr2){
        int[] ans = new int[arr1.length+arr2.length];
        int p1=0;
        int p2=0;
        int p3=0;
        while(p1<arr1.length||p2<arr2.length){
            int val1= p1<arr1.length?arr1[p1]:Integer.MAX_VALUE;
            int val2= p2<arr2.length?arr2[p2]:Integer.MAX_VALUE;
            if(val1<=val2){
                ans[p3]=val1;
                p1++;
            }else{
                ans[p3]=val2;
                p2++;
            }
            p3++;
        }
        return ans;
    }
}