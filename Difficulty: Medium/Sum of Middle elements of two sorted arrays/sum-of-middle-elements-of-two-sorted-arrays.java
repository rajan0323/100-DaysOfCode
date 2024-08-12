//{ Driver Code Starts
// Initial Template for Java

import java.util.*;


// } Driver Code Ends
// User function Template for Java

class Solution {
    public int SumofMiddleElements(int[] arr1, int[] arr2) {
        int start = 0, mid1 = arr1.length/2, mid2 =mid1+1, end = arr1.length-1;
        int n = arr1.length;
        while(start <= end)
        {
            mid1 = (start+end)/2;
            mid2 = n-mid1;
            int left1 = (mid1 == 0) ? Integer.MIN_VALUE : arr1[mid1 - 1];
            int left2 = (mid2 == 0) ? Integer.MIN_VALUE : arr2[mid2 - 1];
            int right1 = (mid1 == n) ? Integer.MAX_VALUE : arr1[mid1];
            int right2 = (mid2 == n) ? Integer.MAX_VALUE : arr2[mid2];
            if(left1 <= right2 && left2 <= right1)
            {
                return (int)(Math.max(left1, left2)+Math.min(right1, right2));
            }
            else if(left1 > right2) end = mid1 - 1;
            else start = mid1 + 1;
        }
        return 0;
    }
}

//{ Driver Code Starts.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume newline
        while (t-- > 0) {
            String[] input1 = sc.nextLine().split(" ");
            int[] arr = new int[input1.length];
            for (int i = 0; i < input1.length; i++) {
                arr[i] = Integer.parseInt(input1[i]);
            }

            String[] input2 = sc.nextLine().split(" ");
            int[] brr = new int[input2.length];
            for (int i = 0; i < input2.length; i++) {
                brr[i] = Integer.parseInt(input2[i]);
            }

            Solution ob = new Solution();
            int res = ob.SumofMiddleElements(arr, brr);
            System.out.println(res);
        }
    }
}

// } Driver Code Ends