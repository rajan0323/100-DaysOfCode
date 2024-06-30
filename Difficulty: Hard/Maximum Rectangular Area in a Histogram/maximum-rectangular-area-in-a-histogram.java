//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    long n = Long.parseLong(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[(int)n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    System.out.println(new Solution().getMaxArea(arr, n));
		}
	}
}




// } Driver Code Ends


class Solution
{
    //Function to find largest rectangular area possible in a given histogram.
    public static long getMaxArea(long hist[], long n) 
    {
      long[] rig  = new long[(int)n];
       long[] lef  = new long[(int)n];
       Stack<Integer> sb = new Stack<>();
       for(int i=(int)n-1;i>=0;i--){
           while(!sb.isEmpty()&&hist[sb.peek()]>=hist[i]){
               sb.pop();
           }
           rig[i] = sb.isEmpty() ? n:sb.peek();
           sb.push(i);
       }
       sb.clear();
       for(int i=0;i<n;i++){
           while(!sb.isEmpty()&&hist[sb.peek()]>=hist[i]){
               sb.pop();
           }
           lef[i] = sb.isEmpty()?-1:sb.peek();
           sb.push(i);
       }
      long max = Integer.MIN_VALUE;
      for(int i = 0;i<n;i++){
          long width = rig[i]-lef[i]-1;
          long area = width*hist[i];
          max = Math.max(max, area);
      }
      return max;
    }
        
}



